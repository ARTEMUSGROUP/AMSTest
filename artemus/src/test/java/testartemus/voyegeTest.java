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
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.Voyagepage;
import pageobject.vesselpage;
import resources.base;
import resources.utilpage;

public class voyegeTest extends base{
	
	utilpage objUtilPage=new utilpage();
	ArrayList<String> dates=objUtilPage.dates();
	Voyagepage vy;
   // public WebDriver driver;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
	
	vy=new Voyagepage(driver);
	}
	
	@Test(priority=1)
	public void voyegetab() throws InterruptedException					
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.voyageTab().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		vy.voyageschedule().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue(vy.pageTitle().isDisplayed());
		
}
	
	@Test(priority=2)
	public void vesseldetail() throws InterruptedException					
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Select s = new Select(vy.vesselId);
		s.selectByValue("144682");
		Thread.sleep(2000);
		WebElement option = s.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "DUBAI EXPRESS");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		AssertJUnit.assertTrue("HLCU", vy.scacCodeDiv().isDisplayed());

	

	}
	
	@Test(priority=3)
	public void voyegedetail() throws InterruptedException					
	{
		
		

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.voyage().sendKeys("1721");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.crewMembers().sendKeys("1232");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		vy.passengers().sendKeys("45");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	

	}
	
	@Test(priority=4)
	public void firstlocationdetails() throws InterruptedException					
	{	
		vy.addNewlocation().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		AssertJUnit.assertTrue(vy.newrow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.add1stlocation().sendKeys("MANCHESTER");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		vy.getPreLocationList().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		vy.selectfromtable().click();
		Thread.sleep(2000);
		
	}

	@Test(priority=5)
	public void datedetails() throws InterruptedException					
	{ 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		vy.arrivalDater1().sendKeys(dates.get(0));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.sailingDater1().sendKeys(dates.get(1));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
	
	@Test(priority=6)
	public void portdetails() throws InterruptedException					
	{
		
		vy.loadCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        vy.lastLoadPortCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	
	@Test(priority=7)
	public void secondlocationdetails() throws InterruptedException					
	{
		vy.addNewlocation().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
		vy.add2stlocation().sendKeys("AKRON");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		vy.getPreLocationList2().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		vy.selectfromtable().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	
	
	@Test(priority=8)
	public void datedetailstwo() throws InterruptedException					
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		vy.arrivalDater2().sendKeys(dates.get(1));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.sailingDater2().sendKeys(dates.get(2));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
	
	@Test(priority=9)
	public void portdetailstwo() throws InterruptedException					
	{
		vy.dischargeCheckBox2().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	@Test(priority=10)
	public void savevoyege() throws InterruptedException					
	{
		vy.savevoyege().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test(priority=11)
	public void findvoyege() throws InterruptedException					
	{
		vy.findvoyege().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
        AssertJUnit.assertTrue(vy.searchpopup().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.entervoyege().sendKeys("1721");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        vy.SearchButton().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        AssertJUnit.assertTrue(vy.gridrow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		vy.gridrow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	@Test(priority=12)
	public void updatevoyege() throws InterruptedException					
	{
		AssertJUnit.assertTrue("1721", vy.voyage().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        vy.crewMembers().clear();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.crewMembers().sendKeys("45");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		vy.savevoyege().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=13)
	public void deletevoyege() throws InterruptedException					
	{
		
		vy.deletevoyege().click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		
	}
		
	@AfterTest
	public void homepage() throws InterruptedException
	{
		back();
		//driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");  
		Thread.sleep(200);		

	}
}
