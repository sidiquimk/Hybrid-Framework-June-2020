package com.HP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.HP.Utils.BaseClass;

public class AutomationPracticePage extends BaseClass {
	
	@FindBy(xpath = "//body[@id='my-account']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
	public WebElement dressesLink;
	
	@FindBy(xpath = "//span[@class='category-name']")
	public WebElement verifyDressesTabText;
	
	@FindBy(xpath = "//a[@class='logout']")
	public WebElement signOutBtn;
	
	//   Dresses Colors xpath:      //ul[@id='ul_layered_id_attribute_group_3']
	
/*	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;
	
	@FindBy(xpath = "")
	public WebElement mm;*/
	
	public AutomationPracticePage() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	
}
