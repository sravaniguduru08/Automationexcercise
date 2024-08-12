package com.test;

import com.pom.HomePage;
import com.pom.LoginPage;
import com.utils.Utils;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {
	@Test
    public void testValidLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickSignUpLogin();
        loginPage.login("Sravani08.guduru@gmail.com", "Sravas@23");
        
        // Add assertions here to verify successful login
    }
}
