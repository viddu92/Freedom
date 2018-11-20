package test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	
	public static void main (String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\Desktop\\Selenium\\dependencies\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//1:Find out the drop down on UI //
		WebElement wb1 = driver.findElement(By.id("day"));
		WebElement wb2 = driver.findElement(By.id("month"));
		WebElement wb3 = driver.findElement(By.id("year"));
		
		//Need to use SELECT class to handle dropdown options//
		//2:Create object to SELECT class//
		
		Select sel1 = new Select (wb1);
		Select sel2 = new Select (wb2);
		Select sel3 = new Select (wb3);
		
		//3:Select data from dropdown//
		sel1.selectByValue("13");
		Thread.sleep(2000);
		sel2.selectByIndex(10);
		Thread.sleep(2000);
		sel3.selectByVisibleText("1991");
		Thread.sleep(2000);
		
//		To get all the options belonging to selected tag
		java.util.List<WebElement> ls = sel1.getOptions(); //List type return 
		System.out.println(ls.size());
		
//		Deselect only for multiselections, not for single selection dropdown.
//		no examples are written
		
//		Below is the example for isMultiple(boolean)
		Boolean b = sel1.isMultiple();
		System.out.println(b);
		
		
		
		
		
		
		System.out.println("Happy Bday Dubs!!!");
		
		System.out.println("SUCCESS");
		
	driver.quit();

		
	}
	

}
