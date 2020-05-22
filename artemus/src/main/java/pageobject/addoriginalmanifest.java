package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addoriginalmanifest {

	// WebDriver driver;

	public addoriginalmanifest(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// addoriginalmanifest

	@FindBy(linkText = "AMS")
	public WebElement AMS;

	@FindBy(xpath = "//a[contains(text(),'Add Orignal Manifest')]")
	public WebElement addorignalmanifest;

	@FindBy(xpath = " //a[contains(text(),'AMS Main Screen')]")
	public WebElement AMSmainscreen;

	@FindBy(xpath = "//td[contains(text(),'Original Manifest')]")
	public WebElement pageTitle;

	@FindBy(css = "select[name='vesselListId']")
	public WebElement vesselListId;

	@FindBy(css = "select[name='voyageListId']")
	public WebElement voyageListId;

	@FindBy(css = "select[name='loadPortListId']")
	public WebElement loadPortListId;

	@FindBy(css = "select[name='dischargePortListId']")
	public WebElement dischargePortListId;

	@FindBy(css = "img[alt='Find Criteria']")
	public WebElement findclick;

	@FindBy(xpath = " //table[@id='DataTable']//tbody//tr")
	public WebElement DataTableRow;

	@FindBy(css = "input[name='loadPort']")
	public WebElement loadPort;

	@FindBy(css = "input[name='sendManifestCheckBox']")
	public WebElement sendManifestCheckBox;

	@FindBy(css = "input[name='Save']")
	public WebElement Save;

	@FindBy(xpath = "//input[@name='dischargePortCode']")
	public WebElement dischargePortCode;

	@FindBy(xpath = " //table[@id='DataTable']//tbody//tr//td[2]//input[@name='loadPortCode']")
	public WebElement loadPortCode;

	@FindBy(css = "input[name='dischargePort']")
	public WebElement dischargePort;

	public WebElement AMS() {
		return AMS;
	}

	public WebElement addorignalmanifest() {
		return addorignalmanifest;
	}

	public WebElement AMSmainscreen() {
		return AMSmainscreen;
	}

	public WebElement vesselListId() {
		return vesselListId;
	}

	public WebElement voyageListId() {
		return voyageListId;
	}

	public WebElement loadPortListId() {
		return loadPortListId;
	}

	public WebElement dischargePortListId() {
		return dischargePortListId;
	}

	public WebElement findclick() {
		return findclick;
	}

	public WebElement DataTableRow() {
		return DataTableRow;
	}

	public WebElement loadPort() {
		return loadPort;
	}

	public WebElement sendManifestCheckBox() {
		return sendManifestCheckBox;
	}

	public WebElement Save() {
		return Save;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement dischargePortCode() {
		return dischargePortCode;
	}

	public WebElement loadPortCode() {
		return loadPortCode;
	}

	public WebElement dischargePort() {
		return dischargePort;
	}
}
