package Ace_Invoice.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifySign extends AceSign
{
	public static WebDriver driver;

	    By SignUp = By.xpath("//a[@class='signup-button border-radius-lg']");

	    By Email = By.xpath("//*['@id=new_use']/div/div[1]/div/input");

	    By Getstr =By.name("get_started");
	    
	    By Password=By.name("password");
	    
	    By ConfirmPassword=By.xpath("//input[@name='password_confirmation']");
	    
	    By ContinuButton=By.xpath("//input[@class='btn btn-primary']");
	    
	    By FristName=By.xpath("(//input[@class='form-control'])[1]");
	    
	    By LastName=By.xpath("(//input[@class='form-control'])[2]");
	    
	    By ContinueButton2 =By.xpath("//input[@name='commit']");
	    
	    By OrgName =By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/div/form/div[1]/div/div/input");
	    
	    By OrgEmail =By.xpath("(//input[@class='form-control'])[2]");
	    		
	    By ClickButtonCon =By.name("commit");
	    		//xpath("//div[@class='form-actions']//input[@class='btn btn-primary add-new-client-button']");


	    public VerifySign(WebDriver driver)
	  {
	    	 this.driver = driver;
	  }
	    
	    public void ClickOnSignIn(){

	        driver.findElement(SignUp).click();
	        

	    }

	    //Set Email ID textbox

	    public void EmailText(String EmailID){

	         driver.findElement(Email).sendKeys(EmailID);

	    }
	    public void GetStartButton(){

	    	driver.findElement(Getstr).click();

	    }
	    public void GetPassword(String Pass){

	    	driver.findElement(Password).sendKeys(Pass);
         }
	    public void ConfirmPassword(String ConfirmPass){

	    	driver.findElement(ConfirmPassword).sendKeys(ConfirmPass);
         }
	    
	    public void ContinueButtonT() throws InterruptedException{
	    	
	    	Thread.sleep(3000);

	    	driver.findElement(ContinuButton).click();
         }
	    
       public void FirstnameText(String FriName ) throws InterruptedException
       {
    	   Thread.sleep(3000);
	    	driver.findElement(FristName).sendKeys(FriName);
         }
       
       public void LastnameText(String LasName)
       {

	    	driver.findElement(LastName).sendKeys(LasName);
         }
       
       public void ContinueButtonB() throws InterruptedException{
	    	
	    	Thread.sleep(3000);

	    	driver.findElement(ContinueButton2).click();
        }
	     
       public void OrgeNameO(String OrgeName)
       {

	    	driver.findElement(OrgName).sendKeys(OrgeName);
         }
       public void OrgeEmailID(String OrgeEmail)
       {

	    	driver.findElement(OrgEmail).sendKeys(OrgeEmail);
         }
	    
       public void ClickOnContinue() throws InterruptedException
       {
   	    Thread.sleep(3000);
	    driver.findElement(ClickButtonCon).click();
	    

        }

}

	
	
	
	
