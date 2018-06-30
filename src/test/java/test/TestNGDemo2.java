package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * 异常测试
 *@Test(expectedExceptions = ArithmeticException.class)
 * @Test(expectedExceptions = IOException.class)//期望是IO异常测试。
 */
public class TestNGDemo2 {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException(){
        int i=1/0;
        System.out.println("After division the value of i is："+i);
    }

    @Test(expectedExceptions = IOException.class)
    public void TestException(){
        int i=1/0;
        System.out.println("After division the value of i is："+i);
    }






}
