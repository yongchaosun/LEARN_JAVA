package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.util.ExceUtil;

import java.io.IOException;

public class TestExcelDemo{

        @DataProvider(name="excel")
        public Object[][] getData() throws IOException {
            return ExceUtil.getTestData("test_data","test1.xlsx","sheet1");
        }
        @Test(dataProvider = "excel")
        public void testExcel(String a,String b){
            System.out.println(a+":"+b);
        }


}
