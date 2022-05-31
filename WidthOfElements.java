package com.blz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WidthOfElements {
    @Test
    public void coordinatesAlignedOrNot() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshal bojja\\IdeaProjects\\SeleniumSession\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        WebElement fnTB = driver.findElement(By.name("firstname"));
        int fn_width = fnTB.getSize().getWidth();
        System.out.println("Firstname width: " + fn_width);

        WebElement emTB = driver.findElement(By.name("reg_email__"));
        int em_width = emTB.getSize().getWidth();
        System.out.println("Firstname width: " + em_width);


        if (fn_width==em_width) {
            System.out.println("Both are equal");
        }else if (fn_width>em_width){
            System.out.println("Firstname is greater");
        }else {
            System.out.println("Email is greater");
        }
    }
}
