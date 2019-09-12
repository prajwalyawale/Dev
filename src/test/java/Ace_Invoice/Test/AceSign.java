package Ace_Invoice.Test;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AceSign 
{
	public static WebDriver driver;
	
@Test
	public void test() throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	ConfigFileReader reader= new ConfigFileReader();
	//get URL from config
	driver.get(reader.getApplicationUrl());
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 VerifySign sig=new VerifySign(driver);
	 sig.ClickOnSignIn();
	 sig.EmailText("prajsfwasdfaltest@gmail.com");
	 sig.GetStartButton();
	 sig.GetPassword("Password1");
	 sig.ConfirmPassword("Password1");
	 sig.ContinueButtonT();
	 sig.FirstnameText("Prajwal");
	 sig.LastnameText("Yawale");
	 sig.ContinueButtonT();
	 sig.OrgeNameO("MyOrg");
	 sig.OrgeEmailID("Careero@myorg.com");
	 sig.ClickOnContinue();
	 Thread.sleep(3000);
	FirstClient obj=new FirstClient(driver);
	obj.FsName("Prajwal");
	obj.CountryText();
	obj.AddressLine("Hinjewadi Road Wakad");
	obj.AddressLine1("Hinjewad");
	obj.CountryValue("India");
	obj.DueTerms();
	 obj.ContinueBU();
	 
	//driver.quit();
	 
	 
}
}