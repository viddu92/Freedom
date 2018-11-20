package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FirstPgm {
	
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidya\\Desktop\\Selenium\\dependencies\\chromedriver.exe");
		
		//TO handle browser notification,follow below//
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//over//
		
		WebDriver driver =new ChromeDriver(options); //passing 'options' as arg for browser notification block\\
		
		driver.get("https://www.facebook.com/");
		System.out.println("Opened URL\n");
		
		WebElement wb = driver.findElement(By.id("email"));
		
		wb.sendKeys("viddu92@gmail.com");
		Thread.sleep(5000);
		System.out.println("Found USername\n");
		
		WebElement wb2=driver.findElement(By.name("pass"));
		wb2.sendKeys("SIRI@9449642116");
		Thread.sleep(5000);
		System.out.println("Found Passwd\n");
		
		WebElement wb3 =driver.findElement(By.id("loginbutton"));
		wb3.click();
		Thread.sleep(2000);
		System.out.println("Logged in successfully\n");
		
		WebElement wb4 = driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		wb4.click();
		Thread.sleep(3000);
		System.out.println("Clicked the dropdown button\n");
		
		driver.findElement(By.partialLinkText("Log Out")).click();
		Thread.sleep(3000);
		
		System.out.println("logged out successfully\n");
		
	
	
		
		System.out.println("SUCCESS!!!");
		
		
		driver.quit();
		
		
	}	
}
