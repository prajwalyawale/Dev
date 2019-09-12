package Ace_Invoice.Test;

import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;




public class FirstClient extends VerifySign
{
	int i;
	By Name=By.xpath("(//input[@class='form-control'])[1]");
	By Currency=By.name("client[currency]");
	By Addrss1=By.xpath("(//input[@class='form-control'])[3]");
	By Address2=By.xpath("(//input[@class='form-control'])[4]");
	By Country=By.xpath("(//input[@class='form-control'])[5]");
	By DueTerms=By.xpath("//div[@class='css-xp4uvy react-select__single-value']");
	By ContinueButton=By.xpath("//input[@class='btn btn-primary add-new-client-button']");
   
	public FirstClient(WebDriver driver) {
		super(driver);
		
	}
	
   public void FsName(String NameOF){

        driver.findElement(Name).sendKeys(NameOF);
   }
  

	public void CountryText() {
		
		Select selectByVisibleText = new Select (driver.findElement(Currency));
		selectByVisibleText.selectByValue("INR");
	
	}

	 public void AddressLine(String Add){

	        driver.findElement(Addrss1).sendKeys(Add);
	   }
	 
	
	public void AddressLine1(String Add1) {

		driver.findElement(Address2).sendKeys(Add1);
	}

	public void CountryValue(String Cont) {

		driver.findElement(Country).sendKeys(Cont);
	}
	
public void DueTerms() throws AWTException {
	
		
	driver.findElement(By.xpath("//div[@class='css-1hwfws3 react-select__value-container']")).click();

	Robot rob1 =new Robot();
	// Press Enter
	rob1.keyPress(KeyEvent.VK_DOWN);
	rob1.keyPress(KeyEvent.VK_ENTER);

	// Release Enter
	rob1.keyRelease(KeyEvent.VK_ENTER);
	}
	
public void ContinueBU()
{
	driver.findElement((ContinueButton)).click();
}
}


