package com.company;

/**
 * A Main class that contains usage
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Handler get1 = new GetHandler(null, true);
        Handler get2 = new GetHandler(get1, false);
        Handler get3 = new GetHandler(get2, false);

        Handler post1 = new PostHandler(get3, true);
        Handler post2 = new PostHandler(post1, false);
        Handler post3 = new PostHandler(post2, false);

        Handler head1 = new HeadHandler(post3, false);
        Handler head2 = new HeadHandler(head1, true);
        Handler head3 = new HeadHandler(head2, false);

        head3.handleRequest(new Get());
        /*
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Обробка запиту Get об’єктом класу GetHandler
         */

        head3.handleRequest(new Head());
        /*
        Передача запиту --->>
        Обробка запиту Head об’єктом класу HeadHandler
         */

        head3.handleRequest(new Post());
        /*
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Передача запиту --->>
        Обробка запиту Post об’єктом класу PostHandler
         */

    }

}

