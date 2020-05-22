package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ARTEMUSloginpage {

	WebDriver driver;

	public ARTEMUSloginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// By loginSCAC=By.name("loginScac");
	// By username =By.name("userName");
	// By password =By.name("password");
	// By submit =By.id("submitBtn");
	@FindBy(css = "tr[class='GridHeader']")
	public WebElement Landingpage;

	@FindBy(css = "div[id='dhtmlgoodies_menu']")
	public WebElement menubar;

	@FindBy(css = "td[id='userNameLoginScac']")
	public WebElement checkLoginScac;

	@FindBy(css = "input[name='loginScac']")
	public WebElement loginSCAC;

	@FindBy(css = "input[name='userName']")
	public WebElement userName;

	@FindBy(css = "input[name='password']")
	public WebElement password;

	@FindBy(css = "input[id ='submitBtn']")
	public WebElement submit;

	public WebElement loginSCAC() {
		return loginSCAC;
	}

	public WebElement UserName() {
		return userName;
	}

	public WebElement password() {
		return password;
	}

	public WebElement submit() {
		return submit;
	}

	public WebElement Landingpage() {
		return Landingpage;
	}

	public WebElement menubar() {
		return menubar;
	}

	public WebElement checkLoginScac() {
		return checkLoginScac;
	}

}
