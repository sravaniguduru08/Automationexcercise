package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pom.HomePage;
import com.pom.LoginPage;
import com.pom.Loginpage;
import com.utils.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

public class LoginTest extends Basetest {
	
		WebDriver driver;
	    Loginpage loginpage;

	    @BeforeClass
	    public void setUp() 
	    {
	        // Use WebDriverManager to manage the ChromeDriver binary
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        
	        // Navigate to the login page of the website
	        driver.get("https://automationexercise.com/login"); // Replace with the actual login page URL

	        // Initialize the Loginpage object
	        loginpage = new Loginpage(driver);
	    }

	    @Test
	    public void testLogin1() {
	        // Perform login action with valid credentials
	        String email = "sravani08.guduru@gmail.com"; // Replace with valid email
	        String password = "Sravas@23";   // Replace with valid password
	        
	        loginpage.login(email, password);
	        
	        // Add assertions here to verify successful login
	        // Example: Assert.assertTrue(driver.getCurrentUrl().contains("dashboard") || any other expected behavior);
	    }

	    @Test
	    public void testInvalidLogin() {
	        // Perform login action with invalid credentials
	        String invalidEmail = "invalid@example.com";
	        String invalidPassword = "wrongpassword";
	        
	        loginpage.login(invalidEmail, invalidPassword);
	        
	        // Add assertions here to verify login failure
	        // Example: Assert.assertTrue(driver.getCurrentUrl().contains("login") || verify an error message);
	    }

	    @AfterClass
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	private void testInvalidLogin1() {
		// TODO Auto-generated method stub
		
	}

	private void testLogin() {
		// TODO Auto-generated method stub
		
	}
	}