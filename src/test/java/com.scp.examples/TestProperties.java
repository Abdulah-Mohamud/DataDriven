package com.scp.examples;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties OR = new Properties();
        Properties config = new Properties();

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
        FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");

        config.load(fis);
        OR.load(fis2);

        System.out.println(config.getProperty("browser"));
        System.out.print(OR.getProperty("bmlBtn"));

        // driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click
    }
}
