package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ISFpage;
import pageobject.SCACCodePage;
import resources.base;

public class SCACCodeTest extends base {

	SCACCodePage sc;

	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();
		//

		sc = new SCACCodePage(driver);
	}

	@Test(priority = 1)
	public void SCACCodescreen() throws InterruptedException {
		sc.Tables().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.SCACcodeTab().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(sc.PageTitle().isDisplayed());
	}

	@Test(priority = 2)
	public void CreateNewScac() throws InterruptedException {
		sc.New().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.SCACcode().sendKeys("AUTO");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.scacName().sendKeys("ITS AUTOMATION TESTING");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.carrierCode().sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.Save().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void UpdateScac() throws InterruptedException {
		sc.Find().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.sName().sendKeys("AUTO");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.SearchButton().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.GridRow().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.carrierCode().sendKeys("5678");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		sc.Save().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void DeleteScac() throws InterruptedException {
		sc.Delete().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		Thread.sleep(200);

	}

}
