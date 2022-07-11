package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By emailid=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("input[type='password']");
	By submit=By.cssSelector("input[value='Log In']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(emailid);
	}
	
	public WebElement getPass()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
	
}
