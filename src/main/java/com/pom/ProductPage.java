package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ProductPage {

	 private WebDriver driver;

	    @FindBy(xpath ="//h2[contains(text(),'All Products')]")
	    private List<WebElement>ALLproducts;

	    @FindBy(xpath ="div[@class='overlay-content']//p[contains(text(),'Blue Top')]")
	    private List<WebElement> productName;

	    @FindBy(xpath =" //h2[contains(text(),'Rs. 500')])[2]")
	    private List<WebElement> productPrices;

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void printProductDetails() {
	        for (int i = 0; i < ALLproducts.size(); i++) {
	            String name = productName.get(i).getText();
	            String price = productPrices.get(i).getText();
	            System.out.println("Product: " + name + ", Price: " + price);
	        }
	    }
}

