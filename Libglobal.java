package org.Junit;
	//baseclass
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
	//baseclass
	  class BaseClass {
	 static WebDriver driver;
	   static WebDriver getDriver() {
		 
	 WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	return driver;
	}
		public  static  void launchbrowser(String url) {
	driver.get(url);
	}	
		public  static WebElement xpath(String xpathvalue) {
	 WebElement Element = driver.findElement(By.xpath(xpathvalue));
	return Element;
	}
		public  static WebElement id(String idvalue) {
			 WebElement Element = driver.findElement(By.id(idvalue));
			return Element;}
		
		public static void textsender(WebElement refName,String values) {

	        refName.sendKeys(values);	

	}
	public static void buttonclick(WebElement refName) {
		refName.click();

	}

public static void selectBy( WebElement element, int a) {
	Select s2= new Select(element);
s2.selectByIndex(a);
}
	}
