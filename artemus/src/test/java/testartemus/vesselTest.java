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

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.locationPAage;
import pageobject.vesselpage;
import resources.base;

public class vesselTest extends base {

	vesselpage vp;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		vp = new vesselpage(driver);
	}

	@Test(priority = 1)
	public void createvessel() throws InterruptedException {
		vp.tableTab().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.vesseltab.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(vp.pageTitle().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		vp.vesselName().sendKeys("automation vessel");

		Select s = new Select(vp.vesselType);
		s.selectByValue("General Cargo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		vp.owner().sendKeys("Giant leap systems");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.lloydsCode().sendKeys("81723");

		Select s1 = new Select(vp.country);
		s1.selectByValue("HK");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		vp.usaScacCode().sendKeys("DEMO");

	}

	@Test(priority = 2)
	public void japancarriercode() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.japanCarrierCode().sendKeys("11WF");
		vp.japanCarrierCode().sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		vp.japanCarrierdetails().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		vp.callsign().sendKeys("232323456");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(vp.sendtocustomcheck().isSelected());

	}

	@Test(priority = 3)
	public void savevessel() throws InterruptedException {
		vp.savevessel().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		Thread.sleep(200);

	}

	@Test(priority = 4)
	public void findvessel() throws InterruptedException {

		vp.findvessel().click();

		AssertJUnit.assertTrue(vp.searchVessel().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 5)
	public void findvesselname() throws InterruptedException {
		vp.searchVessel().sendKeys("automation vessel");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.SearchButton().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AssertJUnit.assertEquals(vp.searchcheckvessel().getText(), "AUTOMATION VESSEL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		vp.searchgrid().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 6)
	public void updatevessel() throws InterruptedException {
		vp.usaScacCode().clear();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.usaScacCode().sendKeys("MFUS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vp.savevessel().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		Thread.sleep(200);

	}

	@Test(priority = 7)
	public void deletevessel() throws InterruptedException {
		vp.deletevessel().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		Thread.sleep(200);

	}

	@AfterTest
	public void homepage() throws InterruptedException {

		driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);
	}
}
