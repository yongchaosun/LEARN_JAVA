package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.util.ExceUtil;

import java.io.IOException;


public class qwe {
//     @Test
////     public void test1() throws InterruptedException {
//         Thread.sleep(2000);
//         System.out.println("test1");
//     }
//
//     @Test
//     public void test2() throws InterruptedException {
//         Thread.sleep(2000);
//         System.out.println("test3");
//     }
//
//     @Test
//     public void test3() throws InterruptedException {
//         Thread.sleep(2000);
//         System.out.println("test3");
//     }
     @DataProvider(name="excel")
       public Object[][] getData() throws IOException {
        return ExceUtil.getTestData("test_data","test1.xlsx","sheet1");
    }
    @Test(dataProvider = "excel")
    public void testExcel(String a,String b){
        System.out.println(a+":"+b);
    }



 }