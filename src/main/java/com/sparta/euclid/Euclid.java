package com.sparta.euclid;

/**
 * Euclid algorithm -> GDC -> greatest common divider
 */

public class Euclid {
    public Euclid() {
    }

    /**
     * Implementation on Greater common divider using recursion
     * @param number -> number to be divided
     * @param divisor -> number divided by
     * @return
     */
    public int gcd(int number, int divisor){
        int remaining = (number % divisor);

        if(remaining!=0){
            return gcd(divisor,remaining);
        }else {
            return divisor;
        }
    }

    /**
     * Another implementation of GCD - no recursion
     * @param number
     * @param divisor
     * @return
     */
    public int gcd2(int number, int divisor){
        while (divisor !=0){
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }
}
