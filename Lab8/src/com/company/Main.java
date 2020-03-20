package com.company;

/**
 * A Main class that contains usage
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 20.03.2020
 */
public class Main {

    public static void main(String[] args) {

        DeeplyClonableComposite deeplyClonableComposite = new DeeplyClonableComposite();
        DeeplyCloneableLeaf deeplyCloneableLeaf = new DeeplyCloneableLeaf("type1");
        SimplyCloneableComposite simplyCloneableComposite = new SimplyCloneableComposite();
        SimplyCloneableLeaf simplyCloneableLeaf = new SimplyCloneableLeaf("type2");

        System.out.println(simplyCloneableLeaf.clone());
        System.out.println(simplyCloneableLeaf.clone());
        System.out.println(simplyCloneableLeaf.show());
        System.out.println("\n");

        System.out.println(deeplyClonableComposite.clone());
        System.out.println(deeplyClonableComposite.show());
        deeplyClonableComposite.addElement(simplyCloneableLeaf);
        deeplyClonableComposite.addElement(simplyCloneableComposite);
        System.out.println(deeplyClonableComposite.show());
        System.out.println(deeplyClonableComposite.clone());
        System.out.println("\n");

        System.out.println(deeplyCloneableLeaf.clone());
        System.out.println(deeplyCloneableLeaf.show());
        System.out.println("\n");

        System.out.println(simplyCloneableComposite.clone());
        System.out.println(simplyCloneableComposite.show());
        simplyCloneableComposite.addElement(simplyCloneableLeaf);
        simplyCloneableComposite.addElement(deeplyCloneableLeaf);
        System.out.println(simplyCloneableComposite.show());
        simplyCloneableComposite.removeElement(0);
        System.out.println(simplyCloneableComposite.show());

    }
}
