package testartemus;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import resources.base;

public class ARTEMUSlogintest extends base{
	
	
	


	@BeforeSuite
	public void login() throws IOException
	{
	
	//	driver=initialiseDriver();
		driver.get("http://52.54.244.138:8080/AMS/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		ARTEMUSloginpage lg=new ARTEMUSloginpage(driver);
		
		  Assert.assertTrue(lg.Landingpage().isDisplayed());
		
		lg.loginSCAC().sendKeys("DEMO");
		
		lg.UserName().sendKeys("admin");
		
		lg.password().sendKeys("admin123");
		
		lg.submit().click();
		
		Assert.assertTrue(lg.checkLoginScac().isDisplayed(), "DEMOSCAC - DEMO - admin");
		
		Assert.assertTrue(lg.menubar().isDisplayed());
		

	}
	
	
	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
	
		driver.close();
		
	}
}
