package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class billheaderpage {
	// WebDriver driver;

	public billheaderpage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Billtab
	@FindBy(xpath = "//a[contains(text(),'Bill Of Lading')]")
	public WebElement billoflading;
	// td[contains(text(),'Customer Profile')]

	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td/div/ul[3]/li[1]/a")
	public WebElement billheadertab;

	// Bill Details
	@FindBy(xpath = "//td[contains(text(),'Bill Header')]")
	public WebElement pagetitle;

	@FindBy(xpath = " //input[@name='billLadingNumber']")
	public WebElement billLadingNumber;

	@FindBy(css = "select[name='billStatus']")
	public WebElement billStatus;

	@FindBy(css = "select[name='billType']")
	public WebElement billType;

	@FindBy(css = "input[name='hblScac']")
	public WebElement hblScac;

	@FindBy(css = "img[onclick='populateHblScac(document.billHeader.hblScac)']")
	public WebElement populateHblScac;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement hblscacTableRow;

	@FindBy(css = "select[name='nvoType']")
	public WebElement nvoType;

	// Shipper Details
	@FindBy(css = "input[name='shipperName']")
	public WebElement shipperName;

	@FindBy(xpath = "//div[@id='Shipper']//img[1]")
	public WebElement preshipperlist;

	@FindBy(xpath = "//div[@id='modal1']")
	public WebElement shippertlistTable;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement shippertlistTableRow;

	// consignee Details
	@FindBy(css = "input[name='consigneeName']")
	public WebElement consigneeName;

	@FindBy(xpath = "//div[@id='Consignee']//img[1]")
	public WebElement preconsigneelist;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement consigneetableRow;

	// Notify details
	@FindBy(xpath = "//*[@id='tabs']/ul/li[2]/a")
	public WebElement notifyparty;

	@FindBy(css = "input[name='notifyName']")
	public WebElement notifyName;

	@FindBy(xpath = "//div[@id='Notify']//img[1]")
	public WebElement prenotifylist;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement notifyTableRow;

	// Also Notify Parties
	@FindBy(xpath = "//table[4]//tbody[1]//tr[2]//td[1]//table[1]//tbody[1]//tr[1]//td[1]//input[1]")
	public WebElement alsonotifyparties;

	@FindBy(css = "input[name='carrierName']")
	public WebElement carrierName;

	@FindBy(xpath = "//body//div[@id='modal1']//td//td[1]")
	public WebElement carrierNamelist;

	@FindBy(css = "	input[name='scacCode']")
	public WebElement alsonotifyscac;

	// Voyege Schedule

	@FindBy(css = "input[name='vesselName']")
	public WebElement vesselName;

	@FindBy(css = "	img[onclick='populateVessel(document.billHeader.vesselName)']")
	public WebElement populateVessel;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement vesselNamelistRow;

	@FindBy(css = "input[name='receiptPlace']")
	public WebElement receiptPlace;

	@FindBy(css = "img[onclick='getLocation(document.billHeader.receiptPlace)']")
	public WebElement getpreLocation;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement receiptPlaceTableRow;

	@FindBy(css = "select[name='loadPort']")
	public WebElement loadPort;

	@FindBy(css = "select[name='dischargePort']")
	public WebElement dischargePort;

	@FindBy(css = "input[name='deliveryPlace']")
	public WebElement deliveryPlace;

	@FindBy(css = "img[onclick='getLocation(document.billHeader.deliveryPlace)']")
	public WebElement getpredeliveryPlace;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[2]//td[1]")
	public WebElement deliveryPlaceTableRow;

	@FindBy(css = "select[name='moveType']")
	public WebElement moveType;

	@FindBy(css = "select[name='originCountry']")
	public WebElement originCountry;

	// Equipment Details

	@FindBy(xpath = "//table[@id='equipmentTable1']//input[@name='Add Row']")
	public WebElement equipmentaddRow;

	@FindBy(css = "input[name='equipment']")
	public WebElement equipment;

	@FindBy(xpath = "//tr[@id='tr0']//select[@id='equipmentSizeTypeSelId']")
	public WebElement equipmentSizeTypeSelId;

	// packages
	@FindBy(xpath = "/html/body/form/table[2]/tbody/tr/td/table[7]/tbody/tr/td/table[2]/tbody/tr/td[1]/input")
	public WebElement packageAddRow;

	@FindBy(css = "input[name='packageItem']")
	public WebElement packageItem;

	@FindBy(css = "select[name='packageEquipment']")
	public WebElement packageEquipment;

	@FindBy(css = "textarea[name='marks']")
	public WebElement marks;

	@FindBy(css = "input[name='pieces']")
	public WebElement pieces;

	@FindBy(css = "select[name='packages']")
	public WebElement packages;

	@FindBy(xpath = "//div[@id='mainDiv']/div/table/tbody/tr[1]/td[2]/input")
	public WebElement waight;

	@FindBy(xpath = "//div[@id='mainDiv']/div/table/tbody/tr[1]/td[3]/select")
	public WebElement wtiUnit;

	// cargo details
	@FindBy(xpath = "//td[text()='Repeat Values']//input[@name='Add Row']")
	public WebElement cargoAddRow;

	@FindBy(css = "input[name='cargoItem']")
	public WebElement cargoItem;

	@FindBy(css = "select[id='cargoEquipment']")
	public WebElement cargoEquipment;

	@FindBy(css = "textarea[name='goodsDescription']")
	public WebElement goodsDescription;

	@FindBy(css = "input[name='harmonizedCode']")
	public WebElement harmonizedCode;

	@FindBy(css = "input[name='hazardCode']")
	public WebElement hazardCode;

	@FindBy(css = "input[name='manufacturer']")
	public WebElement manufacturer;

	@FindBy(css = "select[name='cargoCountry']")
	public WebElement cargoCountry;

	@FindBy(css = "input[name='harmonizedSearch']")
	public WebElement harmonizedSearch;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement harmonizedSearchButton;

	@FindBy(xpath = "//table[@id='CargoTable1']//td[4]//img[1]")
	public WebElement preharmonizedcode;

	@FindBy(xpath = "//input[@name='hazardSearch']")
	public WebElement preHazardcode;

	@FindBy(xpath = "//td[5]//img[1]")
	public WebElement hazardSearch;

	@FindBy(xpath = " //input[@name='SearchButton']")
	public WebElement hazardSearchButton;

	@FindBy(css = "td:nth-child(1) table.GridTable tbody:nth-child(2) tr:nth-child(1) > td:nth-child(1)")
	public WebElement HarmonizedtableRow;

	// Manufacturer

	@FindBy(css = "img[onclick='populateManifecturer(this);']")
	public WebElement preManufacturerlist;

	@FindBy(css = " input[name='manufacturerString']")
	public WebElement Manufacturername;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement ManufacturerSearchButton;

	@FindBy(xpath = " //body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement ManufacturerTableRow;

	// saveBill

	@FindBy(css = "img[id='img_save']")
	public WebElement saveButton;

	// updateBill
	@FindBy(css = "img[id='img_find']")
	public WebElement findbill;

	@FindBy(css = "input[name='billSearch']")
	public WebElement billSearch;

	@FindBy(css = "input[value='Search']")
	public WebElement billSearchbutton;

	@FindBy(xpath = "//*[@id='BillTable']/tbody/tr/td[1]")
	public WebElement TableRow;

	public WebElement billoflading() {
		return billoflading;
	}

	public WebElement billheadertab() {
		return billheadertab;
	}

	public WebElement pagetitle() {
		return pagetitle;
	}

	public WebElement billLadingNumber() {
		return billLadingNumber;
	}

	public WebElement billStatus() {
		return billStatus;
	}

	public WebElement billType() {
		return billType;
	}

	public WebElement hblScac() {
		return hblScac;
	}

	public WebElement nvoType() {
		return nvoType;
	}

	public WebElement shipperName() {
		return shipperName;
	}

	public WebElement preshipperlist() {
		return preshipperlist;
	}

	public WebElement shippertlistTable() {
		return shippertlistTable;
	}

	public WebElement shippertlistTableRow() {
		return shippertlistTableRow;
	}

	public WebElement consigneeName() {
		return consigneeName;
	}

	public WebElement preconsigneelist() {
		return preconsigneelist;
	}

	public WebElement consigneetableRow() {
		return consigneetableRow;
	}

	public WebElement notifyparty() {
		return notifyparty;
	}

	public WebElement prenotifylist() {
		return prenotifylist;
	}

	public WebElement notifyTableRow() {
		return notifyTableRow;
	}

	public WebElement alsonotifyparties() {
		return alsonotifyparties;
	}

	public WebElement carrierName() {
		return carrierName;
	}

	public WebElement carrierNamelist() {
		return carrierNamelist;
	}

	public WebElement vesselName() {
		return vesselName;
	}

	public WebElement vesselNamelistRow() {
		return vesselNamelistRow;
	}

	public WebElement receiptPlace() {
		return receiptPlace;
	}

	public WebElement receiptPlaceTableRow() {
		return receiptPlaceTableRow;
	}

	public WebElement loadPort() {
		return loadPort;
	}

	public WebElement dischargePort() {
		return dischargePort;
	}

	public WebElement deliveryPlace() {
		return deliveryPlace;
	}

	public WebElement deliveryPlaceTableRow() {
		return deliveryPlaceTableRow;
	}

	public WebElement moveType() {
		return moveType;
	}

	public WebElement originCountry() {
		return originCountry;
	}

	public WebElement equipmentaddRow() {
		return equipmentaddRow;
	}

	public WebElement equipment() {
		return equipment;
	}

	public WebElement equipmentSizeTypeSelId() {
		return equipmentSizeTypeSelId;
	}

	public WebElement packageAddRow() {
		return packageAddRow;
	}

	public WebElement packageEquipment() {
		return packageEquipment;
	}

	public WebElement marks() {
		return marks;
	}

	public WebElement pieces() {
		return pieces;
	}

	public WebElement packages() {
		return packages;
	}

	public WebElement waight() {
		return waight;
	}

	public WebElement wtiUnit() {
		return wtiUnit;
	}

	public WebElement cargoAddRow() {
		return cargoAddRow;
	}

	public WebElement cargoItem() {
		return cargoItem;
	}

	public WebElement goodsDescription() {
		return goodsDescription;
	}

	public WebElement harmonizedCode() {
		return harmonizedCode;
	}

	public WebElement hazardCode() {
		return hazardCode;
	}

	public WebElement manufacturer() {
		return manufacturer;
	}

	public WebElement cargoCountry() {
		return cargoCountry;
	}

	public WebElement harmonizedSearch() {
		return harmonizedSearch;
	}

	public WebElement harmonizedSearchButton() {
		return harmonizedSearchButton;
	}

	public WebElement preharmonizedcode() {
		return preharmonizedcode;
	}

	public WebElement preHazardcode() {
		return preHazardcode;
	}

	public WebElement hazardSearch() {
		return hazardSearch;
	}

	public WebElement hazardSearchButton() {
		return hazardSearchButton;
	}

	public WebElement HarmonizedtableRow() {
		return HarmonizedtableRow;
	}

	public WebElement notifyName() {
		return notifyName;
	}

	public WebElement hblscacTableRow() {
		return hblscacTableRow;
	}

	public WebElement populateHblScac() {
		return populateHblScac;
	}

	public WebElement alsonotifyscac() {
		return alsonotifyscac;
	}

	public WebElement populateVessel() {
		return populateVessel;
	}

	public WebElement getpreLocation() {
		return getpreLocation;
	}

	public WebElement getpredeliveryPlace() {
		return getpredeliveryPlace;
	}

	public WebElement preManufacturerlist() {
		return preManufacturerlist;
	}

	public WebElement Manufacturername() {
		return Manufacturername;
	}

	public WebElement ManufacturerSearchButton() {
		return ManufacturerSearchButton;
	}

	public WebElement ManufacturerTableRow() {
		return ManufacturerTableRow;
	}

	public WebElement saveButton() {
		return saveButton;
	}

	public WebElement findbill() {
		return findbill;
	}

	public WebElement billSearch() {
		return billSearch;
	}

	public WebElement billSearchbutton() {
		return billSearchbutton;
	}

	public WebElement TableRow() {
		return TableRow;
	}
}
