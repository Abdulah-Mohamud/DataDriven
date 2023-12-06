package com.scp.base;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    //Webdriver
    //Logs
    //Properties
    //ExtentReports
    //DB
    //Excel
    //Mail

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

    }


    @AfterSuite
    public void tearDown(){

    }
}
