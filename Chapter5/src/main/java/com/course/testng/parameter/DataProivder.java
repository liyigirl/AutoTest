package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProivder {
    @Test(dataProvider = "data")
    public void dataTest(String name,int age){
        System.out.println("name:"+name+","+"age:"+age);
    }
    @DataProvider(name="data")
    public Object[][] dataProvider(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法name:"+name+","+"age:"+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法name:"+name+","+"age:"+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 30},
                    {"wangwu", 40}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"xiaoli", 10},
                    {"xiaoming", 60}
            };
        }
        return result;
    }



}
