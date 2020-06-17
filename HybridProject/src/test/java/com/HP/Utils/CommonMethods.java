package com.HP.Utils;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods extends BaseClass{
	
	//Send value method
	public static void enterValue(WebElement element, String value){
		element.clear();
		element.sendKeys(value);
	}


	public static WebElement waiting (WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	//Click method
	public static void click (WebElement element){
		//WebElement elm = waiting(element);
		element.click();
	}
	
	// Clear Method
	public static void clear (WebElement element){
		element.clear();
	}

	//Select by visible text
	public static void selectByVtext(WebElement element, String visibleText){
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	//Select by Index
	public static void selectByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	//Select by value
	public static void selectByValue(WebElement element, String value ){
		Select select = new Select(element);
		select.selectByValue(value);
	}

	//Click link method
	public static void clickLink(WebElement element, String linkText){
		driver.findElement(By.linkText(linkText)).click();
	}

	// Is displayed method
	public static Object isDisplayed(WebElement element){
		boolean isDisplay = element.isDisplayed();
		return isDisplay;
	}

	// Select date method (hard coded)
	public static void date(WebElement element, String selectMonth, String selectYear, String selectDate) {
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select select = new Select(month);
		select.selectByVisibleText(selectMonth);

		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select select2 = new Select(year);
		select.selectByVisibleText(selectYear);

		List<WebElement> dates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement date : dates) {
			String data = date.getText();
			if (data.equalsIgnoreCase(selectDate)) {
				date.click();
			}
		}

	}


	// Verification method (har coded)
	public static void verificationMethod (WebElement element, String name, String elementXpath){
		
		List<WebElement> customers = driver.findElements(By.xpath(elementXpath));
		for (WebElement customer : customers) {
			String value = customer.getText();
			if(value.equalsIgnoreCase(name)){
				System.out.println("This is the verification proof: " + value);
				
			}
			
		}
	}
}
