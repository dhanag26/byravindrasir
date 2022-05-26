package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperation1 
{
	public static ConfigReader config;
	
	public static WebDriver driver=null;
	
	public static Hashtable<String,Object> outputparamerters=new Hashtable<String,Object>();	  	 		 
	
	public static Hashtable<String,Object>  openbrowser(Object[]inputparametrs)
	{
		try {
		String bname=(String) inputparametrs[0];
		if(bname.equalsIgnoreCase("Chrome"))
		{
			config=new ConfigReader();	
		
		System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();	
		 //driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		 
		}
		else if(bname.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver",config.getDriverPathFF());
			  driver = new FirefoxDriver();
			 driver.manage().window().maximize();
	
		}
		 outputparamerters.put("STATUS","PASS");
		 outputparamerters.put("MESSAGE","methodUsed:openbrowser,input Given: "+inputparametrs[0].toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:openbrowser,input Given: "+inputparametrs[0].toString());
			
		}
		return outputparamerters;
	} 

	public static Hashtable<String,Object> openapplication() 
	{
		try {
		
		driver.get(config.getApplicationUrl()); 
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		outputparamerters.put("STATUS","PASS");
		outputparamerters.put("MESSAGE","methodUsed:openapplication,input Given: "+config.getApplicationUrl().toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:openapplication,input Given: "+config.getApplicationUrl().toString());
		}
		return outputparamerters;
	}
	
	
	public static Hashtable<String,Object> clickonelements(Object[]inputparameters)
	{
		try {
			//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		String input1=(String) inputparameters[0];
		driver.findElement(By.xpath(input1)).click();
	    outputparamerters.put("STATUS","PASS");
		 outputparamerters.put("MESSAGE","methodUsed:clickonelements,input Given: "+inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:clickonelements,input Given: "+inputparameters[0].toString());
		}
		return outputparamerters;
	}
	public static Hashtable<String,Object>  mouseOver(Object[]inputparameters)
	{
		try {
		//driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		String Xpath2=(String) inputparameters[0];
		Actions act=new Actions(driver);
		WebElement abc=driver.findElement(By.xpath(Xpath2));
		act.moveToElement(abc).build().perform();
		outputparamerters.put("STATUS","PASS");
		 outputparamerters.put("MESSAGE","methodUsed:mouseOver,input Given: "+inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:mouseOver,input Given: "+inputparameters[0].toString());
			
		}
		return outputparamerters;
	}
	
	
	public static Hashtable<String,Object>  sendkey(Object[]inputparameters)
	{
		try {
		String Xpath3=(String) inputparameters[0];
	    String value12=(String) inputparameters[1];
	   // driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		driver.findElement(By.xpath(Xpath3)).sendKeys(value12);
		outputparamerters.put("STATUS","PASS");
		 outputparamerters.put("MESSAGE","methodUsed:sendkey,input Given: "+inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:sendkey,input Given: "+inputparameters[0].toString());
			
		}
		return outputparamerters;
	}
	public static Hashtable<String,Object> validationwithvalid (Object[]inputparameters)
	{
		try   {
		String Xpath4=(String) inputparameters[0];
	    String text=(String) inputparameters[1];
	   // driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
		String actualText=driver.findElement(By.xpath(Xpath4)).getText();
		if(actualText.equalsIgnoreCase(text))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
		outputparamerters.put("STATUS","PASS");
		 outputparamerters.put("MESSAGE","methodUsed:validationwithvalid,input Given: "+inputparameters[0].toString());
		}
		catch(Exception e)
		{
			outputparamerters.put("STATUS","FAIL");
			 outputparamerters.put("MESSAGE","methodUsed:validationwithvalid,input Given: "+inputparameters[0].toString());
			
		}
		return outputparamerters;
	}
		public static Hashtable<String,Object> validationwithinvalid (Object[]inputparameters)
		{
			try {
			String Xpath4=(String) inputparameters[0];
		    String text=(String) inputparameters[1];
		    //driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(),TimeUnit.SECONDS);
			String actualText=driver.findElement(By.xpath(Xpath4)).getText();
			if(actualText.equalsIgnoreCase(text))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("Test case fail");
			}
			outputparamerters.put("STATUS","PASS");
			 outputparamerters.put("MESSAGE","methodUsed:validationwithinvalid,input Given: "+inputparameters[0].toString());
			}
			catch(Exception e)
			{
				outputparamerters.put("STATUS","FAIL");
				 outputparamerters.put("MESSAGE","methodUsed:validationwithinvalid,input Given: "+inputparameters[0].toString());
				
			}
			return outputparamerters;
	
	        }
		public static void main(String[] args) throws InterruptedException 
		{
			Object[] input=new Object[2];
			input[0]=("webdriver.chrome.driver");
		   input[1]=("F:\\Automation Support\\chromedriver.exe");
			SeleniumOperation1.openbrowser(input);
			
			
			SeleniumOperation1.openapplication();
			
			Object[] input1=new Object[1];
			input1[0]=("//*[@class='_2KpZ6l _2doB4z']");
			SeleniumOperation1.clickonelements(input1);
			
			Object[] input3=new Object[1];
			input3[0]=("//*[text()='Login']");
			SeleniumOperation1.mouseOver(input3);
			
			Object[] input4=new Object[1];
			input4[0]=("//*[text()='My Profile']");
			SeleniumOperation1.clickonelements(input4);
			
			Object[] input5=new Object[2];
			input5[0]=("//*[@class='_2IX_2- VJZDxU']");
			input5[1]=("9527478358");
			SeleniumOperation1.sendkey(input5);
			
			Object[] input6=new Object[2];
			input6[0]=("//*[@class='_2IX_2- _3mctLh VJZDxU']");
			input6[1]=("rdmule");
			SeleniumOperation1.sendkey(input6);
			
			Object[] input7=new Object[1];
			input7[0]=("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
			SeleniumOperation1.clickonelements(input7);
			
			Object[] input8=new Object[1];
			input8[0]=("//*[text()='Manage Addresses']");
			Thread.sleep(6000);
			SeleniumOperation1.clickonelements(input8);
			
			Object[] input9=new Object[1];
			input9[0]=("//*[@class='_1QhEVk']");
			SeleniumOperation1.clickonelements(input9);
			
			Object[] input10=new Object[2];
			input10[0]=("//*[@class='_1w3ZZo _2mFmU7']");
			input10[1]=("Ravindra Mule");
			SeleniumOperation1.sendkey(input10);
			
			Object[] input11=new Object[2];
			input11[0]=("(//*[@class='_1w3ZZo _2mFmU7'])[2]");
			input11[1]=("9527478358");
			SeleniumOperation1.sendkey(input11);
			
			
		}
		
}