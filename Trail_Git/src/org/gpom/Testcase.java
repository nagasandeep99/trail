package org.gpom;

import org.DDT.Exceldata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase {
	
 
	public static void main(String[] args) {
		
		Exceldata exceldata = new Exceldata("C:\\Users\\ynsch\\git\\trail\\Trail_Git\\src\\org\\Data\\Driven.xlsx");
		  WebDriver driver= new FirefoxDriver();
		// TODO Auto-generated method stub
 driver.navigate().to("www.chrome.com");
Searchpage sp= new Searchpage(driver);
sp.intial.sendKeys(exceldata.ReadCell(exceldata.Getcell("selenium",1));

sp.btnsearch.click();
 
	}

}
