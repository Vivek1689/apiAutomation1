package com.robosoftin.robodevops.TestPackage;

import com.robosoftin.robodevops.Pages.BasePage;
import com.robosoftin.robodevops.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {
   public static WebDriver driver;

   @BeforeMethod
   public static WebDriver driverInitialization() {

      driver = new ChromeDriver();
      driver.get("https://robodevops.robosoftin.com/auth/login");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
      driver.manage().window().maximize();
      return driver;
   }

   @AfterMethod
   public static void tearDown(){
      driver.quit();
   }

}