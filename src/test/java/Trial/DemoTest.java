package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{
	WebDriver driver;
	@Test
	public void ATest() 
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(opt);
			}
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			}
			else if(BROWSER.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			driver.get(URL);
	}

}
