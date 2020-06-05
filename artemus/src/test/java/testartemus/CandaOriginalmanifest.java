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
import pageobject.Candsaddoriginalmanifest;
import pageobject.CustomerProfilepage;
import pageobject.addoriginalmanifest;
import resources.base;

public class CandaOriginalmanifest extends base {

	Candsaddoriginalmanifest co;

	// public WebDriver driver;
	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();

		co = new Candsaddoriginalmanifest(driver);
	}

	@Test(priority = 1)
	public void OriginalManifes() throws InterruptedException {

		co.CanadaCustoms().click();
		co.addorignalmanifest().click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(co.pageTitle().isDisplayed());

	}

	@Test(priority = 2)
	public void vesseldetails() throws InterruptedException {
		Select vessel = new Select(co.vesselId);
		vessel.selectByValue("222445");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = vessel.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "H LEE WHITE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void Voyagedetails() throws InterruptedException {
		Select Voyage = new Select(co.voyageId);
		Voyage.selectByValue("128173");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = Voyage.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "15068");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 4)
	public void LoadPortdetails() throws InterruptedException {
		for (int i = 0; i <= 2; i++) {
			try {

				Select LoadPort = new Select(co.loadPortCode);
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
	public void DischargePortdetails() throws InterruptedException {
		String dischargePort = "09000";
		Select DischargePort = new Select(co.dischargePortCode);
		DischargePort.selectByValue(dischargePort);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement option = DischargePort.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);

		AssertJUnit.assertEquals(defaultItem, "SAULT ST MARIE");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void findbills() throws InterruptedException {

		co.findclick().click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(co.DataTableRow().isDisplayed());

	}

	@Test(priority = 7)
	public void assertRow() throws InterruptedException {

		System.out.println(co.DataTableRow().getText());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		AssertJUnit.assertTrue("Add", co.actionCode().isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 8)
	public void sendManifestCheckBox() throws InterruptedException {
		co.sendManifestCheckBox().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(co.sendManifestCheckBox().isSelected());
		co.Save().click();
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
