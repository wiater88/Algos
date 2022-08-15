package com.sparta.algo.utils.euclid;

import com.sparta.euclid.Euclid;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EuclidTest {

    Euclid euclid = null;

    @BeforeEach
    public void init(){
        euclid = new Euclid();
    }
    @Test
    public void gcdTest(){

        Assert.assertEquals(2,euclid.gcd(10,2));
        Assert.assertEquals(2,euclid.gcd(22,6));

    }
    @Test
    public void gcd2Test(){

        Assert.assertEquals(2,euclid.gcd(10,2));
        Assert.assertEquals(2,euclid.gcd(22,6));

    }

    @Test
    public void gcdVsGcd2Test(){
        Assert.assertEquals(euclid.gcd(213,32),euclid.gcd2(213,32));
        Assert.assertEquals(euclid.gcd(10,2),euclid.gcd2(10,2));
    }

}