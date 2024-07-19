package myproject.services;

import myproject.data.MessageModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessageServiceTest {

    @Test
    void testService() throws Exception {
        String printed = MessageService.printMessage(new MessageModel("007.26"));
        Assertions.assertEquals("007.26", printed);
    }
}
