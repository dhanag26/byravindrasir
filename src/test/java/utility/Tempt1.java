package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.flipkart.com/");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Actions act=new Actions(driver);
		driver.findElementByXPath("//*[text()='Login']");
		WebElement abc=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(abc).build().perform();
		driver.findElementByXPath("//*[text()='My Profile']").click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9527478358");
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("rdmule");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
	
		
	}	
	}
	
	
	
	
	
	
	
	

