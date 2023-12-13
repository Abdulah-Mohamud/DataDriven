package com.scp.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    //Webdriver
    //Logs
    //Properties
    //ExtentReports
    //DB
    //Excel
    //Mail

    public static WebDriver driver;
    public static Properties OR = new Properties();
    public static Properties config = new Properties();
    public static FileInputStream fis;

    @BeforeSuite
    public void setUp() throws IOException {
        if (driver == null);

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
        FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");

        config.load(fis);
        OR.load(fis2);

        if (config.getProperty("browser").equals("firefox")){
            System.setProperty("geckodriver.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (config.getProperty("browser").equals("chrome")){
            System.setProperty("chromedriver.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (config.getProperty("browser").equals("ie")) {
            System.setProperty("IEDriverServer.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
        }

        driver.get(config.getProperty("testsiteurl"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait")))));

    }


    @AfterSuite
    public void tearDown(){
        if (driver!=null){
            driver.quit();
        }

    }
}
