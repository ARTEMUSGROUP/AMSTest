package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.browser.Browser;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.CustomerProfilepage;
import resources.base;

public class CustomerprofileTest extends base
{
	
	CustomerProfilepage cp;
   // public WebDriver driver;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
	
	cp=new CustomerProfilepage(driver);
	}
	
	
	
	
	@Test(priority=1)
	public void createcustomer() throws InterruptedException					
	{
		cp.createcustomer().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue(cp.pageTitle().isDisplayed());
		
		cp.customerName().sendKeys("AutomationData");
		cp.entityNumber().sendKeys("12-1218921");
		
		cp.address1().sendKeys("Pune India");
		cp.address2().sendKeys("Aundh sangavi");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.city().sendKeys("Pune");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Select s = new Select(cp.country );
		s.selectByValue("US");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Select state = new Select(cp.state );
		state.selectByValue("DC");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		cp.zipCode().sendKeys("411006");
		cp.phoneNo().sendKeys("9876543234");
		cp.faxNo().sendKeys("1111111111");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
		
	
	@Test(priority=2)
	public void savecustomer () throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.save().click();
		
		AssertJUnit.assertTrue(cp.dialogconfirm().isDisplayed());
		cp.saveentity().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

}
	
	@Test(priority=3)
	public void findcustomerassert() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.findcustomer().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue(cp.searchbox().isDisplayed());
	}
	
	@Test(priority=4)
	public void findcustomer() throws InterruptedException
	{
		cp.entercustName().sendKeys("AutomationData");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.SearchCust().click();		
		cp.SearchCustGridrow().click();
		Thread.sleep(2000);
		
	}
	

	@Test(priority=5)
	public void updatecustomer() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.city().clear();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.city().sendKeys("Mumbai");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		cp.save().click();
		AssertJUnit.assertTrue(cp.dialogconfirm().isDisplayed());
		cp.saveentity().click();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	}


	@Test(priority=6)
	public void deletecustomer() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		cp.deletecustomer().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
	
	}
	
	@AfterTest
	public void homepage() throws InterruptedException
	{
	back();
		//driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");  
		Thread.sleep(200);

	
		
	}
	
	
	
}
