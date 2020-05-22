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
import pageobject.VesselDeparturepage;
import resources.base;
import resources.utilpage;

public class VesselDepartureTest extends base {

	utilpage objUtilPage = new utilpage();
	ArrayList<String> dates = objUtilPage.dates();

	VesselDeparturepage vd;

	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		vd = new VesselDeparturepage(driver);
	}

	@Test(priority = 1)
	public void vesselarrivaltab() throws InterruptedException {
		vd.AMS().click();
		vd.VesselDeparture().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(vd.pageTitle().isDisplayed());
	}

	@Test(priority = 2)
	public void vesseldetails() throws InterruptedException {
		Select vessel = new Select(vd.vesselId);
		vessel.selectByValue("287825");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "ARTEMUS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void Voyagedetails() throws InterruptedException {
		Select Voyage = new Select(vd.voyageId);
		Voyage.selectByValue("174915");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "1234");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void loadPortdetails() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select load = new Select(vd.loadPort);
				load.selectByValue("4110");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebElement option = load.getFirstSelectedOption();
				String defaultItem = option.getText();
				System.out.println(defaultItem);

				AssertJUnit.assertEquals(defaultItem, "INDIANAPOLIS, IN");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test(priority = 5)
	public void findbills() throws InterruptedException {

		vd.Find().click();
		Thread.sleep(2000);

		try {
			System.out.println(vd.tableRow().getText());

		} catch (Exception e) {
			vd.newButton().click();
			vd.departureDate().sendKeys(dates.get(0));
			vd.saveButton().click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// driver.switchTo().alert().accept();

		}
	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);
	}

}
