package org.example;


public class LoginDialog {
    public Authenticator authenticator;

    public LoginDialog(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void show() {
    }

    public boolean sendEvent(String s) {
        return true;
    }

    public boolean submit(String username, String pasword) {
        return authenticator.authenticator(username,pasword);
    }
}
