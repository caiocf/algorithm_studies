package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalCalculatorTest {
    private RentalCalculator rentalCalculator;


    @BeforeEach
    public void setUp(){
        rentalCalculator = new RentalCalculator();
        VideoRegistry.addMovie("RegularMovie", VideoRegistry.VideoType.REGULAR);
        VideoRegistry.addMovie("ChildrensMovie", VideoRegistry.VideoType.CHILDRENS);
    }

    private void assertFeeAndPoints(double fee, int points){
        assertEquals(fee, rentalCalculator.getRentalFee(), 0.001);
        assertEquals(points, rentalCalculator.getRentalPoints());
    }
    @Test
    public void RegularMovie_OneDay(){
        rentalCalculator.addRental("RegularMovie", 1);
        assertFeeAndPoints(150, 1);
    }

    @Test
    public void RegularMovie_SecondAndThirdDayFee(){
        rentalCalculator.addRental("RegularMovie",2);
        assertFeeAndPoints(150,1);
        rentalCalculator.clear();
        rentalCalculator.addRental("RegularMovie",3);
        assertFeeAndPoints(150,1);
    }

    @Test
    public void RegularMovie_FourDays(){
        rentalCalculator.addRental("RegularMovie", 4);
        assertFeeAndPoints(300,2);
    }

    @Test
    public void ChildrensMovie_OneDay(){
        rentalCalculator.addRental("ChildrensMovie",1);
        assertFeeAndPoints(100,1);
    }

    @Test
    public void OneRegularOneChildrens_FourDays(){
        rentalCalculator.addRental("RegularMovie",4); // $3+2p
        rentalCalculator.addRental("ChildrensMovie",4); // $4+1p

        assertFeeAndPoints(700,3);
    }
}
