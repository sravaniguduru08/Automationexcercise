package com.test;

import com.pom.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomepageTest extends Basetest {

	WebDriver driver;
	HomePage homePage;

	@Test
    public void testSearchProduct() {
        HomePage homePage = new HomePage(driver);

        homePage.searchProduct("T-shirt");

        // Add assertions to verify the search results page
    }

    @Test
    public void testNavigateToContactUs() {
        HomePage homePage = new HomePage(driver);

        homePage.clickContactUs();

        // Add assertions to verify that the Contact Us page is displayed
    }
}

