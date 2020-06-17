package com.HP.StepDefinition;

import com.HP.Pages.SignupPage;
import com.HP.Utils.BaseClass;
import com.HP.Utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SiginupSteps extends BaseClass {
	SignupPage signup;
	
	@Given("^I am in the Automation Practice Page and verify YourLogo$")
	public void i_am_in_the_Automation_Practice_Page_and_verify_YourLogo() throws Throwable {
		signup = new SignupPage();
		System.out.println("is logo display:  "+ signup.VerifyLogo.isDisplayed());
		Thread.sleep(3000);
	}

	@Given("^i click on Sign in button$")
	public void i_click_on_Sign_in_button() throws Throwable {
		CommonMethods.click(signup.SigninBtn);
	}

	@Given("^i enter \"([^\"]*)\" as create email address$")
	public void i_enter_as_create_email_address(String emailCreate) throws Throwable {
		CommonMethods.enterValue(signup.emailCreate, emailCreate);
		
	}

	@Given("^i click on Create an Account button$")
	public void i_click_on_Create_an_Account_button() throws Throwable {
		CommonMethods.click(signup.createAccount);
	}

	@Given("^i click on Mr\\. radio button$")
	public void i_click_on_Mr_radio_button() throws Throwable {
		CommonMethods.click(signup.MrRadioBtn);
	}

	@Given("^i enter \"([^\"]*)\" as first name$")
	public void i_enter_as_first_name(String Fname) throws Throwable {
		CommonMethods.enterValue(signup.firstName, Fname);
	}

	@Given("^i enter \"([^\"]*)\" as last name$")
	public void i_enter_as_last_name(String Lname) throws Throwable {
		CommonMethods.enterValue(signup.lastName, Lname);
	}

	@Given("^i enter \"([^\"]*)\" as email$")
	public void i_enter_as_email(String email) throws Throwable {
		CommonMethods.enterValue(signup.email, email);
	}

	@Given("^i enter \"([^\"]*)\" as password$")
	public void i_enter_as_password(String password) throws Throwable {
		CommonMethods.enterValue(signup.password, password);
	}

	@Given("^i select \"([^\"]*)\" from date dropdown$")
	public void i_select_from_date_dropdown(String date) throws Throwable {
		//CommonMethods.click(signup.dateDD);
		CommonMethods.selectByValue(signup.dateDD, date);
		Thread.sleep(3000);
	}

	@Given("^i select \"([^\"]*)\" from month dropdown$")
	public void i_select_from_month_dropdown(String month) throws Throwable {
		//CommonMethods.click(signup.monthDD);
		CommonMethods.selectByValue(signup.monthDD, month);
		Thread.sleep(3000);
	}

	@Given("^i select \"([^\"]*)\" from year dropdown$")
	public void i_select_from_year_dropdown(String year) throws Throwable {
		//CommonMethods.click(signup.yearDD);
		CommonMethods.selectByValue(signup.yearDD, year);
		Thread.sleep(3000);
	}

	@Given("^i check the newsletter checkbox$")
	public void i_check_the_newsletter_checkbox() throws Throwable {
		//CommonMethods.clear(signup.newsletterChkBx);
		//CommonMethods.click(signup.newsletterChkBx);
		signup.newsletterChkBx.click();
	}

	@Given("^i enter \"([^\"]*)\" as first name in the address$")
	public void i_enter_as_first_name_in_the_address(String FnameAdd) throws Throwable {
		CommonMethods.enterValue(signup.firstNameAdd, FnameAdd);
	}

	@Given("^i enter \"([^\"]*)\" as last name in the address$")
	public void i_enter_as_last_name_in_the_address(String LnameAdd) throws Throwable {
		CommonMethods.enterValue(signup.lastNameAdd, LnameAdd);
	}

	@Given("^i enter \"([^\"]*)\" as address$")
	public void i_enter_as_address(String address) throws Throwable {
		CommonMethods.enterValue(signup.address, address);
	}

	@Given("^i enter \"([^\"]*)\" as City$")
	public void i_enter_as_City(String city) throws Throwable {
		CommonMethods.click(signup.city);
		CommonMethods.enterValue(signup.city, city);

	}

	@Given("^i select \"([^\"]*)\" from State dropdown$")
	public void i_select_from_State_dropdown(String Virginia) throws Throwable {
		//CommonMethods.click(signup.stateDD);
		CommonMethods.selectByVtext(signup.stateDD, Virginia);
	}

	@Given("^i enter \"([^\"]*)\" as Zip Code$")
	public void i_enter_as_Zip_Code(String zipCode) throws Throwable {
		CommonMethods.enterValue(signup.zipCode, zipCode);

	}

	@Given("^i select \"([^\"]*)\" from Country dropdown$")
	public void i_select_from_Country_dropdown(String country) throws Throwable {
		//CommonMethods.click(signup.countryDD);
		CommonMethods.selectByValue(signup.countryDD, country);

	}

	@Given("^i enter \"([^\"]*)\" as Mobile Phone$")
	public void i_enter_as_Mobile_Phone(String mobilePh) throws Throwable {
		CommonMethods.enterValue(signup.mobilePhone, mobilePh);
	}

	@When("^i click on Register button$")
	public void i_click_on_Register_button() throws Throwable {
		CommonMethods.click(signup.registerBtn);
		
		Thread.sleep(3000);
	}
	
	@Then("^i verify name as Masood Sidiqui$")
	public void i_verify_name_as_Masood_Sidiqui() throws Throwable {
		System.out.println("is name display:  "+ signup.verifyName.isDisplayed());
		Thread.sleep(3000);
	}


	
	

}
