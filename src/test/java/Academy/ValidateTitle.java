package Academy;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import Resources.Base;

public class ValidateTitle extends Base{

	
	@BeforeTest()
	public void initialLogin() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
}
