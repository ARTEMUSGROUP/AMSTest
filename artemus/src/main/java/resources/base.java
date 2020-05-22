package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.reporters.Files;

import pageobject.ARTEMUSloginpage;

public class base {

	public static WebDriver driver;

	public void initialiseDriver() throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"/home/me/git/AMSTest/artemus/src/main/java/resources/data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/home/me/selenium/chromedriver");
			driver = new ChromeDriver();

		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// return driver;
	}

	public WebDriver pageLogin() throws IOException {
		if (driver == null) {
			initialiseDriver();
			driver.get("http://52.54.244.138:8080/AMS/");

			ARTEMUSloginpage lg = new ARTEMUSloginpage(driver);

			lg.loginSCAC().sendKeys("DEMO");

			lg.UserName().sendKeys("admin");

			lg.password().sendKeys("admin123");

			lg.submit().click();
		}
		return driver;

	}

	public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
		iTestContext.setAttribute("driver", driver);

		return iTestContext;
	}

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		System.out.println("Screenshot Taken!!!!");
		FileUtils.copyFile(src, new File("./screenshot/" + result + ".png"));
	}

	public void deleteScreenshot() throws IOException {
		File dir = new File("/home/me/git/AMSTest/artemus/screenshot");

		if (dir.isDirectory() == false) {
			System.out.println("Not a directory. Do nothing");
			return;
		}
		File[] listFiles = dir.listFiles();
		for (File file : listFiles) {
			System.out.println("Deleting " + file.getName());
			file.delete();
		}

	}

	public void back() {

		driver.navigate().to("http://52.54.244.138:8080/AMS/login.do?actionCode=login");

	}

}
