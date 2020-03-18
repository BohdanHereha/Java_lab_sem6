package com.company;

/**
 * The class which represents the handler of head request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class HeadHandler extends Handler {
    /**
     * The constructor of class HeadHandler.
     *
     * @param handler The successor.
     * @param status  The status of capability tp process a request.
     */
    public HeadHandler(Handler handler, boolean status) {
        this.setHandler(handler);
        this.setStatus(status);
    }

    @Override
    public void handleRequest(HTTPRequest request) {
        if (this.hasHandle(request) == true) {
            System.out.println("Обробка запиту Head об’єктом класу " + getClass().getSimpleName());
            System.out.println();
        } else {
            System.out.println("Передача запиту --->>");
            this.getHandler().handleRequest(request);
        }

    }

    @Override
    public boolean hasHandle(HTTPRequest request) {
        if (request.reply().equals("HEAD") && this.isStatus()) {
            return true;
        }
        return false;
    }
}
