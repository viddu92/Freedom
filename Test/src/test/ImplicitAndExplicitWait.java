package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*It is recommended to use implicitwait for small application, explicit wait for large and condition based */

public class ImplicitAndExplicitWait {
	
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vidya\\Desktop\\Selenium\\dependencies\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		System.out.println("Opened URL\n");
		
		//implicit wait is applied globally, it is applicable for all web elements,dynamic in nature//
		//implicit wait can be changes anywhere in the code,if u write twice,it overwrites previous one.
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); //Page load timeout//
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);  //implicit wait//
		
		WebElement wb = driver.findElement(By.id("email"));
		WebElement wb2=driver.findElement(By.name("pass"));
		WebElement wb3 =driver.findElement(By.id("loginbutton"));  
		exwait(driver,wb, 5, "V"); //explicit wait method reusing
		exwait(driver,wb2,2,"ijnuhgbygvyvI");  //explicit wait method reusing
		exwait1(driver,wb3,5); //explicit wait method reusing
		
		System.out.println("PASS\n");
		driver.close();
		
	}
	
	public static void exwait(WebDriver Object,WebElement element, int Time,String val)
	
	{
		//1.no explicit keyword or method
		//2.available in WebDriverWait with some expected conditions
		//3.It is specific to element unlike implicitwait
		//4.dynamic in nature
		//5.We should never use implicit and explicit together.
		
		new WebDriverWait(Object,Time).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(val);
		
	}
	
	public static void exwait1(WebDriver Object,WebElement element, int Time)
	
	{
		
		new WebDriverWait(Object,Time).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	

}
