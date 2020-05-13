package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
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
	pt.ItSelectionScreen().click();
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


}



