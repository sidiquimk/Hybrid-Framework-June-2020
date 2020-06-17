package com.HP.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.HP.Pages.AutomationPracticePage;
import com.HP.Utils.BaseClass;
import com.HP.Utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeSteps extends BaseClass {
	AutomationPracticePage APP;
	
	@Given("^I am logged in and i click on Dresses Tab and I verify the Tab text as Dresses$")
	public void i_am_logged_in_and_i_click_on_Dresses_Tab_and_I_verify_the_Tab_text_as_Dresses() throws Throwable {
		AutomationPracticePage APP = new AutomationPracticePage();
		CommonMethods.click(APP.dressesLink);
		System.out.println("Is verrification text Dresses display:  " + APP.verifyDressesTabText.isDisplayed() );
	}

	@When("^I select different colors$")
	public void i_select_different_colors() throws Throwable {
		List<WebElement> colors = driver.findElements(By.xpath("//ul[@id='ul_layered_id_attribute_group_3']/li"));
		for (WebElement color : colors) {
			color.click();
			
				}
		Thread.sleep(2000);
		
	}

	@Then("^I logout from the page$")
	public void i_logout_from_the_page() throws Throwable {
		CommonMethods.click(APP.signOutBtn);
		Thread.sleep(2000);
	}
	


}
