package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WrapTest {
    private Wrap wrap;

    @BeforeEach
    public void setUp() {
        wrap = new Wrap();
    }

    private void assertWrapped(String s, int width, String expected) {
        assertEquals(expected, wrap.wrap(s, width));
    }

    @Test
    public void testWrap() throws Exception {
        //assertWrapped("Four", 7,"Four");
        //assertWrapped("Four", 7,"Four");
        //assertWrapped("ago our" ,7, "ago our");
        assertWrapped("xx", 2, "xx");
        assertWrapped("xxx", 1, "x\nx\nx");
        assertWrapped("xxx", 2, "xx\nx");
        assertWrapped("xxx", 3, "xxx");
        assertWrapped("x x", 1, "x\nx");
        assertWrapped("x x", 2, "x\nx");
        assertWrapped("x x", 3, "x x");
        assertWrapped("x x x", 1, "x\nx\nx");
        assertWrapped("x x x", 4, "x x\nx");
        assertWrapped("x x x", 5, "x x x");
        assertWrapped("xx xx", 2, "xx\nxx");
        assertWrapped("xx xx", 4, "xx\nxx");
        assertWrapped("Four score and " +
                        "seven years ago " +
                        "our fathers " +
                        "brought forth " +
                        "upon this " +
                        "continent a new " +
                        "nation " +
                        "conceived in " +
                        "liberty and " +
                        "dedicated to " +
                        "the proposition " +
                        "that all men " +
                        "are created " +
                        "equal ",
                    15,
                "Four score and\n" +
                        "seven years ago\n" +
                        "our fathers\n" +
                        "brought forth\n" +
                        "upon this\n" +
                        "continent a new\n" +
                        "nation\n" +
                        "conceived in\n" +
                        "liberty and\n" +
                        "dedicated to\n" +
                        "the proposition\n" +
                        "that all men\n" +
                        "are created\n" +
                        "equal");
    }

}
