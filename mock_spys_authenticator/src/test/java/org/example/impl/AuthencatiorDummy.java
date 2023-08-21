package org.example.impl;

import org.example.Authenticator;

public class AuthencatiorDummy implements Authenticator {

    @Override
    public Boolean authenticator(String username, String password) {
        return true;
    }
}
