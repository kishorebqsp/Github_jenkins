package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Launch {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
