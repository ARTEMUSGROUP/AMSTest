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
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.CustomerProfilepage;
import pageobject.billheaderpage;
import resources.base;
import resources.randombillnumber;

public class billheaderTest extends base{
	billheaderpage bh;
	randombillnumber num=new randombillnumber();
	String randomBillNumber;

   // public WebDriver driver;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
	bh=new billheaderpage(driver);
	}
	
	
	
	//billdetail
	@Test(priority=1)
	public void billheader() throws InterruptedException					
	{
		
		bh.billoflading().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.billheadertab().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		AssertJUnit.assertTrue("Bill Header", bh.pagetitle().isDisplayed());
		
	}

	@Test(priority=2)
	public void billStatus() throws InterruptedException					
	{
		randomBillNumber="AutoBill"+num.generateRandomToken();
		bh.billLadingNumber().sendKeys(randomBillNumber);		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Select status = new Select(bh.billStatus );
		status.selectByValue("COMPLETE");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = status.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "COMPLETE");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test(priority=3)
	public void billType() throws InterruptedException					
	{
		
		Select type = new Select(bh.billType );
		type.selectByValue("WAY BILL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		WebElement option = type.getFirstSelectedOption();
		String defaultItem1 = option.getText();
		System.out.println(defaultItem1 );
		
		AssertJUnit.assertEquals(defaultItem1, "WAY BILL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
		
	@Test(priority=4)
	public void hblScac() throws InterruptedException					
	{
        bh.hblScac().sendKeys("MFUS");
        bh.populateHblScac().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        bh.hblscacTableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test(priority=5)
	public void NvoType() throws InterruptedException					
	{
	
		Select NvoType	 = new Select(bh.nvoType );
		NvoType.selectByValue("AUTOMATED NVO");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		WebElement option = NvoType.getFirstSelectedOption();
		String defaultItem2 = option.getText();
		System.out.println(defaultItem2 );
		
		AssertJUnit.assertEquals(defaultItem2, "AUTOMATED NVO");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//  Shipping Information

	@Test(priority=6)
	public void ShippingInformation() throws InterruptedException					
	{
		bh.shipperName().sendKeys("CONSOLIDATED TELECOM SERVICES");
		bh.preshipperlist().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.shippertlistTableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	//Recipient Information

	//Consignee
	@Test(priority=7)
	public void Consignee() throws InterruptedException					
	{
	bh.consigneeName().sendKeys("SINOTRANS XIAMEN LOGISTICS CO., LTD");	
	bh.preconsigneelist().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	bh.consigneetableRow().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
	
	//Notify
	@Test(priority=7)
	public void Notify() throws InterruptedException					
	{
		bh.notifyparty().click();
		bh.notifyName().sendKeys("ARTEMUS TRANSPORTATION SOLUTIONS");
		bh.prenotifylist().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		bh.notifyTableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	//Vessel Schedule


	@Test(priority=8)
	public void VesselDetail() throws InterruptedException					
	{
	bh.vesselName().sendKeys("TEST");
	bh.populateVessel().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	bh.vesselNamelistRow().click();
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	AssertJUnit.assertTrue("TEST VESSEL-0712", bh.vesselName().isDisplayed());
	Thread.sleep(2000);


	}
	@Test(priority=9)
	public void receiptPlace() throws InterruptedException					
	{
	
	bh.receiptPlace().sendKeys("HONG KONG");
	bh.getpreLocation().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	bh.receiptPlaceTableRow().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		
	}
	@Test(priority=10)
	public void PortOfLoading() throws InterruptedException					
	{
		Thread.sleep(200);
		Select PortOfLoading= new Select(bh.loadPort );
		PortOfLoading.selectByValue("58201");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = PortOfLoading.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3 );
		
		AssertJUnit.assertEquals(defaultItem3, "HONG KONG");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	@Test(priority=11)
	public void PortOfDischarge() throws InterruptedException					
	{
		Thread.sleep(200);

		Select PortOfDischarge= new Select(bh.dischargePort );
		PortOfDischarge.selectByValue("2704");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = PortOfDischarge.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3 );
		
		AssertJUnit.assertEquals(defaultItem3, "LOS ANGELES");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test(priority=12)
	public void PlaceOfDelivery	() throws InterruptedException					
	{
	
	bh.deliveryPlace().sendKeys("LOS ANGELES");
	bh.getpredeliveryPlace().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	bh.deliveryPlaceTableRow().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
	
	@Test(priority=13)
	public void MoveType() throws InterruptedException					
	{
		Select MoveType= new Select(bh.moveType);
		MoveType.selectByValue("FCL/FCL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = MoveType.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3 );
		
		AssertJUnit.assertEquals(defaultItem3, "FCL/FCL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=14)
	public void CountryOfOrigin() throws InterruptedException					
	{
		Select CountryOfOrigin= new Select(bh.originCountry);
		CountryOfOrigin.selectByValue("HK");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = CountryOfOrigin.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3 );
		
		AssertJUnit.assertEquals(defaultItem3, "HONG KONG");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//Equipment


	@Test(priority=15)
	public void Equipment() throws InterruptedException					
	{
		bh.equipmentaddRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.equipment().sendKeys("GESU6767524");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		Select Equipment= new Select(bh.equipmentSizeTypeSelId);
		Equipment.selectByValue("20TRI");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	
	//scroll page
	@Test(priority=16)
	public void scrollpage() throws InterruptedException					
	{
		  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,450)", "");
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	//Packages

	@Test(priority=17)
	public void Packages() throws InterruptedException					
	{
		bh.packageAddRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.packageItem.sendKeys("01");
		
		Select Equipment= new Select(bh.packageEquipment);
		Equipment.selectByValue("GESU6767524");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		bh.marks().sendKeys("Its automation!");
		bh.pieces().sendKeys("45");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		Select Packages= new Select(bh.packages);
		Packages.selectByValue("BAG");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement option = Packages.getFirstSelectedOption();
		String defaultItem3 = option.getText();
		System.out.println(defaultItem3 );
		
		AssertJUnit.assertEquals(defaultItem3, "BAGS");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		
	}
	@Test(priority=18)
	public void Packagesunit() throws InterruptedException					
	{
		bh.waight().clear();
		bh.waight().sendKeys("1.1");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Select wtiUnit= new Select(bh.wtiUnit());
		wtiUnit.selectByValue("LBS");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=19)
	public void scrollpage2() throws InterruptedException					
	{
		  JavascriptExecutor js = (JavascriptExecutor) driver;
          js.executeScript("window.scrollBy(0,350)", "");
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//Cargo
	

	@Test(priority=20)
	public void equipmentcargodetails() throws InterruptedException					
	{
		bh.cargoAddRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		bh.cargoItem().sendKeys("01");
		Thread.sleep(2000);
	}	
		

	@Test(priority=21)
	public void goodsDescription() throws InterruptedException					
	{
		bh.goodsDescription().sendKeys("Its Automation");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
		
	//HarmonizeCode
	
	@Test(priority=22)
	public void HarmonizeCode() throws InterruptedException					
	{
		bh.harmonizedCode().sendKeys("1111");
		bh.preharmonizedcode().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		bh.harmonizedSearch().sendKeys("1111");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//bh.harmonizedSearchButton().click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.HarmonizedtableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	//Hazard Code	
	
	@Test(priority=23)
	public void HazardCode() throws InterruptedException					
	{
		
		bh.hazardSearch().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		bh.preHazardcode().sendKeys("1111");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.hazardSearchButton().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.HarmonizedtableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	//Manufacturer
	
	@Test(priority=24)
	public void Manufacturer() throws InterruptedException					
	{
		bh.preManufacturerlist().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		bh.Manufacturername().sendKeys("Avanti");
		bh.ManufacturerSearchButton().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.ManufacturerTableRow().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}
	//cargocountry
	

	@Test(priority=25)
	public void cargocountry() throws InterruptedException					
	{

		Select cargocountry= new Select(bh.cargoCountry);
		cargocountry.selectByValue("US");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=26)
	public void scrollpageup() throws InterruptedException					
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
          driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	//saveBill
	

	@Test(priority=27)
	public void save() throws InterruptedException					
	{
		
		bh.saveButton().click();
		  Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   //Using Alert class to first switch to or focus to the alert box  
        Alert alert = (Alert) driver.switchTo().alert();  
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //Using accept() method to accept the alert box  
        alert.accept();  
        
        Thread.sleep(2000);
      alert.accept();  

	}
		

	@Test(priority=28)
	public void findbill() throws InterruptedException					
	{
		bh.findbill().click();
		bh.billSearch().sendKeys(randomBillNumber);
		bh.billSearchbutton().click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		bh.TableRow().click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test(priority=29)
	public void updatebill() throws InterruptedException					
	{
		Select type = new Select(bh.billType );
		type.selectByValue("ORIGNAL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		WebElement option = type.getFirstSelectedOption();
		String defaultItem1 = option.getText();
		System.out.println(defaultItem1 );
		
		AssertJUnit.assertEquals(defaultItem1, "ORIGNAL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		bh.saveButton().click();
		  Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   //Using Alert class to first switch to or focus to the alert box  
      Alert alert = (Alert) driver.switchTo().alert();  
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      //Using accept() method to accept the alert box  
      alert.accept();  
      
      Thread.sleep(2000);
    alert.accept();  
	
	}
	@AfterTest
	public void homepage() throws InterruptedException
	{
		back();

//		driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");  
		Thread.sleep(200);		
	}
}