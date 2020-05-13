package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.AMSMainScreenPage;
import pageobject.ARTEMUSloginpage;
import pageobject.addoriginalmanifest;
import resources.base;

public class AMSMainScreenTest extends base{

	AMSMainScreenPage main;
   // public WebDriver driver;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
	
	main=new AMSMainScreenPage(driver);
	}
	
	
	
	
	@Test(priority=1)
	public void AMSMainScreen() throws InterruptedException					
	{
		main.AMS().click();
		main.AMSmainscreen().click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		AssertJUnit.assertTrue(main.pageTitle().isDisplayed());
		
	}
	@Test(priority=2)
	public void vesseldetailsmain() throws InterruptedException					
	{
		Select vessel = new Select(main.vesselIdmain );
		vessel.selectByValue("287825");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "ARTEMUS");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test(priority=3)
	public void Voyagedetailsmain() throws InterruptedException					
	{
		Select Voyage = new Select(main.voyageIdmain);
		Voyage.selectByValue("174915");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "1234");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test(priority=4)
	public void LoadPortdetailsmain() throws InterruptedException					
	{
		for(int i=0; i<=2;i++){
			  try{

					Select LoadPort = new Select(main.loadPort);
					LoadPort.selectByValue("4110");
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
					
					WebElement option = LoadPort.getFirstSelectedOption();
					String defaultItem = option.getText();
					System.out.println(defaultItem );
					
					AssertJUnit.assertEquals(defaultItem, "INDIANAPOLIS, IN");
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					break;
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
			}
		
		
	}

	@Test(priority=5)
	public void DischargePortdetailsmain() throws InterruptedException					
	{
		String dischargePort="1001";
		Select DischargePort = new Select(main.dischargePort);
		DischargePort.selectByValue(dischargePort);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = DischargePort.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "NEW YORK");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		

	}
	
	@Test(priority=6)
	public void findbillsmain() throws InterruptedException					
	{
		
		main.findinmain().click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(main.GridData().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

		

	}
	
	@Test(priority=7)
	public void validateport() throws InterruptedException					
	{
		
		AssertJUnit.assertTrue("INDIANAPOLIS, IN", main.loadportgriddata().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		AssertJUnit.assertTrue("NEW YORK", main.dischargportgriddata().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue("3", main.billcount().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	

	@Test(priority=8)
	public void validatebuttonDiv() throws InterruptedException					
	{
		
		main.GridData().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		AssertJUnit.assertTrue(main.buttonDiv().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

	@Test(priority=9)
	public void billDetailInformation() throws InterruptedException					
	{
		main.billDetailInformation().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    AssertJUnit.assertTrue(main.billDetailInformationRow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		String innerText =main.billDetailInformationRow().getText(); 	
        System.out.println(innerText); 
      
    /*    main.billDetailInformationExcel().click();
  	    Thread.sleep(2000);*/
				
		main.closepopup().click();

	}
	
	
	
	@Test(priority=10)
	public void CustomErrorScreen() throws InterruptedException					
	{
		main.customsErrorScreen().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    AssertJUnit.assertTrue(main.customErrorTableRow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		String innerText =main.customErrorTableRow().getText(); 	
        System.out.println(innerText); 
				
		main.closepopup().click();

	}
	

	@Test(priority=11)
	public void originalManifestTracking() throws InterruptedException					
	{
		main.originalManifestTracking().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    AssertJUnit.assertTrue(main.originalManifestTrackingRow.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		String innerText =main.originalManifestTrackingRow.getText(); 	
        System.out.println(innerText); 
				
		main.closepopup().click();

	}
	
	@Test(priority=12)
	public void BillAmendmentTracking() throws InterruptedException					
	{
		main.billAmendTracking().click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    AssertJUnit.assertTrue(main.billAmendTrackingRow.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		String innerText =main.billAmendTrackingRow.getText(); 	
        System.out.println(innerText); 
				
		main.closepopup().click();

	}
	

	@AfterTest
	public void homepage() throws InterruptedException
	{
		back();

//		driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");  
		Thread.sleep(200);		
	}
}
