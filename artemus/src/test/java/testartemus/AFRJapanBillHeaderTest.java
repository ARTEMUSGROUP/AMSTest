package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.AFRJapanBillHeaderPage;
import pageobject.billheaderpage;
import resources.base;
import resources.randombillnumber;

public class AFRJapanBillHeaderTest extends base {

	AFRJapanBillHeaderPage bh;
	randombillnumber num = new randombillnumber();
	String randomBillNumber;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();
		bh = new AFRJapanBillHeaderPage(driver);
	}

	// billdetail
	@Test(priority = 1)
	public void billheader() throws InterruptedException {

		bh.JapanCustoms().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		bh.AFRBillHeader().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue("AFR Bill Header", bh.PageTitle().isDisplayed());

	}

	@Test(priority = 2)
	public void billStatus() throws InterruptedException {
		randomBillNumber = "AutoBill" + num.generateRandomToken();
		bh.billLadingNumber().sendKeys(randomBillNumber);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select status = new Select(bh.billStatus);
		status.selectByValue("COMPLETE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = status.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "COMPLETE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test(priority = 4)
	public void hblScac() throws InterruptedException {
		bh.hblScac().sendKeys("MFUS");
		bh.populateHblScac().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		bh.hblscacTableRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	// Shipping Information

		@Test(priority = 6)
		public void ShippingInformation() throws InterruptedException {
			bh.shipperName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
			bh.preshipperlist().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.shippertlistTableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		// Recipient Information

		// Consignee
		@Test(priority = 7)
		public void Consignee() throws InterruptedException {
			bh.consigneeName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
			bh.preconsigneelist().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.consigneetableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		// Notify
		@Test(priority = 7)
		public void Notify() throws InterruptedException {
			bh.notifyparty().click();
			bh.notifyName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
			bh.prenotifylist().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.notifyTableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		@Test(priority = 8)
		public void VesselDetail() throws InterruptedException {
			bh.vesselName().sendKeys("BRUSSELS BRIDGE");
			bh.populateVessel().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.vesselNamelistRow().click();
			// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			AssertJUnit.assertTrue("BRUSSELS BRIDGE-044W", bh.vesselName().isDisplayed());
			Thread.sleep(2000);
}
		

		@Test(priority = 9)
		public void receiptPlace() throws InterruptedException {

			bh.receiptPlace().sendKeys("OAKLAND");
			bh.getpreLocation().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.receiptPlaceTableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		@Test(priority = 10)
		public void PortOfLoading() throws InterruptedException {
			Thread.sleep(200);
			Select PortOfLoading = new Select(bh.loadPort);
			PortOfLoading.selectByValue("2811");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement option = PortOfLoading.getFirstSelectedOption();
			String defaultItem3 = option.getText();
			System.out.println(defaultItem3);

			AssertJUnit.assertEquals(defaultItem3, "OAKLAND");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		@Test(priority = 11)
		public void PortOfDischarge() throws InterruptedException {
			Thread.sleep(200);

			Select PortOfDischarge = new Select(bh.dischargePort);
			PortOfDischarge.selectByValue("58886");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement option = PortOfDischarge.getFirstSelectedOption();
			String defaultItem3 = option.getText();
			System.out.println(defaultItem3);

			AssertJUnit.assertEquals(defaultItem3, "TOKYO");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@Test(priority = 12)
		public void PlaceOfDelivery() throws InterruptedException {

			bh.deliveryPlace().sendKeys("TOKYO");
			bh.getpredeliveryPlace().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.deliveryPlaceTableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		// Equipment

		@Test(priority = 15)
		public void Equipment() throws InterruptedException {
			bh.equipmentaddRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.equipment().sendKeys("GESU6767524");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Select Equipment = new Select(bh.equipmentSizeTypeSelId);
			Equipment.selectByValue("20CHH");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Select serviceType = new Select(bh.serviceType);
			serviceType.selectByValue("51");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Select containerOwnership = new Select(bh.containerOwnership);
			containerOwnership.selectByValue("2");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			

			Select vanningType = new Select(bh.vanningType);
			vanningType.selectByValue("4");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Select costomConventionId = new Select(bh.costomConventionId);
			costomConventionId.selectByValue("1");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			bh.AddRowEqip().click();
			bh.seal().sendKeys("1122");
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
			Packages.selectByValue("BG");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement option = Packages.getFirstSelectedOption();
			String defaultItem3 = option.getText();
			System.out.println(defaultItem3);

			AssertJUnit.assertEquals(defaultItem3, "Bag");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		@Test(priority = 18)
		public void Packagesunit() throws InterruptedException {
			bh.waight().clear();
			bh.waight().sendKeys("1.1");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Select wtiUnit = new Select(bh.wtiUnit());
			wtiUnit.selectByValue("LBS");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		@Test(priority = 19)
		public void scrollpage2() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		// Cargo

		@Test(priority = 20)
		public void equipmentcargodetails() throws InterruptedException {
			bh.AddRowCargo().click();
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
			bh.harmonizedCode().click();
			bh.preharmonizedcode().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.harmonizedSearch().sendKeys("1111");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			 bh.harmonizedSearchButton().click();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			bh.HarmonizedtableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}

		// Hazard Code

		@Test(priority = 23)
		public void HazardCode() throws InterruptedException {

			bh.hazardSearch().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.preHazardcode().sendKeys("1111");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.hazardSearchButton().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.HarmonizedtableRow().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		@Test(priority = 24)
		public void scrollpageup() throws InterruptedException {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@Test(priority = 25)
		public void save() throws InterruptedException {

			bh.SaveBill().click();
			Thread.sleep(200);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			// Using Alert class to first switch to or focus to the alert box
			Alert alert = (Alert) driver.switchTo().alert();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// Using accept() method to accept the alert box
			alert.accept();

			//Thread.sleep(2000);
			alert.accept();

		}
		
		@Test(priority = 26)
		public void findbill() throws InterruptedException {
			bh.Find().click();
			bh.billSearch().sendKeys(randomBillNumber);
			bh.Search().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.until(ExpectedConditions.visibilityOf(bh.TableGrid()));			
       	bh.TableRow().click();
        

		}
		@Test(priority = 26)
		public void updatebill() throws InterruptedException {
			Select type = new Select(bh.billType);
			type.selectByValue("ORIGNAL");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement option = type.getFirstSelectedOption();
			String defaultItem1 = option.getText();
			System.out.println(defaultItem1);

			AssertJUnit.assertEquals(defaultItem1, "ORIGNAL");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			bh.SaveBill().click();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = (Alert) driver.switchTo().alert();
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();

			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());		
			alert.accept();

		}

		@AfterTest
		public void homepage() throws InterruptedException {
			back();

			// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
			Thread.sleep(200);
		}
		
		
}
		
		
		
		
		
