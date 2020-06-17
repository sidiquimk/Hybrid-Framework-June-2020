package com.HP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HP.Utils.BaseClass;

	public class SignupPage extends BaseClass{
		
		@FindBy(xpath = "//img[@class='logo img-responsive']")
		public WebElement VerifyLogo;
		
		@FindBy(xpath = "//a[@class='login']")
		public WebElement SigninBtn;
		
		@FindBy(xpath = "//input[@id='email_create']")
		public WebElement emailCreate;
		
		@FindBy(xpath = "//form[@id='create-account_form']//span[1]")
		public WebElement createAccount;
		
		@FindBy(xpath = "//input[@id='id_gender1']")
		public WebElement MrRadioBtn;
		
		@FindBy(xpath = "//input[@id='customer_firstname']")
		public WebElement firstName;
		
		@FindBy(xpath = "//input[@id='customer_lastname']")
		public WebElement lastName;
		
		@FindBy(xpath = "//input[@id='email']")
		public WebElement email;
		
		@FindBy(xpath = "//input[@id='passwd']")
		public WebElement password;
		
		@FindBy(xpath = "//select[@id='days']")
		public WebElement dateDD;
		
		@FindBy(xpath = "//select[@id='months']")
		public WebElement monthDD;
		
		@FindBy(xpath = "//select[@id='years']")
		public WebElement yearDD;
		
		@FindBy(xpath = "//input[@id='newsletter']")
		public WebElement newsletterChkBx;
		
		@FindBy(xpath = "//input[@id='firstname']")
		public WebElement firstNameAdd;
		
		@FindBy(xpath = "//input[@id='lastname']")
		public WebElement lastNameAdd;
		
		@FindBy(xpath = "//input[@id='address1']")
		public WebElement address;
		
		@FindBy(xpath = "//input[@id='city']")
		public WebElement city;
		
		@FindBy(xpath = "//select[@id='id_state']")
		public WebElement stateDD;
		
		@FindBy(xpath = "//input[@id='postcode']")
		public WebElement zipCode;
		
		@FindBy(xpath = "//select[@id='id_country']")
		public WebElement countryDD;
		
		@FindBy(xpath = "//input[@id='phone_mobile']")
		public WebElement mobilePhone;
		
		@FindBy(xpath = "//span[contains(text(),'Register')]")
		public WebElement registerBtn;
		
		@FindBy(xpath = "//span[contains(text(),'Masood Sidiqui')]")
		public WebElement verifyName;
		
		
		
		public SignupPage() {
			PageFactory.initElements(driver, this);
		}

}
	
