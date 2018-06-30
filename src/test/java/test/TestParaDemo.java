package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 参数化测试
 */
public class TestParaDemo {
//
//    @Test
//    @Parameters({ "xx", "yy" })
//    public void test(String dbconfig, int poolsize) {
//        System.out.println(dbconfig+":"+poolsize);
//    }
//
//

    @Test(dataProvider = "provideNumbers")
    public  void test(int number,int expected){
        System.out.println(number+" :" +expected);
        Assert.assertEquals(number+10,expected);
    }

    @DataProvider(name="provideNumbers")
    public Object[][] provide(){
        return new Object[][]{
                {10,20},
                {100,110},
                {200,210}
        };

    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test10")) {
            result = new Object[][] {
                    { 1, 1 }, { 200, 200 }
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][] {
                    { "test@gmail.com", "test@gmail.com" },
                    { "test@yahoo.com", "test@yahoo.com" }
            };
        }

        return result;

    }


}
