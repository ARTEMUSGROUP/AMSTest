package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ISFpage;
import resources.base;

public class ISFTest extends base {

	
	ISFpage Isf;
	@BeforeTest
	public void login() throws IOException
	{
		driver=pageLogin();
		//
	
		Isf=new ISFpage(driver);
	}

	@Test(priority=1)
	public void ItSelectionTab() throws InterruptedException					
	{
		Isf.ISF().click();
	Isf.AddOrignalISF().click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	AssertJUnit.assertTrue(Isf.PageTitle().isDisplayed());
}
	@Test(priority=2)
	public void vesseldetails() throws InterruptedException					
	{
		Select vessel = new Select(Isf.vesselId );
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
		Select Voyage = new Select(Isf.voyageId);
		Voyage.selectByValue("174915");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
		
		AssertJUnit.assertEquals(defaultItem, "1234");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	@Test(priority=4)
	public void loadPortId() throws InterruptedException					
	{
		for(int i=0; i<=2;i++){
			  try{

					Select discharge = new Select(Isf.loadPortId);
					discharge.selectByValue("4110");
					driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
					
					WebElement option = discharge.getFirstSelectedOption();
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
		public void DischargePortdetails() throws InterruptedException					
		{
			for(int i=0; i<=2;i++){
				  try{

						Select discharge = new Select(Isf.dischargePortId);
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
		
		
		@Test(priority=6)
		public void findbills() throws InterruptedException					
		{
			Isf.Find().click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		System.out.println(Isf.ISFError().getText());
		
		System.out.println(Isf.ISFsenttd().getText());
		}
		
		@Test(priority=7)
		public void Billstatus() throws InterruptedException					
		{
		  if(Isf.ISFsenttd().getText().equals("N") && Isf.ISFError().getText().equals("N"))
		  {
			  Isf.isISFSentCheckBox().click();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			  Isf.SubmitISFBill().click();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			  driver.switchTo().alert().accept();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  
				System.out.println(Isf.ISFsenttd().getText());

				  Isf.ISFTableRow().click();

				
		  }
		  
		  else
		  {
			  Isf.ISFTableRow().click();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			Assert.assertTrue(Isf.billDetailsTable().isDisplayed());  
			
			Assert.assertTrue(Isf.StatusTable2().isDisplayed());  

			  
			  System.out.println( Isf.billDetailsTable().getText());
			  
			  System.out.println("This is the last ISF send date for bill"+ Isf.SentDate().getText());
			  
			  System.out.println(Isf.StatusTable2().getText());
			  
		  }
		}
		@AfterTest
		public void homepage() throws InterruptedException
		{
			back();
			Thread.sleep(200);		

		}
		
		
		
}
