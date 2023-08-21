package org.example.impl;

import org.example.Authenticator;

public class AuthencatiorSpy implements Authenticator {

    private int count =0;
    private boolean result = true;
    private String lastUsername="";
    private String lastPassword="";

    @Override
    public Boolean authenticator(String username, String password) {
        count++;
        lastPassword=password;
        lastUsername=username;
        return result;
    }


    public void setResult(boolean result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public boolean isResult() {
        return result;
    }

    public String getLastUsername() {
        return lastUsername;
    }

    public String getLastPassword() {
        return lastPassword;
    }
}
