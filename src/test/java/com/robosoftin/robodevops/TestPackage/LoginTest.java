package com.robosoftin.robodevops.TestPackage;

import com.robosoftin.robodevops.Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void toVerifyUserLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsUser();
    }

    @Test
    public void toVerifySuperAdminLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAsSuperAdmin();
    }

    @Test
    public void toVerifyInvalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithInvalidData();
    }

}
