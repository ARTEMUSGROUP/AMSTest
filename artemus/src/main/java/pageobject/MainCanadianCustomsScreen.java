package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainCanadianCustomsScreen {

	// WebDriver driver;

	public MainCanadianCustomsScreen(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Canda Main Screen

	@FindBy(xpath = "//a[contains(text(),'Canada Customs')]")
	public WebElement CanadaCustoms;
	
	@FindBy(xpath = " //a[contains(text(),'Main Canadian Customs Screen')]")
	public WebElement MainCanadianCustoms;

	@FindBy(xpath = "//td[contains(text(),'Main Canadian Customs Screen')]")
	public WebElement pageTitle;

	@FindBy(css = "select[name='vesselId']")
	public WebElement vesselIdmain;

	@FindBy(css = "select[name='voyageId']")
	public WebElement voyageIdmain;

	@FindBy(css = "select[name='loadPort']")
	public WebElement loadPort;

	@FindBy(css = "select[name='dischargePort']")
	public WebElement dischargePort;

	@FindBy(css = "img[alt='Find Criteria']")
	public WebElement findinmain;

	@FindBy(xpath = " //tr[@class='GridData']")
	public WebElement GridData;

	@FindBy(xpath = "//tr[@class='GridData']//td[1]")
	public WebElement loadportgriddata;

	@FindBy(xpath = "//tr[@class='GridData']//td[2]")
	public WebElement dischargportgriddata;

	@FindBy(xpath = "//tr[@class='GridData']//td[4]")
	public WebElement billcount;

	
	@FindBy(css = "div[id='buttonDiv']")
	public WebElement buttonDiv;
	
	@FindBy(css = "input[name='CanCustBLDetailImportedCargoScreen']")
	public WebElement CanCustBLDetailImportedCargoScreen;
	
	
	@FindBy(xpath = "//table[@id='canadianbillDetailInformationTable']//tr[@class='GridData']")
	public WebElement canadianbillDetailInformationTable;
	
	@FindBy(xpath = "//div[@id='modal1']//div[2]")
	public WebElement canadianbillDetailInformationTableDiv;
	
	
	@FindBy(css = "input[name='showAcknowledgement']")
	public WebElement showAcknowledgement;
	
	@FindBy(css = "input[name='customsCanadianAmendmentforBL']")
	public WebElement customsCanadianAmendmentforBL;
	
	@FindBy(css = "select[name='actionCode']")
	public WebElement actionCode;
	
	@FindBy(css = "select[name='amendmentCode']")
	public WebElement amendmentCode;
	
	@FindBy(css = "input[value='Submit']")
	public WebElement Submit;
	
	@FindBy(xpath = "//div[@id='modal3']//div//img")
	public WebElement close;
	
	@FindBy(css = "input[value='Message']")
	public WebElement Message;
	
	
	@FindBy(xpath = "//div[@id='modal5']//div//img")
	public WebElement Messageclose;
	
	@FindBy(xpath = "//body//div[@id='portDetail']//tbody//tbody//tr[1]")
	public WebElement selectacknowledgementRow;
	
	@FindBy(xpath = "//div[@id='modal1']//img")
	public WebElement close1stTab;
	
	
	@FindBy(css = "input[name='CanCustBLDetailFROBECargo']")
	public WebElement CanCustBLDetailFROBECargo;
	
	@FindBy(css = "tr[title='Double click to view bill details']")
	public WebElement CanCustBLDetailFROBECargoRow;
	
	@FindBy(xpath = "//div[@id='modal1']//div[2]")
	public WebElement CanCustBLDetailFROBECargoDiv;
	
	
	@FindBy(css = "input[name='CustomsErrorScreen']")
	public WebElement CustomsErrorScreen;
	

	@FindBy(css = "input[name='AmendTrackingScreen']")
	public WebElement AmendTrackingScreen;
	
	
	@FindBy(xpath="//*[@id='DataTable']/tbody/tr/td[7]")
	public List<WebElement> CreatedDate;
	
	
	
	@FindBy(css = "input[name='VoyageConveyance(A6)']")
	public WebElement VoyageConveyance;
	
	
	
	






	public WebElement pageTitle() {
		return pageTitle;
	}
	
	public WebElement MainCanadianCustoms() {
		return MainCanadianCustoms;
	}

	public WebElement CanadaCustoms() {
		return CanadaCustoms;
	}

	public WebElement vesselIdmain() {
		return vesselIdmain;
	}

	public WebElement voyageIdmain() {
		return voyageIdmain;
	}

	public WebElement loadPort() {
		return loadPort;
	}

	public WebElement dischargePort() {
		return dischargePort;
	}

	public WebElement findinmain() {
		return findinmain;
	}

	public WebElement GridData() {
		return GridData;
	}

	public WebElement buttonDiv() {
		return buttonDiv;
	}
	
	
	public WebElement CanCustBLDetailImportedCargoScreen() {
		return CanCustBLDetailImportedCargoScreen;
	}
	
	
	public WebElement canadianbillDetailInformationTable() {
		return canadianbillDetailInformationTable;
	}
	
	public WebElement canadianbillDetailInformationTableDiv() {
		return canadianbillDetailInformationTableDiv;
	}
	
	public WebElement showAcknowledgement() {
		return showAcknowledgement;
	}
	
	
	public WebElement customsCanadianAmendmentforBL() {
		return customsCanadianAmendmentforBL;
	}
	
	
	public WebElement actionCode() {
		return actionCode;
	}
	
	
	public WebElement amendmentCode() {
		return amendmentCode;
	}
	
	
	public WebElement Submit() {
		return Submit;
	}
	
	public WebElement close() {
		return close;
	}
	
	
	public WebElement Message() {
		return Message;
	}
	
	public WebElement Messageclose() {
		return Messageclose;
	}
	
	public WebElement selectacknowledgementRow() {
		return selectacknowledgementRow;
	}
	
	
	public WebElement close1stTab() {
		return close1stTab;
	}
	
	
	public WebElement CanCustBLDetailFROBECargo() {
		return CanCustBLDetailFROBECargo;
	}
	
	public WebElement CanCustBLDetailFROBECargoRow() {
		return CanCustBLDetailFROBECargoRow;
	}
	
	public WebElement CanCustBLDetailFROBECargoDiv() {
		return CanCustBLDetailFROBECargoDiv;
	}
	
	
	public WebElement CustomsErrorScreen() {
		return CustomsErrorScreen;
	}
	
	
	public WebElement AmendTrackingScreen() {
		return AmendTrackingScreen;
	}

	
	
	public List<WebElement> CreatedDate() {
		return CreatedDate;
	}
	
	
	public WebElement VoyageConveyance() {
		return VoyageConveyance;
	}

}
