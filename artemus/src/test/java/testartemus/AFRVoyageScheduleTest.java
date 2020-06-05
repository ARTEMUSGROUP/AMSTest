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

import pageobject.AFRVoyageSchedule;
import pageobject.ARTEMUSloginpage;
import resources.base;
import resources.utilpage;

public class AFRVoyageScheduleTest extends base {

	utilpage objUtilPage = new utilpage();
	ArrayList<String> dates = objUtilPage.dates();
	AFRVoyageSchedule jpv;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		jpv = new AFRVoyageSchedule(driver);
	}

	@Test(priority = 1)
	public void jpvoyegetab() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.JapanCustoms().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.voyageschedule().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(jpv.pageTitle().isDisplayed());

	}

	@Test(priority = 2)
	public void vesseldetail() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select s = new Select(jpv.vesselId);
		s.selectByValue("144682");
		Thread.sleep(2000);
		WebElement option = s.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "DUBAI EXPRESS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssertJUnit.assertTrue("HLCU", jpv.scacCodeDiv().isDisplayed());

	}

	@Test(priority = 3)
	public void voyegedetail() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.voyage().sendKeys("1722");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		jpv.crewMembers().sendKeys("1232");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.passengers().sendKeys("45");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void firstlocationdetails() throws InterruptedException {
		jpv.addNewlocation().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(jpv.newrow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.add1stlocation().sendKeys("MANCHESTER");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.getPreLocationList().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.selectfromtable().click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void datedetails() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		jpv.arrivalDater1().sendKeys(dates.get(0));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.sailingDater1().sendKeys(dates.get(1));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void portdetails() throws InterruptedException {

		jpv.loadCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.lastLoadPortCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 7)
	public void secondlocationdetails() throws InterruptedException {
		jpv.addNewlocation().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.add2stlocation().sendKeys("TOKYO");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.getPreLocationList2().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		jpv.selectfromtable().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 8)
	public void datedetailstwo() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.arrivalDater2().sendKeys(dates.get(1));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.sailingDater2().sendKeys(dates.get(2));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 9)
	public void portdetailstwo() throws InterruptedException {
		jpv.dischargeCheckBox2().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 10)
	public void savevoyege() throws InterruptedException {
		jpv.savevoyege().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 11)
	public void findvoyege() throws InterruptedException {
		jpv.findvoyege().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(jpv.searchpopup().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.entervoyege().sendKeys("1722");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.SearchButton().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssertJUnit.assertTrue(jpv.gridrow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.gridrow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 12)
	public void updatevoyege() throws InterruptedException {
		AssertJUnit.assertTrue("1722", jpv.voyage().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jpv.crewMembers().clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.crewMembers().sendKeys("45");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		jpv.savevoyege().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 13)
	public void deletevoyege() throws InterruptedException {

		jpv.deletevoyege().click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();
		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);

	}
}
