package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vesselpage {
	// WebDriver driver;

	public vesselpage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[contains(text(),'Tables')]")
	public WebElement tableTab;

	@FindBy(xpath = " //a[contains(text(),'Vessel')]")
	public WebElement vesseltab;

	@FindBy(css = "	td[align='right']")
	public WebElement pageTitle;

	@FindBy(css = "input[name='vesselName']")
	public WebElement vesselName;

	@FindBy(css = "select[name='vesselType']")
	public WebElement vesselType;

	@FindBy(css = "input[name='owner']")
	public WebElement owner;

	@FindBy(css = "input[name='lloydsCode']")
	public WebElement lloydsCode;

	@FindBy(css = "select[name='country']")
	public WebElement country;

	@FindBy(css = "input[name='usaScacCode']")
	public WebElement usaScacCode;

	@FindBy(css = "input[name='japanCarrierCode']")
	public WebElement japanCarrierCode;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement japanCarrierdetails;

	@FindBy(css = "input[name='callsign']")
	public WebElement callsign;

	@FindBy(css = "img[id='img_save']")
	public WebElement savevessel;

	@FindBy(css = "img[id='img_find']")
	public WebElement findvessel;

	@FindBy(css = "input[name='searchVessel']")
	public WebElement searchVessel;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement SearchButton;

	@FindBy(xpath = "//table[@class='GridTable']//tbody")
	public WebElement vesselid;

	@FindBy(xpath = "//body//div[@id='ResponseDiv']//tr//tr[1]//td[1]")
	public WebElement searchgrid;

	@FindBy(xpath = "//table[@class='GridTable']")
	public WebElement tablegrid;

	@FindBy(css = "img[id='img_delete']")
	public WebElement deletevessel;

	@FindBy(css = "input[name='sendToCustom2']")
	public WebElement sendtocustomcheck;

	@FindBy(xpath = "//body//div[@id='modal']//td//td//td[1]")
	public WebElement searchcheckvessel;

	@FindBy(xpath = "//font[contains(text(),'Record not present for that crteria!')]")
	public WebElement errorlog;

	public WebElement tableTab() {
		return tableTab;
	}

	public WebElement vesseltab() {
		return vesseltab;
	}

	public WebElement vesselName() {
		return vesselName;
	}

	public WebElement vesselType() {
		return vesselType;
	}

	public WebElement owner() {
		return owner;
	}

	public WebElement lloydsCode() {
		return lloydsCode;
	}

	public WebElement country() {
		return country;
	}

	public WebElement usaScacCode() {
		return usaScacCode;
	}

	public WebElement japanCarrierCode() {
		return japanCarrierCode;
	}

	public WebElement callsign() {
		return callsign;
	}

	public WebElement savevessel() {
		return savevessel;
	}

	public WebElement findvessel() {
		return findvessel;
	}

	public WebElement japanCarrierdetails() {
		return japanCarrierdetails;
	}

	public WebElement deletevessel() {
		return deletevessel;
	}

	public WebElement searchVessel() {
		return searchVessel;
	}

	public WebElement SearchButton() {
		return SearchButton;
	}

	public WebElement searchgrid() {
		return searchgrid;
	}

	public WebElement vesselid() {
		return vesselid;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement sendtocustomcheck() {
		return sendtocustomcheck;
	}

	public WebElement searchcheckvessel() {
		return searchcheckvessel;
	}

	public WebElement errorlog() {
		return errorlog;
	}

}
