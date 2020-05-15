package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PermitToTransferPage {

	public PermitToTransferPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText ="AMS")	public WebElement AMS;

	@FindBy(xpath ="//a[contains(text(),'Permit To Transfer')]")	public WebElement PermitToTransfer;
	
	@FindBy(xpath ="//td[contains(text(),'Permit To Transfer')]")	public WebElement PageTitle;

	
	@FindBy(css ="select[name='vesselId']")	public WebElement vesselId;

	@FindBy(css ="select[name='voyageId']")	public WebElement voyageId;

	@FindBy(css ="select[name='dischargePort']")	public WebElement dischargePort;

	@FindBy(xpath ="//form[@name='permitToTransfer']//img[@id='img_find']")	public WebElement Find;

	@FindBy(css ="input[name='New']")	public WebElement New;

	@FindBy(css ="select[name='bill_lading_id']")	public WebElement billladingid;

	@FindBy(css ="input[name='container']")	public WebElement container;
	
	@FindBy(css ="input[name='cFirms']")	public WebElement cFirms;

	@FindBy(css ="input[name='cIRSNumber']")	public WebElement cIRSNumber;

	@FindBy(xpath ="//table[@id='dataTable']//tbody//tr")	public WebElement TableRow;

	@FindBy(xpath ="//div[@id='CreateDataDiv']//img[@id='img_find']")	public WebElement billFind;

	@FindBy(xpath ="//input[@name='objCheckBox']")	public WebElement objCheckBox;

	@FindBy(css ="input[name='Save']")	public WebElement objChecksave;

	@FindBy(xpath ="//*[@id='MainDataDiv']/input")	public WebElement changeAckName;

	
	
	
	public WebElement AMS() {
		return AMS;
	}
	
	public WebElement PermitToTransfer() {
		return PermitToTransfer;
	}
	
	public WebElement PageTitle() {
		return PageTitle;
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
	public WebElement New() {
		return New;
}
	
	public WebElement billladingid() {
		return billladingid;
}
	
	public WebElement container() {
		return container;
}
	
	public WebElement cFirms() {
		return cFirms;
}
	
	public WebElement cIRSNumber() {
		return cIRSNumber;
}
	
	public WebElement TableRow() {
		return TableRow;
}
	
	public WebElement billFind() {
		return billFind;
}
	

	public WebElement objCheckBox() {
		return objCheckBox;
}
	
	public WebElement objChecksave() {
		return objChecksave;
}
	
	public WebElement changeAckName() {
		return changeAckName;
}
	
}
