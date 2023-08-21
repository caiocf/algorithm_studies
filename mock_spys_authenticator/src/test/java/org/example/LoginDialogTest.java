package org.example;

import org.example.impl.AuthencatiorDummy;
import org.example.impl.AuthencatiorFake;
import org.example.impl.AuthencatiorMock;
import org.example.impl.AuthencatiorSpy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginDialogTest {

    private LoginDialog dialog;


    @Test
    public void whenClosed_LoginIsCancelled() {
        AuthencatiorDummy authenticator = new AuthencatiorDummy();
        dialog = new LoginDialog(authenticator);

        dialog.show();
        boolean success = dialog.sendEvent("Event.CLOSE");
        assertTrue(success);
    }

    @Test
    public void whenAuthorizerRjects_loginFails() {
        Authenticator authenticator = (user, pass) -> false;
        dialog = new LoginDialog(authenticator);

        dialog.show();
        boolean success = dialog.submit("user", "123");
        assertFalse(success);
    }

    @Test
    public void loginDialog_correctlyInvokerAuthenticator() {
        AuthencatiorSpy spy = new AuthencatiorSpy();

        dialog = new LoginDialog(spy);
        spy.setResult(true);

        dialog.show();
        boolean success = dialog.submit("user", "123");
        assertTrue(success);
        assertEquals("user", spy.getLastUsername());
        assertEquals("123", spy.getLastPassword());
        assertEquals(1, spy.getCount());
    }

    @Test
    public void loginDialogCallToAuthenticator_validated() {
        AuthencatiorMock mock = new AuthencatiorMock("bob", "123", 1);

        dialog = new LoginDialog(mock);
        dialog.show();
        boolean success = dialog.submit("bob", "123");
        assertTrue(success);
        assertTrue(mock.validate());
    }

    @Test
    public void goodPasswordAttemp_loginSucceeds(){
        Authenticator fake = new AuthencatiorFake();

        dialog = new LoginDialog(fake);
        dialog.show();
        boolean success = dialog.submit("bob", "123");
        assertTrue(success);
    }

    @Test
    public void badPasswordAttemp_loginFails(){
        Authenticator fake = new AuthencatiorFake();

        dialog = new LoginDialog(fake);
        dialog.show();
        boolean success = dialog.submit("bob", "321");
        assertFalse(success);
    }
}
