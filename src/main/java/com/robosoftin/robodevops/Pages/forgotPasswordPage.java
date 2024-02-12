package com.robosoftin.robodevops.Pages;

import org.openqa.selenium.By;

public class forgotPasswordPage {
    By emailTextField = By.name("email");
    By submitButton = By.xpath("//button[@type='submit']");
    By toastMessage = By.xpath("//div[contains(@class,'Toastify__toast-body')]");
    By forgotPasswordText = By.xpath("//h4[text()='Forgot Password']");

    public void toastMessageValidation(){

    }

}
