package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation 
{
	public static ChromeDriver driver=null;
	
	public static void  openbrowser(String key,String value )
	{
		String key1=key;
		String value1=value;
		System.setProperty(key1,value1);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}

	public static void  openapplication(String url )
	{
		String url1=url;
		driver.get(url1);
	}
	public static void  clickonelement(String xpath)
	{
		String xpath1=xpath;
	driver.findElementByXPath(xpath1).click();
	}
	public static void  mouseOver(String xpath)
	{
		String Xpath2=xpath;
		Actions act=new Actions(driver);
		WebElement abc=driver.findElementByXPath(Xpath2);
		act.moveToElement(abc).build().perform();
	}
	public static void  sendkey(String xpath,String value1)
	{
		String Xpath3=xpath;
	    String value12=value1;
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementByXPath(Xpath3).sendKeys(value12);
	}

	public static void main(String[] args)
	{
		
		SeleniumOperation.openbrowser("webdriver.chrome.driver", "F:\\Automation Support\\chromedriver.exe"); 
		SeleniumOperation.openapplication("http://www.flipkart.com/"); 
		SeleniumOperation.clickonelement("//*[@class='_2KpZ6l _2doB4z']"); 	
		SeleniumOperation.mouseOver("//*[text()='Login']");
		SeleniumOperation.clickonelement("//*[text()='My Profile']");
		SeleniumOperation.sendkey("//*[@class='_2IX_2- VJZDxU']","9527478358");
		SeleniumOperation.sendkey("//*[@class='_2IX_2- _3mctLh VJZDxU']","rdmule");
		SeleniumOperation.clickonelement("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']"); 
	}	
	}

	
	
	

