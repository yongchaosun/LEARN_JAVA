package test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 超时测试和依赖测试
 *
 */
public class ChaoShiDemo {

    @Test(timeOut = 5000)
    public void testThisshouldPass()throws InterruptedException{
        Thread.sleep(4000);
    }

    @Test(timeOut = 3000)
    public void testThisshouldFail()throws InterruptedException{
        Thread.sleep(4000);
    }


    @Test
    public void method1(){
        System.out.println("This is method 1");
        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = {"method1"})
    public void method2(){
        System.out.println("This is method 2");

    }

}
