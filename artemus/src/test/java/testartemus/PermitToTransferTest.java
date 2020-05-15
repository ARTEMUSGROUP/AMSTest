package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ItSelectionScreenPage;
import pageobject.PermitToTransferPage;
import resources.base;

public class PermitToTransferTest extends base {

	
	PermitToTransferPage pt;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
		//
	
	pt=new PermitToTransferPage(driver);
	}

	@Test(priority=1)
	public void ItSelectionTab() throws InterruptedException					
	{
	pt.AMS().click();
	pt.PermitToTransfer().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	AssertJUnit.assertTrue(pt.PageTitle().isDisplayed());
}
	@Test(priority=2)
	public void vesseldetails() throws InterruptedException					
	{
		Select vessel = new Select(pt.vesselId );
		vessel.selectByValue("287825");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "ARTEMUS");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test(priority=3)
	public void Voyagedetails() throws InterruptedException					
	{
		Select Voyage = new Select(pt.voyageId);
		Voyage.selectByValue("174915");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "1234");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	@Test(priority=4)
	public void DischargePortdetails() throws InterruptedException					
	{
		for(int i=0; i<=2;i++){
			  try{

					Select discharge = new Select(pt.dischargePort);
					discharge.selectByValue("1001");
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
					
					WebElement option = discharge.getFirstSelectedOption();
					String defaultItem = option.getText();
					System.out.println(defaultItem );
					
				   AssertJUnit.assertEquals(defaultItem, "NEW YORK");
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					break;
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
			}

	}
	@Test(priority=5)
	public void findbills() throws InterruptedException					
	{
	
		
		pt.Find().click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		try{
			System.out.println(pt.TableRow().getText());
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		}
		catch(Exception e)
		{
			pt.New().click();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			
			Select billladingid = new Select(pt.billladingid());
			billladingid.selectByValue("453650");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			pt.cFirms().sendKeys("1234");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			pt.cIRSNumber().sendKeys("987654");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			pt.billFind().click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			pt.objCheckBox().click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			pt.objChecksave().click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			

		}
		
		
		}

	@Test(priority=6)
	public void changeAckName() throws InterruptedException					
	{
		pt.changeAckName().click();
		Thread.sleep(200);			
	}
	@AfterTest
	public void homepage() throws InterruptedException
	{
		back();
		Thread.sleep(200);		

	}

}



