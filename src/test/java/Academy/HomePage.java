package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.Base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class HomePage extends Base {

	
	public void initial() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNav(String username,String password,String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPass().sendKeys(password);
		System.out.println(text);
		
		lp.getSubmit().click();				
	}	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="restrictedU";
		data[0][1]="123@pass";
		data[0][2]="Restricted user";
		
		data[1][0]="NonrestrictedU";
		data[1][1]="124@pass";
		data[1][2]="Not a Restricted user";
		
		return data;
	}
	
}

