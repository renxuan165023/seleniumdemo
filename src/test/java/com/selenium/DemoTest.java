package com.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.Properties;

public class DemoTest {


    @Before
    public void setUp(){
        System.out.println("Demo  before class...");
    }
   @After
    public void end(){
        System.out.println(" demo after class...");
    }
    @Test
    public void testSystem(){
        Properties properties = System.getProperties();
        System.out.println(properties.toString());
    }
    @Test
    public void testSay(){
        Demo demo = new Demo();
        demo.sayHello();
    }

    @Test
    public void testBusiness(){
        Demo demo = new Demo();
        demo.business();
    }





}
