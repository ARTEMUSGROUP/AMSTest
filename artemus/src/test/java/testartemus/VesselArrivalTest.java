package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.VesselArrivalpage;
import resources.base;
import resources.utilpage;

public class VesselArrivalTest extends base {
	utilpage objUtilPage = new utilpage();
	ArrayList<String> dates = objUtilPage.dates();

	VesselArrivalpage va;

	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		va = new VesselArrivalpage(driver);
	}

	@Test(priority = 1)
	public void vesselarrivaltab() throws InterruptedException {
		va.AMS().click();
		va.VesselArrival().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(va.pageTitle().isDisplayed());
	}

	@Test(priority = 2)
	public void vesseldetails() throws InterruptedException {
		Select vessel = new Select(va.vesselId);
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
		Select Voyage = new Select(va.voyageId);
		Voyage.selectByValue("76864");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "0712");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void DischargePortdetails() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select discharge = new Select(va.dischargePort);
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

		va.Find().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		try {
			System.out.println(va.tableRow().getText());

		} catch (Exception e) {
			va.newButton().click();
			va.arrivalDate().sendKeys(dates.get(0));
			va.saveButton().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.switchTo().alert().accept();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
		}
	}

	@Test(priority = 6)
	public void acknowledgement() throws InterruptedException {
		va.tableRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		va.acknowledgement().click();

		AssertJUnit.assertTrue(va.acknowledgementRow().isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);
	}

}