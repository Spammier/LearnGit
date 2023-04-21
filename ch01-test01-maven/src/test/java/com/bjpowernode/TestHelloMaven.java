package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {

    @Test
    public void testAdd(){
        System.out.println("====testAdd测试add方法====");
        HelloMaven hello = new HelloMaven();
        int add = hello.add(10, 20);
        Assert.assertEquals(30, add);
    }

    @Test
    public void testAdd2(){
        System.out.println("####testAdd测试add方法####");
        HelloMaven hello = new HelloMaven();
        int add = hello.add(10, 20);
        Assert.assertEquals(30, add);
    }
}
