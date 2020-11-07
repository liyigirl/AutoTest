package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
    System.out.println("这是测试1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试2");
    }
    @BeforeMethod
    public void beforeMethod(){
    System.out.println("方法前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("方法后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是类后运行");
    }
}
