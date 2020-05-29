package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.MainCanadianCustomsScreen;
import resources.base;

public class CandaMainScreenTest extends base {

	MainCanadianCustomsScreen Cm;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		Cm = new MainCanadianCustomsScreen(driver);
	}

	@Test(priority = 1)
	public void AMSMainScreen() throws InterruptedException {
		Cm.CanadaCustoms().click();
		Cm.MainCanadianCustoms().click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Cm.pageTitle().isDisplayed());

	}

	@Test(priority = 2)
	public void vesseldetailsmain() throws InterruptedException {
		Select vessel = new Select(Cm.vesselIdmain);
		vessel.selectByValue("222445");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "H LEE WHITE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void Voyagedetailsmain() throws InterruptedException {
		Select Voyage = new Select(Cm.voyageIdmain);
		Voyage.selectByValue("128173");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "15068");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void LoadPortdetailsmain() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select LoadPort = new Select(Cm.loadPort);
				LoadPort.selectByValue("4101");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebElement option = LoadPort.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println(defaultItem);

				AssertJUnit.assertEquals(defaultItem, "SANDUSKY");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test(priority = 5)
	public void DischargePortdetailsmain() throws InterruptedException {
		String dischargePort = "09000";
		Select DischargePort = new Select(Cm.dischargePort);
		DischargePort.selectByValue(dischargePort);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = DischargePort.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "SAULT ST MARIE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void findbillsmain() throws InterruptedException {

		Cm.findinmain().click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(Cm.GridData().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 7)
	public void validateRow() throws InterruptedException {
		
		Cm.GridData().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Cm.buttonDiv().isDisplayed());

		
	}
	@Test(priority = 8)
	public void CanCustBLDetailImportedCargoScreen() throws InterruptedException {
		
		Cm.CanCustBLDetailImportedCargoScreen().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		System.out.println(Cm.canadianbillDetailInformationTable().getText());
		Cm.canadianbillDetailInformationTable().click();
		
		AssertJUnit.assertTrue(Cm.canadianbillDetailInformationTableDiv().isDisplayed());
		
	}
	@Test(priority = 9)
	public void showAcknowledgement() throws InterruptedException {
		
		Cm.showAcknowledgement().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(Cm.selectacknowledgementRow().getText());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test(priority = 10)
	public void customsCanadianAmendmentforBL() throws InterruptedException {
		
		Cm.customsCanadianAmendmentforBL().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Select Actioncode=new Select(Cm.actionCode);
		Actioncode.selectByValue("A");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Select amendmentCode=new Select(Cm.amendmentCode);
		amendmentCode.selectByValue("20");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cm.Submit().click();
		
		Cm.close().click();
		
		Thread.sleep(200);
		
		driver.switchTo().alert().accept();
		
		System.out.println(Cm.canadianbillDetailInformationTable().getText());
	}
	
	
	@Test(priority = 11)
	public void Message() throws InterruptedException {
		
		
		
		Cm.Message().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cm.Messageclose().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cm.close1stTab().click();
		
		System.out.println(Cm.GridData().getText());
	
	}
		
	@Test(priority = 12)
	public void CanCustBLDetailFROBECargo() throws InterruptedException {
		
		Cm.CanCustBLDetailFROBECargo().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		System.out.println(Cm.CanCustBLDetailFROBECargoRow().getText());
		Cm.canadianbillDetailInformationTable().click();
		
		AssertJUnit.assertTrue(Cm.CanCustBLDetailFROBECargoDiv().isDisplayed());
		
	}
	@Test(priority = 13)
	public void showAcknowledgementFROBE() throws InterruptedException {
		
		Cm.showAcknowledgement().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println(Cm.selectacknowledgementRow().getText());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test(priority = 14)
	public void customsCanadianAmendmentforBLFROBE() throws InterruptedException {
		
		Cm.customsCanadianAmendmentforBL().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Select Actioncode=new Select(Cm.actionCode);
		Actioncode.selectByValue("A");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Select amendmentCode=new Select(Cm.amendmentCode);
		amendmentCode.selectByValue("20");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cm.Submit().click();
		
		Cm.close().click();
		
		Thread.sleep(200);
		
		driver.switchTo().alert().accept();
		
		System.out.println(Cm.canadianbillDetailInformationTable().getText());
	}
	
	@Test(priority = 15)
	public void MessageFROBE() throws InterruptedException {
		
		Cm.Message().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cm.Messageclose().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Cm.close1stTab().click();
		
		System.out.println(Cm.GridData().getText());
	
	}
		
	@Test(priority = 16)
	public void CustomsErrorScreen() throws InterruptedException {
		
		Cm.CustomsErrorScreen().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		Cm.close1stTab().click();
		
		System.out.println(Cm.GridData().getText());
	
	}
	
	@Test(priority = 17)
	public void AmendTrackingScreen() throws InterruptedException {
		
		Cm.AmendTrackingScreen().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*List<WebElement> CreateDateList=Cm.CreatedDate;
		
		
		System.out.println(CreateDateList.size());
		//System.out.println("tITLE"+CreateDateList);
	
	for(int i=0;i<CreateDateList.size();i++){
		System.out.println("index"+CreateDateList.get(i).getText());
		
		
	}*/
		
		//System.out.println(Cm.CreatedDate);
	/*	List<String> strings = new ArrayList<String>();
		for(WebElement e : Cm.CreatedDate){
		    strings.add(e.getText());
		    
		    System.out.println((e.getText()));*/
		//}
		
	//	System.out.println("dates are"+Cm.CreatedDate());
		
		
		Cm.close1stTab().click();
		
		System.out.println(Cm.GridData().getText());
	
	}
	
	
}
