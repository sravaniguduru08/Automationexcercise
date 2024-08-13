package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	 WebDriver driver;
	 
	    @FindBy(xpath = "//i[contains(@class,'fa fa-home')]")
	    WebElement homepage;
	
	    @FindBy(xpath = "//i[contains(@class,'fa fa-lock')]")
	    WebElement signInButton;
	    
	    @FindBy(xpath = "//h2[text()='Featured Items']")
	    WebElement featuredItemsSection;

	    @FindBy(xpath = "//div[@class='features_items']/div")
	    List<WebElement> featuredItemsList;

//	    @FindBy(xpath = "//a[@href='/signup']")
//	    WebElement signUpButton;

	    public Homepage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickSignIn() {
	        signInButton.click();
	    }
	    
//	    public boolean isFeaturedItemsSectionVisible() {
//	        return featuredItemsSection.isDisplayed();
//	    }
//
//	    public int getFeaturedItemsCount() {
//	        return featuredItemsList.size();
//	    }
//
//	    public String getFirstFeaturedItemName() {
//	        return featuredItemsList.get(0).getText();
	    }

//	    public void clickSignUp() {
//	        signUpButton.click();
//	    }


