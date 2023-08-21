package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimesFactors {
    public List<Integer> factorOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                factors.add(divisor);
            }
        }
        return factors;
    }
}
