package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.flipkart.com/");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		Actions act=new Actions(driver);
		driver.findElementByXPath("//*[text()='Login']");
		WebElement pqr=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(pqr).build().perform();
		driver.findElementByXPath("//*[text()='My Profile']").click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9527478358");
		driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("rdmule");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
		driver.findElementByXPath("//*[@class='_1w3ZZo _2mFmU7']").sendKeys("Ravindra Mule");
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[2]").sendKeys("9527478358");

		
		
		
	}
		
	
	
	
}
