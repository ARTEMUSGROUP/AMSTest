package testartemus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobject.ItSelectionScreenPage;
import pageobject.VesselArrivalpage;
import resources.base;
import resources.utilpage;

public class ItSelectionScreenTest extends base {

	utilpage objUtilPage = new utilpage();
	ArrayList<String> dates = objUtilPage.dates();
	String itNumber;
	ItSelectionScreenPage Iss;

	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		Iss = new ItSelectionScreenPage(driver);
	}

	@Test(priority = 1)
	public void ItSelectionTab() throws InterruptedException {
		Iss.AMS().click();
		Iss.ItSelectionScreen().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.PageTitle().isDisplayed());
	}

	@Test(priority = 2)
	public void vesseldetails() throws InterruptedException {
		Select vessel = new Select(Iss.vesselId);
		vessel.selectByValue("53");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "TEST VESSEL");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void Voyagedetails() throws InterruptedException {
		Select Voyage = new Select(Iss.voyageId);
		Voyage.selectByValue("186809");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		//AssertJUnit.assertEquals(defaultItem, "0712");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void DischargePortdetails() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select discharge = new Select(Iss.dischargePort);
				discharge.selectByValue("2704");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebElement option = discharge.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println(defaultItem);

				AssertJUnit.assertEquals(defaultItem, "LOS ANGELES");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test(priority = 5)
	public void findbills() throws InterruptedException {

		Iss.Find().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
			System.out.println(Iss.TableRow().getText());

		} catch (Exception e) {
			Iss.New().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.shipmentValue().sendKeys("12");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Select inlandDestination = new Select(Iss.inlandDestination());
			inlandDestination.selectByValue("3003");
			Thread.sleep(200);

			WebElement option = inlandDestination.getFirstSelectedOption();
			String defaultItem = option.getText();
			System.out.println(defaultItem);

			AssertJUnit.assertEquals(defaultItem, "ABERDEEN-HOQUIAM, WASHINGTON");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Select foreignDestination = new Select(Iss.foreignDestination());
			foreignDestination.selectByValue("40901");
			Thread.sleep(200);

			WebElement option1 = foreignDestination.getFirstSelectedOption();
			String defaultItem1 = option1.getText();
			System.out.println(defaultItem1);

			AssertJUnit.assertEquals(defaultItem1, "AABENRAA - DENMARK");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.BLCrossReference().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.checkbox().click();
			Iss.SaveButtonDiv().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.Find().click();

			//driver.switchTo().alert().accept();
			//Thread.sleep(2000);
		}
	}

	@Test(priority = 6)
	public void TableRowDetails() throws InterruptedException {
		
		//Iss.Find().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Iss.TableRow().click();
		itNumber = Iss.ITNumber().getText();
		System.out.println(itNumber);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.TableRowDetails().isDisplayed());

	}

	@Test(priority = 7)
	public void ItArrival() throws InterruptedException {

		Iss.ItArrival().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Iss.ItArrivalTableRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.buttonDivItArrival().isDisplayed());

		String Arrival = Iss.ArrivaldateinArrivalTable().getAttribute("value");
		System.out.println(Arrival);

		if (Arrival.equals("")) {
			Iss.InputItArrival().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.ItArrivalDate().sendKeys(dates.get(0));
			Iss.ItArrivalDatesave().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			System.out.println(Iss.ArrivaldateinArrivalTable().getText());

		} else {
			Iss.ShowItArrivalHistory().click();

			Assert.assertTrue(Iss.historyDiv().isDisplayed());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			System.out.println(Iss.historyDiv().getText());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// System.out.println(Iss.historyDivITnumber().getText());
			AssertJUnit.assertEquals(itNumber, Iss.historyDivITnumber().getText());

		}

		Iss.closetab().click();

	}

	@Test(priority = 8)
	public void ItContainerArrival() throws InterruptedException {

		Iss.ItContainerArrival().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Iss.ItContainerArrivalTableRow().click();
		Thread.sleep(2000);

		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.buttonDivItArrival().isDisplayed());

		String result1 = Iss.ArrivalDateinContenerArrival().getAttribute("value");
		System.out.println("Iss arrival date ::" + result1);

		if (result1.equals("")) {
			Iss.InputItContainerArrival().click();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.ItArrivalDate().sendKeys(dates.get(0));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.ItArrivalDatesave().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			// driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(Iss.ArrivalDateinContenerArrival().getText());

		} else {
			String resultafter = Iss.ArrivalDateinContenerArrival().getAttribute("value");
			System.out.println("Iss arrival date present ::" + resultafter);

			String Itcheck = Iss.ItContainerITnumber().getAttribute("value");
			AssertJUnit.assertEquals(itNumber, Itcheck);

		}

		Iss.closetab().click();

	}

	@Test(priority = 9)
	public void ItBillArrival() throws InterruptedException {

		Iss.ItBillArrival().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Iss.ItBillArrivalTableRow().click();
		Thread.sleep(2000);

		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.buttonDivItArrival().isDisplayed());

		Iss.ArrivaldateinBillarrival().click();
		String result2 = Iss.ArrivaldateinBillarrival().getAttribute("value");
		System.out.println("BL arrival date ::" + result2);

		if (result2.equals("")) {
			Iss.InputItBillArrival().click();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.ItArrivalDate().sendKeys(dates.get(0));
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			Iss.ItArrivalDatesave().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(Iss.ArrivaldateinBillarrival().getText());

		} else {
			String resultafteradd = Iss.ArrivaldateinBillarrival().getAttribute("value");
			System.out.println("Iss arrival date present ::" + resultafteradd);

			String ItcheckBL = Iss.ItNumberinBillarrival().getAttribute("value");
			AssertJUnit.assertEquals(itNumber, ItcheckBL);

		}

		Iss.closetab().click();

	}

	@Test(priority = 10)
	public void ShowArrivalAcknowledgement() throws InterruptedException {
		Iss.ArrivalAcknowledgement().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(Iss.ArrivalAcknowledgementdataTable().isDisplayed());
		System.out.println(Iss.ArrivalAcknowledgementdataTable().getText());
	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();
		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);

	}

}
