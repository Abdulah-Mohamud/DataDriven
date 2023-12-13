package com.scp.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.scp.base.TestBase.OR;
import static com.scp.base.TestBase.driver;

public class LoginTest {
    @Test
    public static void LoginAsBankManager() throws InterruptedException {
        System.out.println("Hi");
        System.setProperty("chromedriver.exe", "C:\\Users\\abdul\\IdeaProjects\\DataDriven\\src\\test\\resources\\executables\\chromedriver.exe");
        driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
        Thread.sleep(3000);

    }
}
