package testartemus;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.SCACCodePage;
import pageobject.SubOrdinateScacPage;
import resources.base;

public class SubOrdinateScacTest extends base {

	SubOrdinateScacPage soc;

	@BeforeTest
	public void login() throws IOException {
		driver = pageLogin();
		//

		soc = new SubOrdinateScacPage(driver);
	}

	@Test(priority = 1)
	public void SubOrdinateScac() throws InterruptedException {
		soc.Tables().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.SubOrdinateSCACTab().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		AssertJUnit.assertTrue(soc.PageTitle().isDisplayed());
	}

	@Test(priority = 2)
	public void CreateNewSubScac() throws InterruptedException {
		soc.scacCode().sendKeys("TEST");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.bondHolder().sendKeys("99-9999999oo");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select bond = new Select(soc.bondActivityCode);
		bond.selectByValue("02");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Select bondtype = new Select(soc.bondType);
		bondtype.selectByValue("8");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.vnumber().sendKeys("1234");
		soc.name().sendKeys("Automation Time");

		soc.Save().click();

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void updateSubScac() throws InterruptedException {

		soc.Find().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.sCode().sendKeys("TEST");
		soc.SearchButton().click();

		soc.GridTable().click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.bondHolder().clear();
		soc.bondHolder().sendKeys("99-999999911");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		soc.Save().click();

		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void deleteSubScac() throws InterruptedException {

		soc.Delete().click();
		driver.switchTo().alert().accept();
	}

	@AfterTest
	public void homepage() throws InterruptedException {
		back();

		Thread.sleep(200);

	}

}
