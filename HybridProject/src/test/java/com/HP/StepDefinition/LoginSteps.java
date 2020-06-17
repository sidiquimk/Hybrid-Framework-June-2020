package com.HP.StepDefinition;

import com.HP.Pages.LoginPage;
import com.HP.Utils.BaseClass;
import com.HP.Utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass {
	
	LoginPage login;
	
	
	@Given("^I login to the page$")
	public void i_login_to_the_page() throws Throwable {
		
		login = new LoginPage();
		login.SignInBtn.click();
		Thread.sleep(2000);
		
		CommonMethods.enterValue(login.email, "masoodsdq1@gmail.com");
		Thread.sleep(2000);
		
		CommonMethods.enterValue(login.password, "Doosam123@$");
		Thread.sleep(2000);
		
		CommonMethods.click(login.submite);
		Thread.sleep(2000);
		
		System.out.println("Is name displayed after login:   " + login.verify.isDisplayed());
		Thread.sleep(2000);
	}
	
	


	
/*	@Given("^I click on the Sign in button$")
	public void i_click_on_the_Sign_in_button() throws Throwable {
		login = new LoginPage();
		login.SignInBtn.click();
		Thread.sleep(2000);
		
	}

	@Given("^I enter username$")
	public void i_enter_username() throws Throwable {
		CommonMethods.enterValue(login.email, "masoodsdq1@gmail.com");
		Thread.sleep(2000);
	}

	@Given("^I enter password$")
	public void i_enter_password() throws Throwable {
		CommonMethods.enterValue(login.password, "Doosam123@$");
		Thread.sleep(2000);
	}

	@When("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
		CommonMethods.click(login.submite);
		Thread.sleep(2000);
	}

	@Then("^I successfully login to the page$")
	public void i_successfully_login_to_the_page() throws Throwable {
		System.out.println("Is name displayed after login:   " + login.verify.isDisplayed());
		Thread.sleep(2000);
	}*/
}
