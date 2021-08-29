package com.dilik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingPageTitle {


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        String pageTitle = driver.getTitle();

        System.out.println("pageTitle = " + pageTitle);
        if (pageTitle.equals("Google")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }


        driver.quit();
    }
}
