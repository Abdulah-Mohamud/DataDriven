package com.scp.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
    public static Logger log = Logger.getLogger("devpinoyLogger");

    @BeforeSuite
    public void setUp() throws IOException {
        if (driver == null);

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
        FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");

        config.load(fis);
        log.debug("Config file loaded!");
        OR.load(fis2);
        log.debug("Config file loaded!");

        if (config.getProperty("browser").equals("firefox")){
            System.setProperty("geckodriver.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
            driver = new FirefoxDriver();
            log.debug("Firefox Launched");
        }else if (config.getProperty("browser").equals("chrome")){
            System.setProperty("chromedriver.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            driver = new ChromeDriver();
            log.debug("Chrome Launched");
        } else if (config.getProperty("browser").equals("ie")) {
            System.setProperty("IEDriverServer.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            log.debug("IE Launched");

        }

        driver.get(config.getProperty("testsiteurl"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait")))));

    }

    public static Boolean isElementPresent(By by){
        try {
            driver.findElement(by);
            return true;

        }catch (NoSuchElementException e){
            return false;
        }


    }

    @AfterSuite
    public void tearDown(){
        if (driver!=null){
            driver.quit();
            log.debug("Test Execution completed");
        }

    }
}
