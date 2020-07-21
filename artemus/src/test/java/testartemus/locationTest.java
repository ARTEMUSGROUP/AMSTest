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
import org.openqa.selenium.Keys;
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

public class locationTest extends base {

	locationPAage lp;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		lp = new locationPAage(driver);
	}

	@Test(priority = 1)
	public void createlocation() throws InterruptedException {
		lp.tableTab().click();
		lp.locationTab().click();

		AssertJUnit.assertTrue(lp.pageTitle().isDisplayed());

		Select s = new Select(lp.country);
		s.selectByValue("US");

		lp.portorcity().sendKeys("Testport");

		Select s2 = new Select(lp.state);
		s2.selectByValue("DC");

		Select s1 = new Select(lp.customscode);
		s1.selectByValue("3010");

		lp.holdAtLp().sendKeys("1111111111");
		
	}

	@Test(priority = 2)
	public void warehousedetail() throws InterruptedException {
		lp.canadaCustomeCode().sendKeys("1212");

		lp.canadaCustomeCode().sendKeys(Keys.ENTER);


		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(lp.warehousedetails()));
		lp.warehousedetails().click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(lp.warehouseCode()));
		
		AssertJUnit.assertTrue("3222", lp.warehouseCode().isDisplayed());


	}

	@Test(priority = 3)
	public void unlocodedetail() throws InterruptedException {

		lp.unlocode().sendKeys("ADZZZ");
		lp.unlocode().sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(lp.unlocodedetails()));
		lp.unlocodedetails().click();

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(lp.unlocode()));
		
		AssertJUnit.assertTrue("ADZZZ", lp.unlocode().isDisplayed());

		
	}

	@Test(priority = 4)
	public void savelocation() throws InterruptedException {
		lp.save().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 5)
	public void findlocation() throws InterruptedException {
		lp.findlocation().click();

		AssertJUnit.assertTrue(lp.enterlocation().isDisplayed());

	}

	@Test(priority = 6)
	public void findlocationassert() throws InterruptedException {

		lp.enterlocation().sendKeys("Testport");
		lp.searchlocation().click();

		AssertJUnit.assertEquals(lp.searchcheck().getText(), "TESTPORT");


	}

	@Test(priority = 7)
	public void findlocationingrid() throws InterruptedException {
		lp.searchgrid().click();

	}

	@Test(priority = 8)
	public void updatelocation() throws InterruptedException {
		lp.holdAtLp().clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp.holdAtLp().sendKeys("2222222222");
		lp.save().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}

	@Test(priority = 9)
	public void deletelocation() throws InterruptedException {
		lp.deletelocation().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

	}

}
