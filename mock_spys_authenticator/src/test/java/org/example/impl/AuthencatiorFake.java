package org.example.impl;

import org.example.Authenticator;

public class AuthencatiorFake implements Authenticator {

    @Override
    public Boolean authenticator(String username, String password) {
        return username.equals("bob") && password.equals("123");
    }
}
