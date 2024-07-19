package myproject.services;

import myproject.data.MessageModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * Our main service.
 */
public final class MessageService {

    /**
     * Prints the main message to screen.
     */
    public static String printMessage(MessageModel message) {
        String messageToPrint = message.getMessage();
        if (NumberUtils.isCreatable(messageToPrint)) {
            messageToPrint += " has no leading zeros";
        }
        System.out.println(messageToPrint);
        return messageToPrint;
    }
}
