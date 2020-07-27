package com.example.action;


import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class SomeTest {

    @Test
    public void testA(){
        Assert.isTrue(System.currentTimeMillis() > 0L);
    }

    @Test
    public void testB(){
        long a = 5L;
        Assert.isTrue(a > 0L);
    }

}
