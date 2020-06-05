package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AFRVoyageSchedule {
	// WebDriver driver;

	public AFRVoyageSchedule(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[contains(text(),'Japan Customs')]")
	public WebElement JapanCustoms;

	@FindBy(xpath = "//a[contains(text(),'AFR Voyage Schedule')]")
	public WebElement voyageschedule;

	@FindBy(xpath = "//td[contains(text(),'AFR Voyage Schedule')]")
	public WebElement pageTitle;

	@FindBy(css = "select[name='vesselId']")
	public WebElement vesselId;

	@FindBy(css = "input[name='voyage']")
	public WebElement voyage;

	@FindBy(css = "input[name='scacCode']")
	public WebElement scacCodeDiv;

	@FindBy(css = "input[name='crewMembers']")
	public WebElement crewMembers;

	@FindBy(css = "input[name='passengers']")
	public WebElement passengers;

	@FindBy(css = "input[name='reportNumber']")
	public WebElement reportNumber;

	@FindBy(css = "input[value='New']")
	public WebElement addNewlocation;

	@FindBy(css = "input[name='location']")
	public WebElement add1stlocation;

	@FindBy(xpath = "//tr[@id='tr2']//input[@name='location']")
	public WebElement add2stlocation;

	@FindBy(css = "	img[onclick='getPreLocationList(this);']")
	public WebElement getPreLocationList;

	@FindBy(xpath = "//tr[@id='tr2']//td[1]//img[1]")
	public WebElement getPreLocationList2;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement selectfromtable;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement selectfromtable2;

	@FindBy(css = "input[name='terminal']")
	public WebElement terminal;

	@FindBy(css = "input[id='arrivalDater1']")
	public WebElement arrivalDater1;

	@FindBy(css = "input[id='arrivalDater2']")
	public WebElement arrivalDater2;

	@FindBy(css = "input[id='sailingDater1']")
	public WebElement sailingDater1;

	@FindBy(css = "input[id='sailingDater2']")
	public WebElement sailingDater2;

	@FindBy(css = "input[name='loadCheckBox']")
	public WebElement loadCheckBox;

	@FindBy(css = "input[name='dischargeCheckBox']")
	public WebElement dischargeCheckBox;

	@FindBy(css = "input[name='lastLoadPortCheckBox']")
	public WebElement lastLoadPortCheckBox;

	@FindBy(xpath = "//tr[@id='tr2']//input[@name='loadCheckBox']")
	public WebElement loadCheckBox2;

	@FindBy(xpath = "//tr[@id='tr2']//input[@name='dischargeCheckBox']")
	public WebElement dischargeCheckBox2;

	@FindBy(css = "img[id='img_save']")
	public WebElement savevoyege;

	@FindBy(css = "img[id='img_find']")
	public WebElement findvoyege;

	@FindBy(css = "input[name='vId']")
	public WebElement entervoyege;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement SearchButton;

	@FindBy(xpath = "//body//div[@id='ResponseDiv']//tr//tr[1]//td[1]")
	public WebElement gridrow;

	@FindBy(css = "img[id='img_delete']")
	public WebElement deletevoyege;

	@FindBy(xpath = "//tr[@id='tr1']")
	public WebElement newrow;

	@FindBy(xpath = "//*[@id='modal1']/div/table/tbody")
	public WebElement prelocationtable;

	@FindBy(xpath = "//body/form[@name='voyage']/div[@id='modalNew']/table[1]")
	public WebElement searchpopup;

	public WebElement JapanCustoms() {
		return JapanCustoms;
	}

	public WebElement voyageschedule() {
		return voyageschedule;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement vesselId() {
		return vesselId;
	}

	public WebElement voyage() {
		return voyage;
	}

	public WebElement scacCodeDiv() {
		return scacCodeDiv;
	}

	public WebElement crewMembers() {
		return crewMembers;
	}

	public WebElement passengers() {
		return passengers;
	}

	public WebElement reportNumber() {
		return reportNumber;
	}

	public WebElement addNewlocation() {
		return addNewlocation;
	}

	public WebElement add1stlocation() {
		return add1stlocation;
	}

	public WebElement selectfromtable() {
		return selectfromtable;
	}

	public WebElement terminal() {
		return terminal;
	}

	public WebElement arrivalDater1() {
		return arrivalDater1;
	}

	public WebElement sailingDater1() {
		return sailingDater1;
	}

	public WebElement loadCheckBox() {
		return loadCheckBox;
	}

	public WebElement dischargeCheckBox() {
		return dischargeCheckBox;
	}

	public WebElement lastLoadPortCheckBox() {
		return lastLoadPortCheckBox;
	}

	public WebElement getPreLocationList() {
		return getPreLocationList;
	}

	public WebElement add2stlocation() {
		return add2stlocation;
	}

	public WebElement arrivalDater2() {
		return arrivalDater2;
	}

	public WebElement sailingDater2() {
		return sailingDater2;
	}

	public WebElement loadCheckBox2() {
		return loadCheckBox2;
	}

	public WebElement dischargeCheckBox2() {
		return dischargeCheckBox2;
	}

	public WebElement savevoyege() {
		return savevoyege;
	}

	public WebElement findvoyege() {
		return findvoyege;
	}

	public WebElement entervoyege() {
		return entervoyege;
	}

	public WebElement SearchButton() {
		return SearchButton;
	}

	public WebElement gridrow() {
		return gridrow;
	}

	public WebElement getPreLocationList2() {
		return getPreLocationList2;
	}

	public WebElement selectfromtable2() {
		return selectfromtable2;
	}

	public WebElement deletevoyege() {
		return deletevoyege;
	}

	public WebElement newrow() {
		return newrow;
	}

	public WebElement prelocationtable() {
		return prelocationtable;
	}

	public WebElement searchpopup() {
		return searchpopup;
	}

}
