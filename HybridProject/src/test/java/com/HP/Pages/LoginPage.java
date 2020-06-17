package com.HP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HP.Utils.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath = "//a[@class='login']")
	public WebElement SignInBtn;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement password;
	
	@FindBy(xpath = "//p[@class='submit']//span[1]")
	public WebElement submite;
	
	@FindBy(xpath = "//span[contains(text(),'Masood Sidiqui')]")
	public WebElement verify;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}

