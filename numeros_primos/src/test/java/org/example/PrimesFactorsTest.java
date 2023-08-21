package org.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class PrimesFactorsTest {

    @Test
    public void factor() throws Exception{
        PrimesFactors primesFactor = new PrimesFactors();
        assertThat(primesFactor.factorOf(1), is(empty()));
        assertThat(primesFactor.factorOf(2), contains(2));
        assertThat(primesFactor.factorOf(3), contains(3));
        assertThat(primesFactor.factorOf(4), contains(2,2));
        assertThat(primesFactor.factorOf(5), contains(5));
        assertThat(primesFactor.factorOf(6), contains(2,3));
        assertThat(primesFactor.factorOf(7), contains(7));
        assertThat(primesFactor.factorOf(8), contains(2,2,2));
        assertThat(primesFactor.factorOf(9), contains(3,3));

    }
}
