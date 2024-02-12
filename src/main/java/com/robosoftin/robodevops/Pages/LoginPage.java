package com.robosoftin.robodevops.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends BasePage {

    By loginText = By.xpath("//h4[text()='Login']");
    By emailTextField = By.name("email");
    By passwordTextField = By.name("password");
    By continueButton = By.xpath("//button[@type='submit']");
    By invalidCredentialsMessage = By.xpath("//p[text()='Invalid username or password']");
    LandingPage landingPage = new LandingPage();
    By forgotPasswordLink = By.xpath("//a[text()='Forgot password ?']");
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void loginAsUser(){
        driver.findElement(emailTextField).sendKeys("vivek.shetty@robosoftin.com");
        driver.findElement(passwordTextField).sendKeys("Vivektest@123");
        driver.findElement(continueButton).click();
        Assert.assertTrue(driver.findElement(landingPage.projectsText).isDisplayed());
    }

    public void loginAsSuperAdmin(){
        driver.findElement(emailTextField).sendKeys("manju.p@roboso.com");
        driver.findElement(passwordTextField).sendKeys("Robo@1234");
        driver.findElement(continueButton).click();
        Assert.assertTrue(driver.findElement(landingPage.adminDashboard).isDisplayed());
    }

    public void loginWithInvalidData(){
        driver.findElement(emailTextField).sendKeys("vivek.shetty@robosoftin.com");
        driver.findElement(passwordTextField).sendKeys("invalid@1234");
        driver.findElement(continueButton).click();
        Assert.assertTrue(driver.findElement(invalidCredentialsMessage).isDisplayed());
    }

    public void validateForgotPasswordLink(){
        //driverInitialization();
        driver.findElement(forgotPasswordLink).click();

    }


}
