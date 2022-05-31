package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class ElementsAreAlignedOrNot {
    @Test
    public void alignedByXcoordinatesOrNot() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");
        Thread.sleep(3000);

        WebElement unTB = driver.findElement(By.id("username"));
        int un_x = unTB.getLocation().getX();
        int un_width = unTB.getSize().getWidth();
        int un_height = unTB.getSize().getHeight();
        System.out.println("username x coordinate" + un_x);
        System.out.println("username width coordinate" + un_width);
        System.out.println("username height coordinate" + un_height);

        WebElement pwTB = driver.findElement(By.id("password"));
        int pw_x = pwTB.getLocation().getX();
        int pw_width = pwTB.getSize().getWidth();
        int pw_height = pwTB.getSize().getHeight();
        System.out.println("password x coordinate" + pw_x);
        System.out.println("password width coordinate" + pw_width);
        System.out.println("password height coordinate" + pw_height);

        if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
            System.out.println("Username and password text box are aligned");
        } else {
            System.out.println("Username and password text box are NOT aligned");
        }

    }

    @Test
    public void alignedByYcoordinatesOrNot() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.hubspot.com/login");
        Thread.sleep(3000);

        WebElement unTB = driver.findElement(By.id("username"));
        int username_Ycordinate = unTB.getLocation().getX();
        System.out.println(username_Ycordinate);
        WebElement pwdTB = driver.findElement(By.id("password"));
        int password_Ycordinate = pwdTB.getLocation().getX();
        System.out.println(password_Ycordinate);

        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }
}
