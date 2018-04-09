package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Properties;

public class WebTest {

    WebDriver webDriver;

    /*@BeforeClass
    public void setUp(){
        File file = new File("src/main/resources/firefox");
        FirefoxBinary binary = new FirefoxBinary(file);
        System.setProperty("webdriver.gecko.driver","/Users/liyaohua/devsoft/geckodriver/geckodriver");
        System.setProperty("webdriver.firefox.bin",file.getAbsolutePath());
        webDriver = new FirefoxDriver();
        System.out.println(" WebTest class start");

    }
   @AfterClass
    public void end(){
       System.out.println(" WebTest class end");
        webDriver.quit();
    }
    @Test
    public void testSystem(){
        Properties properties = System.getProperties();
        System.out.println(properties.toString());
    }

    *//**
     * 测试www.hexindai.com
     * *//*
    @Test
    public void testHeXinDai(){
        String baseUrl = "http://www.hexindai.com";
        webDriver.get(baseUrl);
        webDriver.manage().window().maximize();
        // 获取class 为 pushstate的元素
        List<WebElement> webElements = webDriver.findElements(By.className("pushstate"));
        for(WebElement webElement : webElements){
            System.out.println(webElement.getText()+webElement.isDisplayed());
            //找到登陆按钮
            if("登录".equals(webElement.getText())){
                //login(webElement);
                break;
            }
        }


    }

    private void login(WebElement webElement){
        webElement.click();
        List<WebElement> webElements = webDriver.findElements(By.tagName("button"));
        for(WebElement element : webElements){
            System.out.println("login:"+element.getAttribute("class")+element.isDisplayed());
        }
    }*/



}
