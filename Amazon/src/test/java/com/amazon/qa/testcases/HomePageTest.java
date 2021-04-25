package com.amazon.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;


public class HomePageTest extends TestBase{

	HomePage homePage;
	
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		
	}
	
	@Test(priority=2)
	public void searchTextTest() throws InterruptedException
	{
		homePage.desiredSearch();
		homePage.clickSearchButton();
		//List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Unit Testing Principles')]"));
		//list.get(0).click();
		homePage.assetPrice();
		homePage.clickAddToCart();
		//List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold']"));
		//System.out.println("Asset price after adding to cart: "+list1.get(0).getText());
		homePage.clickOnProceedToCheckOut();
		
	}
		

	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
