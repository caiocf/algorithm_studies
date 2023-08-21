package org.example.selfshunt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest implements Notificator {
    private boolean notificationReceived = false;
    private String receivedMessage;

    @Test
    public void updateNameThenSuccess(){
        User  user = new User(this);
        user.updateName("Alice");
        assertTrue(notificationReceived);
        assertEquals("Update Name to Alice", receivedMessage);
    }

    @Override
    public void sendNotification(String message) {
        this.receivedMessage = message;
        this.notificationReceived = true;
    }
}
