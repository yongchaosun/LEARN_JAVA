package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
    /**
     * 申明周期：
     * 清理》编译》测试》报告》打包》部署
     * mvn clean 清理JAR包
     * mvn compile jar包编译
     * mvn test会执行方法中有@Test标书的方法
     * mvn package  打包   会在target中显示Jar
     * mvn install  部署
     *
     * 采用命令的方式跳过单元测试
     $ mvn install -D maven.test.skip=true
     $ mvn install -DskipTests=true

     TestNG支持多线程，Junit不支持
     */
    @Test
    public void test1(){

        Assert.assertTrue(false);
        System.out.println("HI!");
    }

    @Test
    public void test2(){
        System.out.println("HI! Sun");
    }
}
