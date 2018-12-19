package org.gpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Searchpage {
	
	public Searchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="q")
	public WebElement intial;
	
	@FindBy(xpath="//input[class='gLFyf gsfi']")
	public WebElement btnsearch;
	
	
}
