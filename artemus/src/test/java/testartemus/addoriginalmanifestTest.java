package testartemus;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ARTEMUSloginpage;
import pageobject.CustomerProfilepage;
import pageobject.addoriginalmanifest;
import resources.base;

public class addoriginalmanifestTest extends base {

	addoriginalmanifest am;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		am = new addoriginalmanifest(driver);
	}

	@Test(priority = 1)
	public void OriginalManifes() throws InterruptedException {

		am.AMS().click();
		am.addorignalmanifest().click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(am.pageTitle().isDisplayed());

	}

	@Test(priority = 2)
	public void vesseldetails() throws InterruptedException {
		Select vessel = new Select(am.vesselListId);
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
		Select Voyage = new Select(am.voyageListId);
		Voyage.selectByValue("174915");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "1234");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void LoadPortdetails() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select LoadPort = new Select(am.loadPortListId);
				LoadPort.selectByValue("4110");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				WebElement option = LoadPort.getFirstSelectedOption();
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
	public void DischargePortdetails() throws InterruptedException {
		String dischargePort = "1001";
		Select DischargePort = new Select(am.dischargePortListId);
		DischargePort.selectByValue(dischargePort);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = DischargePort.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "NEW YORK");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/*
		 * System.out.println(am.dischargePortCode().getText());
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 */

		// Assert.assertEquals(dischargePort, am.dischargePortCode().getText());

	}

	@Test(priority = 6)
	public void findbills() throws InterruptedException {

		am.findclick().click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(am.DataTableRow().isDisplayed());

	}

	@Test(priority = 7)
	public void assertRow() throws InterruptedException {
		AssertJUnit.assertTrue("INDIANAPOLIS, IN", am.loadPort().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue("NEW YORK", am.dischargePort().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue("4110", am.loadPortCode().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue("1001", am.dischargePortCode().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 8)
	public void sendManifestCheckBox() throws InterruptedException {
		am.sendManifestCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(am.sendManifestCheckBox().isSelected());
		am.Save().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();

	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		// driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");
		Thread.sleep(200);
	}

}
