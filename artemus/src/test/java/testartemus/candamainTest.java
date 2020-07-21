package testartemus;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.MainCanadianCustomsScreen;
import resources.base;

public class candamainTest extends base {
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
		String tableValue = Cm.canadianbillDetailInformationTable1().getText().trim();
		System.out.println(tableValue);
		

		if (tableValue.contains("ADD")) {

			Cm.canadianbillDetailInformationTable().click();

			AssertJUnit.assertTrue(Cm.canadianbillDetailInformationTableDiv().isDisplayed());
			
			
			Cm.showAcknowledgement().click();

			System.out.println(Cm.selectacknowledgementRow().getText());

			Cm.customsCanadianAmendmentforBL().click();

			Select Actioncode = new Select(Cm.actionCode);
			Actioncode.selectByValue("A");

			Select amendmentCode = new Select(Cm.amendmentCode);
			amendmentCode.selectByValue("20");

			Cm.Submit().click();


			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			Cm.closeAmendment().click();
			
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(Cm.canadianbillDetailInformationTable()));
			
			System.out.println(Cm.canadianbillDetailInformationTable().getText());

			
			Cm.Message().click();

			Cm.Messageclose().click();
			
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(Cm.canadianbillDetailInformationTable()));
			
			
			Cm.Dispositioncode().click();
			Thread.sleep(200);
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentid = it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());

			driver.switchTo().window(parentid);
			System.out.println(driver.getTitle());

			Cm.close1stTab().click();

			System.out.println(Cm.GridData().getText());

			
			
			
		} else {
			Cm.Dispositioncode().click();
			Thread.sleep(200);
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentid = it.next();
			String childid = it.next();
			driver.switchTo().window(childid);
			System.out.println(driver.getTitle());

			driver.switchTo().window(parentid);
			System.out.println(driver.getTitle());

			//Cm.close1stTab().click();

			//System.out.println(Cm.GridData().getText());

			Cm.close().click();

		}
	}

	@Test(priority = 9)
	public void CanCustBLDetailFROBECargo() throws InterruptedException {
		Cm.CanCustBLDetailFROBECargo().click();
		String tableValue = Cm.canadianbillDetailInformationTable1().getText().trim();
		System.out.println(tableValue);
		
		
		if (tableValue.contains("ADD")) {
			Cm.canadianbillDetailInformationTable().click();

			AssertJUnit.assertTrue(Cm.CanCustBLDetailFROBECargoDiv().isDisplayed());

			
			Cm.showAcknowledgement().click();

			System.out.println(Cm.selectacknowledgementRow().getText());
			
			Cm.customsCanadianAmendmentforBL().click();

			Select Actioncode = new Select(Cm.actionCode);
			Actioncode.selectByValue("A");

			Select amendmentCode = new Select(Cm.amendmentCode);
			amendmentCode.selectByValue("20");

			Cm.Submit().click();

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			Cm.closeAmendment().click();

			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(Cm.canadianbillDetailInformationTable()));
			
			System.out.println(Cm.canadianbillDetailInformationTable().getText());
			
			Cm.Message().click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Cm.Messageclose().click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			Cm.close1stTab().click();

			System.out.println(Cm.GridData().getText());
		}
		 else {
				Cm.Dispositioncode().click();
				Thread.sleep(200);
				Set<String> ids = driver.getWindowHandles();
				Iterator<String> it = ids.iterator();
				String parentid = it.next();
				String childid = it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.getTitle());

				driver.switchTo().window(parentid);
				System.out.println(driver.getTitle());

				//Cm.close1stTab().click();

				//System.out.println(Cm.GridData().getText());

				Cm.close().click();

		 }
	}
	
	@Test(priority = 10)
	public void CustomsErrorScreen() throws InterruptedException {

		Cm.CustomsErrorScreen().click();

		Cm.close1stTab().click();

		System.out.println(Cm.GridData().getText());

	}

	@Test(priority = 11)
	public void AmendTrackingScreen() throws InterruptedException {

		Cm.AmendTrackingScreen().click();

	
		Cm.close1stTab().click();

		System.out.println(Cm.GridData().getText());
	}

	@Test(priority = 12)
	public void VoyageConveyance() throws InterruptedException {

		Cm.VoyageConveyance().click();

		Cm.New().click();

		Select amendmentCode1 = new Select(Cm.actionCode1);
		amendmentCode1.selectByValue("A");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cm.Save().click();

		Cm.closevoyage().click();
		Thread.sleep(200);
		driver.switchTo().alert().accept();

	}

	@Test(priority = 13)
	public void CACM() throws InterruptedException {

		Cm.GridData().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cm.CACMC().click();

		Cm.Send().click();

		Thread.sleep(200);

		driver.switchTo().alert().accept();

		Cm.closevoyage().click();

	}

	@Test(priority = 14)
	public void HouseBillClose() throws InterruptedException {

		Cm.HouseBillClose().click();

		Select Actioncode = new Select(Cm.actionCode1);
		Actioncode.selectByValue("A");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Select amendCode = new Select(Cm.amendCode);
		amendCode.selectByValue("35");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Cm.allSelectBox().click();

		Cm.SendH().click();

		Thread.sleep(200);

		driver.switchTo().alert().accept();

	}
	@AfterTest
	public void homepage() throws InterruptedException {
		back();

	}

}
