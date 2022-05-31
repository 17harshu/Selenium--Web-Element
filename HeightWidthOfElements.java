package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class HeightWidthOfElements {
    @Test
    public void checkHeightWidth() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");
        Thread.sleep(3000);

        /*
        * find the username field
        * store the height of username
        * store the width of username
        */
        WebElement unTB = driver.findElement(By.id("username"));
        int username_height = unTB.getSize().getHeight();
        int username_width = unTB.getSize().getWidth();
        System.out.println("Username's height" + username_height);
        System.out.println("Username's width" + username_width);

        /*
        * find the password field
        * store the height of password
        * store the width of password
        */
        WebElement pwdTB = driver.findElement(By.id("password"));
        int password_height = pwdTB.getSize().getHeight();
        int password_width = pwdTB.getSize().getWidth();
        System.out.println("Password's height" + password_height);
        System.out.println("Password's width" + password_width);

        //check the height and width of username and password fields are same
        if (username_height==password_height && username_width==password_width) {
            System.out.println("Username and password fields are aligned");
        }else{
            System.out.println("Username and password fields are NOT aligned");
        }
    }
}
