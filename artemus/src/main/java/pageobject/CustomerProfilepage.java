package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerProfilepage {

	// WebDriver driver;

	public CustomerProfilepage(WebDriver driver) {
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[contains(text(),'Customer Profile')]")
	public WebElement pageTitle;
	// td[contains(text(),'Customer Profile')]

	@FindBy(linkText = "Customer Profile")
	public WebElement createcustomer;

	@FindBy(name = "customerName")
	public WebElement customerName;

	@FindBy(name = "entityNumber")
	public WebElement entityNumber;

	@FindBy(css = "input[name='address1']")
	public WebElement address1;

	@FindBy(css = "input[name='address2']")
	public WebElement address2;

	@FindBy(css = "input[name='city']")
	public WebElement city;

	@FindBy(css = "select[name='country']")
	public WebElement country;

	@FindBy(css = "select[name='state']")
	public WebElement state;

	@FindBy(css = "input[name='zipCode")
	public WebElement zipCode;

	@FindBy(css = "input[name='phoneNo")
	public WebElement phoneNo;

	@FindBy(css = "input[name='faxNo")
	public WebElement faxNo;

	@FindBy(css = "img[id='img_save']")
	public WebElement save;

	@FindBy(css = "	div[id='dialog-confirm']")
	public WebElement dialogconfirm;

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	public WebElement saveentity;

	@FindBy(css = "img[id='img_find']")
	public WebElement findcustomer;

	@FindBy(css = "div[class='PopupDiv']")
	public WebElement searchbox;

	@FindBy(css = "div[id='ResponseDiv']")
	public WebElement searchgridview;

	@FindBy(css = "input[name='cName']")
	public WebElement entercustName;

	@FindBy(css = "input[name='SearchButton']")
	public WebElement SearchCust;

	@FindBy(css = "table[class='GridTable']")
	public WebElement SearchCustGridTable;

	@FindBy(xpath = "//table[@class='GridTable']//tbody//tr")
	public WebElement SearchCustGridrow;

	@FindBy(css = "img[id='img_delete']")
	public WebElement deletecustomer;

	@FindBy(xpath = "//font[contains(text(),'Sorry! No customer found.')]")
	public WebElement nocustomerfound;

	public WebElement createcustomer() {
		return createcustomer;
	}

	public WebElement customerName() {
		return customerName;
	}

	public WebElement entityNumber() {
		return entityNumber;
	}

	public WebElement address1() {
		return address1;
	}

	public WebElement address2() {
		return address2;
	}

	public WebElement city() {
		return city;
	}

	public WebElement country() {
		return country;
	}

	public WebElement state() {
		return state;
	}

	public WebElement zipCode() {
		return zipCode;
	}

	public WebElement phoneNo() {
		return phoneNo;
	}

	public WebElement faxNo() {
		return faxNo;
	}

	public WebElement save() {
		return save;
	}

	public WebElement saveentity() {
		return saveentity;
	}

	public WebElement findcustomer() {
		return findcustomer;
	}

	public WebElement entercustName() {
		return entercustName;
	}

	public WebElement SearchCust() {
		return SearchCust;
	}

	public WebElement SearchCustGridTable() {
		return SearchCustGridTable;
	}

	public WebElement SearchCustGridrow() {
		return SearchCustGridrow;
	}

	public WebElement deletecustomer() {
		return deletecustomer;
	}

	public WebElement pageTitle() {
		return pageTitle;
	}

	public WebElement dialogconfirm() {
		return dialogconfirm;
	}

	public WebElement searchbox() {
		return searchbox;
	}

	public WebElement searchgridview() {
		return searchgridview;
	}

	public WebElement nocustomerfound() {
		return nocustomerfound;
	}

}
