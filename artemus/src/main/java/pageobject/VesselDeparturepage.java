package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VesselDeparturepage {

	public VesselDeparturepage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "AMS")
	public WebElement AMS;

	@FindBy(xpath = "//a[contains(text(),'Vessel Departure')]")
	public WebElement VesselDeparture;

	@FindBy(css = "select[name='vesselId']")
	public WebElement vesselId;

	@FindBy(css = "select[name='voyageId']")
	public WebElement voyageId;

	@FindBy(css = "select[name='loadPort']")
	public WebElement loadPort;

	@FindBy(css = "img[alt='Find Criteria']")
	public WebElement Find;

	@FindBy(css = "input[name='newButton']")
	public WebElement newButton;

	@FindBy(css = "input[name='saveButton']")
	public WebElement saveButton;

	@FindBy(css = "input[id='departureDate0']")
	public WebElement departureDate;

	@FindBy(xpath = "//tr[@class='GridData']")
	public WebElement tableRow;

	@FindBy(xpath = "//td[contains(text(),'Vessel Departure')]")
	public WebElement pageTitle;

	@FindBy(css = "input[name='dataTableRowCount']")
	public WebElement dataTableRowCount;

	public WebElement VesselDeparture() {
		return VesselDeparture;
	}

	public WebElement vesselId() {
		return vesselId;
	}

	public WebElement voyageId() {
		return voyageId;
	}

	public WebElement loadPort() {
		return loadPort;
	}

	public WebElement Find() {
		return Find;
	}

	public WebElement newButton() {
		return newButton;
	}

	public WebElement saveButton() {
		return saveButton;
	}

	public WebElement departureDate() {
		return departureDate;
	}

	public WebElement tableRow() {
		return tableRow;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement AMS() {
		return AMS;
	}

	public WebElement dataTableRowCount() {
		return dataTableRowCount;
	}
}
