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
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.CustomerProfilepage;
import pageobject.locationPAage;
import resources.base;

public class locationTest extends base{

	locationPAage lp;
	
    //public WebDriver driver;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
	
	lp=new locationPAage(driver);
	}
	
	@Test(priority=1)
	public void createlocation() throws InterruptedException					
	{
		lp.tableTab().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		lp.locationTab().click();
		
		AssertJUnit.assertTrue(lp.pageTitle().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Select s = new Select(lp.country );
		s.selectByValue("US");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		lp.portorcity().sendKeys("Testport");
		
		
		
		Select s2 = new Select(lp.state );
		s2.selectByValue("DC");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		Select s1 = new Select(lp.customscode);
		s1.selectByValue("3010");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		lp.holdAtLp().sendKeys("1111111111");
		lp.canadaCustomeCode().sendKeys("1212");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	}
	
	@Test(priority=2)
	public void warehousedetail() throws InterruptedException
	{
		
	 lp.warehouseCode().sendKeys("1212");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String innerText =lp.warehousedetails().getText(); 	
		        System.out.println(innerText); 
		        lp.warehousedetails().click();
		        Thread.sleep(20000);
		      
	}
	@Test(priority=3)
	public void unlocodedetail() throws InterruptedException
	{
        Thread.sleep(200);

		lp.unlocode().sendKeys("ADZZZ");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		lp.unlocodedetails().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		
}
	@Test(priority=4)
	public void savelocation() throws InterruptedException
	{
		lp.save().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Test(priority=5)
	public void findlocation() throws InterruptedException
	{
		lp.findlocation().click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue(lp.enterlocation().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@Test(priority=6)
	public void findlocationassert() throws InterruptedException
	{
		
		lp.enterlocation().sendKeys("Testport");
		lp.searchlocation().click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        AssertJUnit.assertEquals(lp.searchcheck().getText(), "TESTPORT");	
        
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
	}
	@Test(priority=7)
	public void findlocationingrid() throws InterruptedException
	{
		lp.searchgrid().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@Test(priority=8)
	public void updatelocation() throws InterruptedException
	{
		lp.holdAtLp().clear();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		lp.holdAtLp().sendKeys("2222222222");
		lp.save().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=9)
	public void deletelocation() throws InterruptedException
	{
	lp.deletelocation().click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.switchTo().alert().accept();
	
	
	}
	
	@AfterTest
	public void homepage() throws InterruptedException
	{
		back();

//		driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");  
		Thread.sleep(200);		
	}
	
}
