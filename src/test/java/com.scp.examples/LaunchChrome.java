package com.scp.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import static com.scp.base.TestBase.OR;
import static com.scp.base.TestBase.driver;

public class LaunchChrome {
    /*public static void main(String[] args) {
        System.setProperty("chromedriver.exe", "C:\\Users\\abdul\\IdeaProjects\\DataDriven\\src\\test\\resources\\executables\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }*/
    public static Properties config = new Properties();

    public static void main(String[] args) throws IOException {
/*
        System.out.println(config.getProperty("testsiteurl"));
*/
        System.setProperty("chromedriver.exe", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

/*        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait")))));*/
/*
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");

        config.load(fis);*/
        //driver.get("https://www.google.com");
        driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");

        //driver.quit();

}}
