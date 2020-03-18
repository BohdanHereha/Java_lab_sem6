package com.company;

/**
 * The class which represents the handler of post request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class PostHandler extends Handler {
    /**
     * The constructor of class PostHandler.
     *
     * @param handler The successor.
     * @param status  The status of capability tp process a request.
     */
    public PostHandler(Handler handler, boolean status) {
        this.setHandler(handler);
        this.setStatus(status);
    }

    @Override
    public void handleRequest(HTTPRequest request) {
        if (this.hasHandle(request) == true) {
            System.out.println("Обробка запиту Post об’єктом класу " + getClass().getSimpleName());
        } else {
            System.out.println("Передача запиту --->>");
            this.getHandler().handleRequest(request);
        }

    }

    @Override
    public boolean hasHandle(HTTPRequest request) {
        if (request.reply().equals("POST") && this.isStatus()) {
            return true;
        }
        return false;
    }
}