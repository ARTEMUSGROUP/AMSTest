package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.CustomerProfilepage;
import pageobject.billheaderpage;
import resources.base;
import resources.randombillnumber;

public class billheaderTest extends base {
	billheaderpage bh;
	randombillnumber num = new randombillnumber();
	String randomBillNumber;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();
		bh = new billheaderpage(driver);
	}

	// billdetail
	@Test(priority = 1)
	public void billheader() throws InterruptedException {

		bh.billoflading().click();

		bh.billheadertab().click();

		AssertJUnit.assertTrue("Bill Header", bh.pagetitle().isDisplayed());

	}

	@Test(priority = 2)
	public void billStatus() throws InterruptedException {
		randomBillNumber = "AutoBill" + num.generateRandomToken();
		bh.billLadingNumber().sendKeys(randomBillNumber);

		Select status = new Select(bh.billStatus);
		status.selectByValue("COMPLETE");

		WebElement option = status.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "COMPLETE");

	}

	@Test(priority = 3)
	public void billType() throws InterruptedException {

		Select type = new Select(bh.billType);
		type.selectByValue("WAY BILL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = type.getFirstSelectedOption();
		String defaultItem1 = option.getText();
		System.out.println(defaultItem1);

		AssertJUnit.assertEquals(defaultItem1, "WAY BILL");

	}

	@Test(priority = 4)
	public void hblScac() throws InterruptedException {
		bh.hblScac().sendKeys("MFUS");
		bh.populateHblScac().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.hblscacTableRow()));		
		bh.hblscacTableRow().click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.hblScac()));
		
		AssertJUnit.assertTrue("MFUS", bh.hblScac().isDisplayed());

	}

	@Test(priority = 5)
	public void NvoType() throws InterruptedException {

		Select NvoType = new Select(bh.nvoType);
		NvoType.selectByValue("AUTOMATED NVO");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = NvoType.getFirstSelectedOption();
		String defaultItem2 = option.getText();
		System.out.println(defaultItem2);

		AssertJUnit.assertEquals(defaultItem2, "AUTOMATED NVO");
	}

	// Shipping Information

	@Test(priority = 6)
	public void ShippingInformation() throws InterruptedException {
		bh.shipperName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
		bh.preshipperlist().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.shippertlistTableRow()));
		
		bh.shippertlistTableRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.shipperName()));
		AssertJUnit.assertTrue("ARTEMUS TRANSPORTATION SOLUTIONS", bh.shipperName().isDisplayed());


	}

	// Recipient Information

	// Consignee
	@Test(priority = 7)
	public void Consignee() throws InterruptedException {
		bh.consigneeName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
		bh.preconsigneelist().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.consigneetableRow()));
		
		bh.consigneetableRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.consigneeName()));
		AssertJUnit.assertTrue("ARTEMUS TRANSPORTATION SOLUTIONS", bh.consigneeName().isDisplayed());


	}

	// Notify
	@Test(priority = 7)
	public void Notify() throws InterruptedException {
		bh.notifyparty().click();
		bh.notifyName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
		bh.prenotifylist().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.notifyTableRow()));

		bh.notifyTableRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.notifyName()));
		AssertJUnit.assertTrue("ARTEMUS TRANSPORTATION SOLUTIONS", bh.notifyName().isDisplayed());

	}

	// Vessel Schedule

	@Test(priority = 8)
	public void VesselDetail() throws InterruptedException {
		bh.vesselName().sendKeys("TEST");
		bh.populateVessel().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.vesselNamelistRow()));

		bh.vesselNamelistRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.vesselName()));
		
		AssertJUnit.assertTrue("TEST VESSEL-0712", bh.vesselName().isDisplayed());
		Thread.sleep(2000);

	}

	@Test(priority = 9)
	public void receiptPlace() throws InterruptedException {

		bh.receiptPlace().sendKeys("HONG KONG");
		bh.getpreLocation().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.receiptPlaceTableRow()));

		bh.receiptPlaceTableRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.receiptPlace()));
		
		AssertJUnit.assertTrue("HONG KONG", bh.receiptPlace().isDisplayed());
	}

	@Test(priority = 10)
	public void PortOfLoading() throws InterruptedException {
		Thread.sleep(200);
		Select PortOfLoading = new Select(bh.loadPort);
		PortOfLoading.selectByValue("58201");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = PortOfLoading.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3);

		AssertJUnit.assertEquals(defaultItem3, "HONG KONG");

	}

	@Test(priority = 11)
	public void PortOfDischarge() throws InterruptedException {
		Thread.sleep(200);

		Select PortOfDischarge = new Select(bh.dischargePort);
		PortOfDischarge.selectByValue("2704");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = PortOfDischarge.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3);

		AssertJUnit.assertEquals(defaultItem3, "LOS ANGELES");
	}

	@Test(priority = 12)
	public void PlaceOfDelivery() throws InterruptedException {

		bh.deliveryPlace().sendKeys("LOS ANGELES");
		bh.getpredeliveryPlace().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.deliveryPlaceTableRow()));
		bh.deliveryPlaceTableRow().click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.deliveryPlace()));
		
		AssertJUnit.assertTrue("LOS ANGELES", bh.deliveryPlace().isDisplayed());
	}

	@Test(priority = 13)
	public void MoveType() throws InterruptedException {
		Select MoveType = new Select(bh.moveType);
		MoveType.selectByValue("FCL/FCL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = MoveType.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3);

		AssertJUnit.assertEquals(defaultItem3, "FCL/FCL");

	}

	@Test(priority = 14)
	public void CountryOfOrigin() throws InterruptedException {
		Select CountryOfOrigin = new Select(bh.originCountry);
		CountryOfOrigin.selectByValue("HK");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = CountryOfOrigin.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3);

		AssertJUnit.assertEquals(defaultItem3, "HONG KONG");
	}

	// Equipment

	@Test(priority = 15)
	public void Equipment() throws InterruptedException {
		bh.equipmentaddRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.equipment().sendKeys("GESU6767524");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select Equipment = new Select(bh.equipmentSizeTypeSelId);
		Equipment.selectByValue("20TRI");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	// scroll page
	@Test(priority = 16)
	public void scrollpage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// Packages

	@Test(priority = 17)
	public void Packages() throws InterruptedException {
		bh.packageAddRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.packageItem.sendKeys("01");

		Select Equipment = new Select(bh.packageEquipment);
		Equipment.selectByValue("GESU6767524");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.marks().sendKeys("Its automation!");
		bh.pieces().sendKeys("45");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select Packages = new Select(bh.packages);
		Packages.selectByValue("BAG");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Packages.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3);

		AssertJUnit.assertEquals(defaultItem3, "BAGS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 18)
	public void Packagesunit() throws InterruptedException {
		bh.waight().clear();
		bh.waight().sendKeys("1.1");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select wtiUnit = new Select(bh.wtiUnit());
		wtiUnit.selectByValue("LBS");

	}

	@Test(priority = 19)
	public void scrollpage2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	// Cargo

	@Test(priority = 20)
	public void equipmentcargodetails() throws InterruptedException {
		bh.cargoAddRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bh.cargoItem().sendKeys("01");
		Thread.sleep(2000);
	}

	@Test(priority = 21)
	public void goodsDescription() throws InterruptedException {
		bh.goodsDescription().sendKeys("Its Automation");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	// HarmonizeCode

	@Test(priority = 22)
	public void HarmonizeCode() throws InterruptedException {
		bh.harmonizedCode().sendKeys("1111");
		bh.harmonizedCode().sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(bh.HarmonizedtableRow()));
		
		bh.HarmonizedtableRow().click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(bh.harmonizedCode()));
		
		AssertJUnit.assertTrue("1701111000", bh.harmonizedCode().isDisplayed());

	}

	// Hazard Code

	@Test(priority = 23)
	public void HazardCode() throws InterruptedException {

		bh.hazardSearch().click();

		bh.preHazardcode().sendKeys("1111");

		bh.hazardSearchButton().click();

		bh.HarmonizedtableRow().click();

	}
	// Manufacturer

	@Test(priority = 24)
	public void Manufacturer() throws InterruptedException {
		bh.preManufacturerlist().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.Manufacturername().sendKeys("Avanti");
		bh.ManufacturerSearchButton().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.ManufacturerTableRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	// cargocountry

	@Test(priority = 25)
	public void cargocountry() throws InterruptedException {

		Select cargocountry = new Select(bh.cargoCountry);
		cargocountry.selectByValue("US");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 26)
	public void scrollpageup() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	// saveBill

	@Test(priority = 27)
	public void save() throws InterruptedException {

		bh.saveButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = (Alert) driver.switchTo().alert();
		alert.accept();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());	
		alert.accept();

	}

	@Test(priority = 28)
	public void findbill() throws InterruptedException {
		bh.findbill().click();
		bh.billSearch().sendKeys(randomBillNumber);
		bh.billSearchbutton().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.TableRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 29)
	public void updatebill() throws InterruptedException {
		Select type = new Select(bh.billType);
		type.selectByValue("ORIGNAL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = type.getFirstSelectedOption();
		String defaultItem1 = option.getText();
		System.out.println(defaultItem1);

		AssertJUnit.assertEquals(defaultItem1, "ORIGNAL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.saveButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = (Alert) driver.switchTo().alert();
		alert.accept();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());	
		alert.accept();

	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);
	}
}