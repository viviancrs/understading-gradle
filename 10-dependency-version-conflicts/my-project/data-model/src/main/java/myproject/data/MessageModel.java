package myproject.data;

/**
 * Represents a message that is sent around.
 */
public final class MessageModel {

    private final String message;

    public MessageModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
