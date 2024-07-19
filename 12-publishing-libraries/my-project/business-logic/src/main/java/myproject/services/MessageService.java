package myproject.services;

import myproject.data.MessageModel;
import org.slf4j.LoggerFactory;

/**
 * Our main service.
 */
public final class MessageService {

    /**
     * Prints the main message to screen.
     */
    public static String printMessage(MessageModel message) {
        String messageToPrint = message.getMessage();
        System.out.println(messageToPrint);
        LoggerFactory.getLogger(MessageService.class).info("Message printed");
        return messageToPrint;
    }
}
