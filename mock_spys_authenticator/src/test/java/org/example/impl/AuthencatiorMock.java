package org.example.impl;

public class AuthencatiorMock extends AuthencatiorSpy {
    private String expectedUsername;
    private String expectedPassword;
    private int expectedCount;

    public AuthencatiorMock(String expectedUsername, String expectedPassword, int expectedCount) {
        this.expectedUsername = expectedUsername;
        this.expectedPassword = expectedPassword;
        this.expectedCount = expectedCount;
    }

    public boolean validate() {
        return getCount() == expectedCount && getLastUsername().equals(expectedUsername) && getLastPassword().equals(expectedPassword);
    }
}
