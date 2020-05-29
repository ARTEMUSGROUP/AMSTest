package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Candsaddoriginalmanifest {

	// WebDriver driver;

	public Candsaddoriginalmanifest(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// addoriginalmanifest

	@FindBy(xpath = "//a[contains(text(),'Canada Customs')]")
	public WebElement CanadaCustoms;

	@FindBy(xpath = "//a[contains(text(),'Add Canadian Customs Manifest')]")
	public WebElement addorignalmanifest;


	@FindBy(xpath = "//td[contains(text(),'ACI Orignal Manifest')]")
	public WebElement pageTitle;

	@FindBy(css = "select[name='vesselId']")
	public WebElement vesselId;

	@FindBy(css = "select[name='voyageId']")
	public WebElement voyageId;

	@FindBy(css = "select[name='loadPort']")
	public WebElement loadPortCode;

	@FindBy(css = "select[name='dischargePort']")
	public WebElement dischargePortCode;

	@FindBy(css = "img[alt='Find Criteria']")
	public WebElement findclick;

	@FindBy(xpath = " //table[@id='DataTable']//tbody//tr")
	public WebElement DataTableRow;

	

	@FindBy(css = "input[name='sendManifest']")
	public WebElement sendManifestCheckBox;

	@FindBy(css = "input[name='Save']")
	public WebElement Save;

	@FindBy(css = "select[name='actionCode']")
	public WebElement actionCode;



	


	public WebElement CanadaCustoms() {
		return CanadaCustoms;
	}

	public WebElement addorignalmanifest() {
		return addorignalmanifest;
	}

	

	public WebElement vesselId() {
		return vesselId;
	}

	public WebElement voyageId() {
		return voyageId;
	}

	public WebElement loadPortCode() {
		return loadPortCode;
	}

	public WebElement dischargePortCode() {
		return dischargePortCode;
	}

	public WebElement findclick() {
		return findclick;
	}

	public WebElement DataTableRow() {
		return DataTableRow;
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
	
	public WebElement actionCode() {
		return actionCode;
	}
	
}
