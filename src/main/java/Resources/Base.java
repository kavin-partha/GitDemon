package Resources;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Base {

	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kavin\\eclipse-workspace\\E2EProject\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browser=prop.getProperty("browser");
	
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			
		}
		else if(browser.equals("Egde"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}	
}
