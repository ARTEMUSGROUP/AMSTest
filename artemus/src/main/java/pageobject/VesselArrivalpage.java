package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VesselArrivalpage {

	
	public VesselArrivalpage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="AMS")	public WebElement AMS;

	@FindBy(xpath ="//a[contains(text(),'Vessel Arrival')]")	public WebElement VesselArrival;
	
	@FindBy(css ="select[name='vesselId']")	public WebElement vesselId;

	@FindBy(css ="select[name='voyageId']")	public WebElement voyageId;

	@FindBy(css ="select[name='dischargePort']")	public WebElement dischargePort;

	@FindBy(css ="img[alt='Find Criteria']")	public WebElement Find;

	@FindBy(css ="input[name='newButton']")	public WebElement newButton;

	
	@FindBy(css ="input[name='saveButton']")	public WebElement saveButton;

	@FindBy(css ="input[id='arrivalDate0']")	public WebElement arrivalDate;
	
	@FindBy(xpath ="//tr[@class='GridData']")	public WebElement tableRow;

	@FindBy(xpath ="//*[@id='tr0']/td[4]")	public WebElement UpdatedUser	;

	@FindBy(css ="input[name='acknowledgement']")	public WebElement acknowledgement	;

	@FindBy(xpath ="//div[@id='acknowledgementDiv']//tr[@class='GridHeader']")	public WebElement acknowledgementRow	;

	@FindBy(xpath ="//td[contains(text(),'Vessel Arrival')]")	public WebElement pageTitle	;

	@FindBy(css ="input[name='dataTableRowCount']")	public WebElement dataTableRowCount	;

	
	
	
	public WebElement VesselArrival() {
		return VesselArrival;
	}
	

	public WebElement vesselId() {
		return vesselId;
	}
	
	public WebElement voyageId() {
		return voyageId;
	}
	
	public WebElement dischargePort() {
		return dischargePort;
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
	
	public WebElement arrivalDate() {
		return arrivalDate;
}
	
	public WebElement tableRow() {
		return tableRow;
}
	
	public WebElement UpdatedUser() {
		return UpdatedUser;
}
	
	public WebElement acknowledgement() {
		return acknowledgement;
}
	
	public WebElement acknowledgementRow() {
		return acknowledgementRow;
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
