package org.example.points_bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedTest {
    private Sorted sorted;

    @BeforeEach
    public void setUp(){
        sorted = new Sorted();
    }

    @Test
    public void sortedTwoElements() throws Exception{
        assertEquals(asList(1,2), sorted.sort(asList(2,1)));
    }

    @Test
    public void sortedThreeElements() throws Exception{
        assertEquals(asList(1,2,3), sorted.sort(asList(3,2,1)));
    }

    @Test
    public void sortedFiveElements() throws Exception{
        assertEquals(asList(1,2,3,4,5), sorted.sort(asList(3,5,2,4,1)));
    }
}
