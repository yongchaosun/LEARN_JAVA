package test;

import org.testng.annotations.*;

/**
 *
 *
 *
 */
public class TestNGDemo {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }

    @Test
    public  void test1(){
        System.out.println("Test");
    }



}
