package com.amazon.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement clickSearch;
	
	@FindBy(xpath="//span[@id='newBuyBoxPrice']")
	WebElement assetPrice;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCart;
	
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native-bottom']")
	WebElement proceedToCheckOut;
	
	public void desiredSearch()
	{
		searchbox.sendKeys("qa testing for beginners");
	}
	
	public SearchResult clickSearchButton()
	{
		clickSearch.click();
		return new SearchResult();
	}
	

	public void assetPrice()
	{
		System.out.println("Asset Price before adding to cart: "+ assetPrice.getText());
	}
	
	public void clickAddToCart()
	{
		addToCart.click();
	}
	
	public void clickOnProceedToCheckOut()
	{
		proceedToCheckOut.click();
	}
}
