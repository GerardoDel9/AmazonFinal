package com.deloitte.test.amazon.page.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonFooter {
private WebDriver driver; 
	public AmazonFooter(WebDriver driver) {
		this.driver = driver;
	}
	public void clickWebElement(int noElement)
	{
		List<WebElement> myElements = driver.findElements(By.xpath("//a[@class='nav_a']"));
		System.out.println(myElements.get(noElement).getText());
        myElements.get(noElement).click();
	}
	public WebDriver getDriver() {
		return driver;
	}
		
}
