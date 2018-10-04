package com.msteringselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Bb {
	WebDriver  driver;
	
	
	  @BeforeMethod()


public void openBrowsers() {

			 System.setProperty("webdriver.chrome.driver","C:\\Users\\vidya\\Desktop\\Selenium\\dependencies\\chromedriver.exe");
			 driver = new ChromeDriver();  
			
		  
		  			
	 
	  driver.get("http://vtu.ac.in/");
	     
}
	  @AfterMethod
	  
	  public void closeBrowser() {
		  
		  driver.quit();
		  
	  }
	  
	  @Test
	  
	  public void test() {
		  
		  System.out.println("test1");
		  
		  driver.findElement(By.id("menu-item-323")).click();
		  System.out.println("About VTU");
		  driver.findElement(By.id("menu-item-325")).click();
		  System.out.println("Institutes");
	  }

}

