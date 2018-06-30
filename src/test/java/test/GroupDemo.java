package test;

import org.testng.annotations.Test;

/**
 * 分组测试
 * 【需要在test_suite配置文件中，配置分组名称及Class路径】
 */
public class GroupDemo {

    @Test(groups = "function-test")
    public void runSelenium1() {
        System.out.println("runSelenium()1");
    }
}
