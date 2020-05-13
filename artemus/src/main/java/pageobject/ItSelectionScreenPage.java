package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItSelectionScreenPage {

	public ItSelectionScreenPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="AMS")	public WebElement AMS;

	@FindBy(xpath ="//a[contains(text(),'IT Selection Screen')]")	public WebElement ItSelectionScreen;
	
	@FindBy(xpath ="//td[contains(text(),'It Selection Screen')]")	public WebElement PageTitle;
	
	@FindBy(css ="select[name='vesselId']")	public WebElement vesselId;

	@FindBy(css ="select[name='voyageId']")	public WebElement voyageId;

	@FindBy(css ="select[name='dischargePort']")	public WebElement dischargePort;

	@FindBy(css ="img[alt='Find Criteria']")	public WebElement Find;

	@FindBy(css ="input[id='New']")	public WebElement New;

	@FindBy(css ="input[name='Delete']")	public WebElement Delete;

	@FindBy(css ="input[name='Edit']")	public WebElement Edit;

	@FindBy(xpath ="//body//div[@id='MainDataDiv']//tbody//tbody//tr[1]")	public WebElement TableRow;

	@FindBy(css ="input[name='shipmentValue']")	public WebElement shipmentValue;

	@FindBy(css ="select[name='inlandDestination']")	public WebElement inlandDestination;

	@FindBy(xpath ="//b[contains(text(),'The following fields are required for')]")	public WebElement Requiredfeilds;

	@FindBy(css ="select[name='foreignDestination']")	public WebElement foreignDestination;

	@FindBy(css ="input[name='BLCrossReference']")	public WebElement BLCrossReference;

	@FindBy(xpath ="//*[@id='getBillListTable']/tbody/tr[1]/td[1]/input")	public WebElement checkbox;

	@FindBy(css ="img[onclick='funSaveNewIt();return false;']")	public WebElement SaveButtonDiv;

	@FindBy(css ="input[name='ItArrival']")	public WebElement ItArrival;

	@FindBy(css ="input[name='ItContainerArrival']")	public WebElement ItContainerArrival;

	@FindBy(css ="input[name='ItBillArrival']")	public WebElement ItBillArrival;

	@FindBy(css ="input[name='ArrivalAcknowledgement']")	public WebElement ArrivalAcknowledgement;

	@FindBy(xpath ="//div[@id='ItListDiv']//tbody//tr[1]")	public WebElement ItBillArrivalTableRow;

	@FindBy(css ="input[name='InputItArrival']")	public WebElement InputItArrival;

	@FindBy(css ="input[name='InputItExportation']")	public WebElement InputItExportation;

	@FindBy(css ="input[name='ItArrivalDate']")	public WebElement ItArrivalDate;

	@FindBy(xpath ="//div[@id='InputItArrivalPopup']//img[@id='img_save']")	public WebElement ItArrivalDatesave;

	@FindBy(xpath ="//input[@name='CancelItArrival']")	public WebElement CancelItArrival;

	@FindBy(xpath ="//input[@name='CancelItExportation']")	public WebElement CancelItExportation;

	@FindBy(xpath ="//input[@name='ShowItArrivalHistory']")	public WebElement ShowItArrivalHistory;

	@FindBy(xpath ="//div[@id='DisplayDiv']//table//tbody//tr//td//img")	public WebElement closetab;

	@FindBy(xpath ="//div[@id='ItListDiv']//tbody//tr[1]")	public WebElement ItContainerArrivalTableRow;
	
	@FindBy(xpath ="//*[@id='buttonDivItArrival']/table/tbody/tr/td[1]/input")	public WebElement InputItContainerArrival;

	@FindBy(xpath ="//div[@id='DisplayDiv']//tr[1]//td[6]//input[1]")	public WebElement Arrivaldatecheck;

	@FindBy(xpath =" //input[@name='InputItContainerExportation']")	public WebElement InputItContainerExportation;

	@FindBy(xpath ="//input[@name='CancelItContainerArrival']")	public WebElement CancelItContainerArrival;

	@FindBy(xpath ="//input[@name='CancelItContainerExportation']")	public WebElement CancelItContainerExportation;

	@FindBy(xpath ="//input[@name='ShowItContainerArrivalHistory']")	public WebElement ShowItContainerArrivalHistory;

	@FindBy(xpath ="//input[@name='InputItBillArrival']")	public WebElement InputItBillArrival;

	@FindBy(xpath ="//input[@name='InputItBillExportation']")	public WebElement InputItBillExportation;

	@FindBy(xpath ="//input[@name='CancelItBillArrival']")	public WebElement CancelItBillArrival;

	@FindBy(xpath ="//input[@name='CancelItBillExportation']")	public WebElement CancelItBillExportation;

	@FindBy(xpath ="//input[@name='ShowItBillArrivalHistory']")	public WebElement ShowItBillArrivalHistory;

	@FindBy(xpath ="//table[@id='dataTable']")	public WebElement ArrivalAcknowledgementdataTable;

	@FindBy(xpath ="//div[@id='buttonDiv']//table//tbody")	public WebElement TableRowDetails;

	@FindBy(xpath ="//body//div[@id='MainDataDiv']//tbody//tbody//tr[1]//td[1]")	public WebElement ITNumber	;

	@FindBy(css ="div#DisplayDiv table.GridTable")	public WebElement ITNumberTableRow	;

	@FindBy(css ="div#DisplayDiv table.GridTable td:nth-of-type(2)")	public WebElement ITNumberinItArrival	;

	@FindBy(xpath ="//div[@id='buttonDivItArrival']//table//tbody")	public WebElement buttonDivItArrival	;

	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr[1]//td[4]//input")	public WebElement ArrivaldateinArrivalTable	;

	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr")	public WebElement ItArrivalTableRow	;

	@FindBy(xpath ="//div[@id='historyDiv']//tbody")	public WebElement historyDiv;

	@FindBy(xpath ="//div[@id='historyDiv']//tbody//tr[1]//td[2]")	public WebElement historyDivITnumber	;

	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr[1]//td[6]//input")	public WebElement ArrivalDateinContenerArrival	;
	
	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr[1]//td[4]//input")	public WebElement ItContainerITnumber	;

	
	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr[1]//td[5]//input")	public WebElement ArrivaldateinBillarrival	;

	@FindBy(xpath ="//table[@id='ItListTable']//tbody//tr[1]//td[3]//input")	public WebElement ItNumberinBillarrival	;

	
	public WebElement AMS() {
		return AMS;
	}
	
	public WebElement ItSelectionScreen() {
		return ItSelectionScreen;
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
	
	public WebElement Delete() {
		return Delete;
}
	
	public WebElement Edit() {
		return Edit;
}
	
	public WebElement TableRow() {
		return TableRow;
}
	

	public WebElement shipmentValue() {
		return shipmentValue;
}
	
	public WebElement inlandDestination() {
		return inlandDestination;
}
	
	public WebElement Requiredfeilds() {
		return Requiredfeilds;
}
	
	public WebElement foreignDestination() {
		return foreignDestination;
}
	
	public WebElement BLCrossReference() {
		return BLCrossReference;
}
	
	public WebElement checkbox() {
		return checkbox;
}
	
	public WebElement SaveButtonDiv() {
		return SaveButtonDiv;
}
	
	public WebElement ItArrival() {
		return ItArrival;
}
	
	public WebElement ItContainerArrival() {
		return ItContainerArrival;
}
	
	public WebElement ItBillArrival() {
		return ItBillArrival;
}
	
	public WebElement ArrivalAcknowledgement() {
		return ArrivalAcknowledgement;
}
	
	public WebElement ItBillArrivalTableRow() {
		return ItBillArrivalTableRow;
}
	
	public WebElement InputItArrival() {
		return InputItArrival;
}
	
	public WebElement InputItExportation() {
		return InputItExportation;
}
	
	public WebElement ItArrivalDate() {
		return ItArrivalDate;
}
	
	public WebElement ItArrivalDatesave() {
		return ItArrivalDatesave;
}
	
	public WebElement CancelItArrival() {
		return CancelItArrival;
}
	
	public WebElement CancelItExportation() {
		return CancelItExportation;
}
	
	public WebElement ShowItArrivalHistory() {
		return ShowItArrivalHistory;
}
	
	public WebElement closetab() {
		return closetab;
}
	
	public WebElement ItContainerArrivalTableRow() {
		return ItContainerArrivalTableRow;
}
	
	public WebElement InputItContainerArrival() {
		return InputItContainerArrival;
}
	
	public WebElement Arrivaldatecheck() {
		return Arrivaldatecheck;
}
	
	public WebElement InputItContainerExportation() {
		return InputItContainerExportation;
}
	
	public WebElement CancelItContainerArrival() {
		return CancelItContainerArrival;
}
	
	public WebElement CancelItContainerExportation() {
		return CancelItContainerExportation;
}
	
	public WebElement ShowItContainerArrivalHistory() {
		return ShowItContainerArrivalHistory;
}
	
	public WebElement InputItBillArrival() {
		return InputItBillArrival;
}
	
	public WebElement InputItBillExportation() {
		return InputItBillExportation;
}
	
	public WebElement CancelItBillArrival() {
		return CancelItBillArrival;
}
	
	public WebElement CancelItBillExportation() {
		return CancelItBillExportation;
}
	
	public WebElement ShowItBillArrivalHistory() {
		return ShowItBillArrivalHistory;
}
	
	public WebElement ArrivalAcknowledgementdataTable() {
		return ArrivalAcknowledgementdataTable;
}
	
	
	public WebElement TableRowDetails() {
		return TableRowDetails;
}
	
	public WebElement ITNumber() {
		return ITNumber;
}
	
	public WebElement ITNumberTableRow() {
		return ITNumberTableRow;
}
		
	public WebElement ITNumberinItArrival() {
		return ITNumberinItArrival;
}
	
	public WebElement buttonDivItArrival() {
		return buttonDivItArrival;
}
	
	public WebElement ArrivaldateinArrivalTable() {
		return ArrivaldateinArrivalTable;
}
	
	public WebElement ItArrivalTableRow() {
		return ItArrivalTableRow;
}
	
	public WebElement historyDiv() {
		return historyDiv;
}
	
	public WebElement historyDivITnumber() {
		return historyDivITnumber;
}
	
	public WebElement ArrivalDateinContenerArrival() {
		return ArrivalDateinContenerArrival;
}
	
	
	
	public WebElement ItContainerITnumber() {
		return ItContainerITnumber;
}
	
	
	public WebElement ArrivaldateinBillarrival() {
		return ArrivaldateinBillarrival;
}
	
	public WebElement ItNumberinBillarrival() {
		return ItNumberinBillarrival;
}
	
}
