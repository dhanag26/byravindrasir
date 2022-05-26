package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation1;

public class Login
{
	@When ("^user open \"(.*)\" browser with exe as$")
	public void blaunch(String bname)
	{
		Object[] input=new Object[1];
		input[0]=bname;
	   SeleniumOperation1.openbrowser(input);
		
	}
	@When ("^user enter url as$")
	public void openapplication()
	{
		SeleniumOperation1.openapplication();
	}
	
	@When ("^user cancle initial Login window$")
	public void cancleloginwindow() throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input2=new Object[1];
		input2[0]=("//*[@class='_2KpZ6l _2doB4z']");
		SeleniumOperation1.clickonelements(input2);
	}
	@When ("^user navigate on Login button$")
	public void navigatetologin()
	{
		Object[] input3=new Object[1];
		input3[0]=("//*[text()='Login']");
		Hashtable<String,Object>output3=SeleniumOperation1.mouseOver(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user navigate on Login button$",output3.get("MESSAGE").toString());
	}
	
	@When ("^user click on MyProfile$") 
	public void clickonmyprofile() throws InterruptedException
	{
		Object[] input4=new Object[1];
		input4[0]=("//*[text()='My Profile']");
		Hashtable<String,Object> output4=SeleniumOperation1.clickonelements(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user click on MyProfile$",output4.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void enterusername(String value12 ) throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input5=new Object[2];
		input5[0]=("//*[@class='_2IX_2- VJZDxU']");
		input5[1]=value12;
		Hashtable<String,Object> output5=SeleniumOperation1.sendkey(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user enter \"(.*)\" as username$",output5.get("MESSAGE").toString());
	}
	@When ("^user enter \"(.*)\" as password$")
	public void enterpassword(String value123) throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input6=new Object[2];
		input6[0]=("//*[@class='_2IX_2- _3mctLh VJZDxU']");
		input6[1]=value123;
		Hashtable<String,Object> output6=SeleniumOperation1.sendkey(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter \"(.*)\" as password$",output6.get("MESSAGE").toString());
	}
	@When ("^user click on login button$")
	public void clickonlogin() throws InterruptedException
	{
		Object[] input7=new Object[1];
		input7[0]=("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
		Hashtable<String,Object> output7=SeleniumOperation1.clickonelements(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user click on login button$",output7.get("MESSAGE").toString());
		
	}
	@Then ("^Application shows user profile to user$")
	public void userprofile() throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input8=new Object[2];
		input8[0]=("//*[@class='_1ruvv2']");
		input8[1]="Ravindra Mule";
		Hashtable<String,Object> output8=SeleniumOperation1.validationwithvalid(input8);	
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^Application shows user profile to user$",output8.get("MESSAGE").toString());
	}
	@Then ("^Application appropriate error message$")
	public void invalid() throws InterruptedException
	{
		Thread.sleep(6000);
		Object[] input9=new Object[2];
		input9[0]="(//*[text()='Login'])[2]";
		input9[1]="Login";
		Hashtable<String,Object> output9=SeleniumOperation1.validationwithvalid(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"^Application appropriate error message$",output9.get("MESSAGE").toString());
		
	}
	
	@When ("^user enters (.+) as username$")
	public void uname(String given)
	{
		Object[] input10=new Object[2];
		input10[0]=("//*[@class='_2IX_2- VJZDxU']");
		input10[1]=given;
		Hashtable<String,Object> output10=SeleniumOperation1.sendkey(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^user enters (.+) as username$",output10.get("MESSAGE").toString());
	
	}
	@When ("^user enters (.+) as password$")
	public void password(String given)
	{
		Object[] input11=new Object[2];
		input11[0]=("//*[@class='_2IX_2- _3mctLh VJZDxU']");
		input11[1]=given;
		Hashtable<String,Object> output11=SeleniumOperation1.sendkey(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(),"^user enters (.+) as password$",output11.get("MESSAGE").toString());
	}
	
}
	
	
	