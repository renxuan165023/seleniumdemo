package com.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SomeOther {


    @Before
    public void before(){
        System.out.println("SomeOther before");
    }

    @After
    public void after(){
        System.out.println("SomeOther after");
    }

    @Test
    public void test(){
        System.out.println("this is other test!");
    }

}
