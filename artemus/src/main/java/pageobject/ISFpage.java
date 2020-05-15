package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ISFpage {

	
	
	
	public ISFpage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="ISF")  public WebElement ISF;
	
	@FindBy(xpath ="//a[contains(text(),'Add Orignal ISF')]")	public WebElement AddOrignalISF;
	
	@FindBy(xpath ="//td[contains(text(),'ISF')]")	public WebElement PageTitle;

	
	@FindBy(css ="select[name='vesselId']")	public WebElement vesselId;

	@FindBy(css ="select[name='voyageId']")	public WebElement voyageId;

	
	@FindBy(css ="select[name='loadPortId']")	public WebElement loadPortId;

	@FindBy(css ="select[name='dischargePortId']")	public WebElement dischargePortId;

	@FindBy(css ="img[alt='Find Criteria']")	public WebElement Find;

	@FindBy(css ="div[id='billDetails']")	public WebElement billDetailsTable;
	
	@FindBy(xpath ="//tr[@id='tr0']//td[1]//input[@name='isISFSentCheckBox']")	public WebElement isISFSentCheckBox;

	@FindBy(css ="input[id='validateISFBill']")	public WebElement validateISFBill;

	@FindBy(xpath ="//tr[@id='tr0']//td[4]")	public WebElement ISFsenttd;

	@FindBy(xpath ="//tr[@id='tr0']//td[3]")	public WebElement ISFError;

	@FindBy(xpath ="//tr[@id='tr0']")	public WebElement ISFTableRow;

	@FindBy(xpath ="//*[@id='StatusTable']/tbody/tr[1]/td[1]")	public WebElement SentDate	;

	@FindBy(xpath ="//*[@id='StatusTable']/tbody/tr[1]/td[2]")	public WebElement SentType	;

	@FindBy(xpath ="//table[2]//tbody[1]//tr[1]//td[1]//div[1]")	public WebElement StatusTable2	;

	@FindBy(css ="input[name='Save']")	public WebElement SubmitISFBill;

	
	
	
	
	public WebElement ISF() {
		return ISF;
	}
	
	public WebElement AddOrignalISF() {
		return AddOrignalISF;
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
	
	public WebElement loadPortId() {
		return loadPortId;
		}
	
	public WebElement dischargePortId() {
		return dischargePortId;
		}
	
	
	public WebElement Find() {
		return Find;
		}
	
	public WebElement billDetailsTable() {
		return billDetailsTable;
		}
	
	public WebElement isISFSentCheckBox() {
		return isISFSentCheckBox;
		}
	
	public WebElement validateISFBill() {
		return validateISFBill;
		}
	
	
	public WebElement ISFsenttd() {
		return ISFsenttd;
		}
	
	public WebElement ISFError() {
		return ISFError;
		}
	
	
	public WebElement ISFTableRow() {
		return ISFTableRow;
		}
	
	
	public WebElement SentDate() {
		return SentDate;
		}
	
	public WebElement SentType() {
		return SentType;
		}
	
	public WebElement StatusTable2() {
		return StatusTable2;
		}
	
	public WebElement SubmitISFBill() {
		return SubmitISFBill;
		}
}
