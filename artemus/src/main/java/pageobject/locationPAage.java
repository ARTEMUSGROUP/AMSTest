package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class locationPAage {

	// WebDriver driver;

	public locationPAage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = " //a[contains(text(),'Tables')]")
	public WebElement tableTab;

	@FindBy(xpath = "/html/body/table/tbody/tr[2]/td/div/ul[7]/li[1]/a")
	public WebElement locationTab;

	@FindBy(xpath = "//td[@class='Title'][contains(text(),'Location')]")
	public WebElement pageTitle;

	@FindBy(css = "select[name='country']")
	public WebElement country;

	@FindBy(css = "input[name='name']")
	public WebElement portorcity;

	@FindBy(css = "select[name='state']")
	public WebElement state;

	@FindBy(css = "select[name='customCode']")
	public WebElement customscode;

	@FindBy(css = "input[name='holdAtLp']")
	public WebElement holdAtLp;

	@FindBy(css = "input[name='canadaCustomeCode']")
	public WebElement canadaCustomeCode;

	@FindBy(css = "input[name='warehouseCode']")
	public WebElement warehouseCode;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement warehousedetails;

	@FindBy(css = "input[name='unlocode']")
	public WebElement unlocode;

	@FindBy(xpath = "//body//div[@id='modal1']//tr//tr[1]//td[1]")
	public WebElement unlocodedetails;

	@FindBy(css = "img[id='img_save']")
	public WebElement save;

	@FindBy(css = "img[id='img_find']")
	public WebElement findlocation;

	@FindBy(css = "input[name='locationName']")
	public WebElement enterlocation;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement searchlocation;

	@FindBy(xpath = "//body//div[@id='ResponseDiv']//tr//tr[1]//td[1]")
	public WebElement searchgrid;

	@FindBy(css = "img[id='img_delete']")
	public WebElement deletelocation;

	@FindBy(css = "input[value='M']")
	public WebElement locationType;

	@FindBy(xpath = "//body//div[@id='ResponseDiv']//tr//tr[1]//td[1]")
	public WebElement searchcheck;

	@FindBy(xpath = "//b[contains(text(),'Record not present for that crteria')]")
	public WebElement errorlog;

	public WebElement tableTab() {
		return tableTab;
	}

	public WebElement locationTab() {
		return locationTab;
	}

	public WebElement country() {
		return country;
	}

	public WebElement portorcity() {
		return portorcity;
	}

	public WebElement state() {
		return state;
	}

	public WebElement customscode() {
		return customscode;
	}

	public WebElement holdAtLp() {
		return holdAtLp;
	}

	public WebElement canadaCustomeCode() {
		return canadaCustomeCode;
	}

	public WebElement warehouseCode() {
		return warehouseCode;
	}

	/*
	 * public WebElement warehouseCode(){ WebDriverWait wait = new
	 * WebDriverWait(driver,5);
	 * wait.until(ExpectedConditions.visibilityOf(warehouseCode())); return
	 * warehouseCode; }
	 */

	public WebElement unlocode() {
		return unlocode;
	}

	public WebElement save() {
		return save;
	}

	public WebElement warehousedetails() {
		return warehousedetails;
	}

	public WebElement unlocodedetails() {
		return unlocodedetails;
	}

	public WebElement findlocation() {
		return findlocation;
	}

	public WebElement enterlocation() {
		return enterlocation;
	}

	public WebElement searchlocation() {
		return searchlocation;
	}

	public WebElement searchgrid() {
		return searchgrid;
	}

	public WebElement deletelocation() {
		return deletelocation;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement locationType() {
		return locationType;
	}

	public WebElement searchcheck() {
		return searchcheck;
	}

	public WebElement errorlog() {
		return errorlog;
	}

}
