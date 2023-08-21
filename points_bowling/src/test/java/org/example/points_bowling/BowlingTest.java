package org.example.points_bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class
BowlingTest {
    private Game g;

    @BeforeEach
    public void setUp() {
        g = new Game();
    }

    private void rollSpare() {
        rollMany(2, 5);
    }

    private void rollStrike() {
        g.roll(10);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void nothing() throws Exception {
    }

    @Test
    public void gutterGame() throws Exception {
        rollMany(10, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void allOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void oneSpare() {
        rollSpare(); // spare
        g.roll(7);
        rollMany(17, 0);
        assertEquals(24, g.score());
    }

    @Test
    public void oneStrike() throws Exception {
        rollStrike();// strike
        g.roll(2);
        g.roll(3);
        rollMany(16, 0);
        assertEquals(20, g.score());
    }

    @Test
    public void perfectGame() throws Exception {
        rollMany(12, 10);
        assertEquals(300, g.score());
    }


    @Test
    public void testTenSparesInARow() {
        for (int i = 0; i < 10; i++) {
            rollSpare();
        }
        g.roll(7);
        assertEquals(152, g.score());
    }

    @Test
    public void testCombinationOfStrikesAndSpares() throws Exception {
        for (int i = 0; i < 5; i++) {
            rollStrike();
        }
        for (int i = 0; i < 5; i++) {
            rollSpare();
        }
        g.roll(8);
        assertEquals(213, g.score());
    }


    @Test
    public void testMaxRolls() {
        assertThrows(
                Exception.class,
                () -> rollMany(22, 5)
        );
    }


    @Test
    public void testIncompleteGame() {

        g.roll(10); // strike
        g.roll(7);
        g.roll(2); // 9
        // Only 3 rolls have been made, but we still should be able to compute score

        assertEquals(28, g.score());
    }


    @Test
    public void testRandomGame() {
        rollStrike(); // strike
        g.roll(7);
        g.roll(2); // 9
        g.roll(6);
        g.roll(4); // spare
        g.roll(5);
        g.roll(4); // 9
        // ... (you can continue with more rolls)

        assertEquals(52, g.score());
    }

    @Test
    public void testInvalidPins() {
        assertThrows(IllegalArgumentException.class, () -> g.roll(11));  // This should throw an exception
    }

}
