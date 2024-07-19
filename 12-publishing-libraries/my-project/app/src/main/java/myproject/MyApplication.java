package myproject;

import myproject.data.MessageModel;
import myproject.services.MessageService;

public class MyApplication {

    /***
     * Main.
     * @param args
     */
    public static void main(final String[] args) {
        MessageService.printMessage(new MessageModel("007.26"));
    }
}
