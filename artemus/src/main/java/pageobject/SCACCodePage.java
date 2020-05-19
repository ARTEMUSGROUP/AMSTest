package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SCACCodePage {

	
	public SCACCodePage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'Tables')]")  public WebElement Tables;
	
	@FindBy(xpath="//a[contains(text(),'SCAC Code')]")  public WebElement SCACcodeTab;
	
	@FindBy(css="input[name='scacCode']")  public WebElement SCACcode;

	@FindBy(css="input[name='scacName']")  public WebElement scacName;

	@FindBy(css="input[name='carrierCode']")  public WebElement carrierCode;

	@FindBy(css="img[alt='New']")  public WebElement New;

	@FindBy(css="img[alt='Save']")  public WebElement Save;

	@FindBy(css="img[alt='Delete']")  public WebElement Delete;

	@FindBy(css="img[alt='Find']")  public WebElement Find;

	@FindBy(css="input[name='sName']")  public WebElement sName;

	@FindBy(css="input[name='SearchButton']")  public WebElement SearchButton;

	@FindBy(xpath="//*[@id='ResponseDiv']/div/table/tbody/tr/td/table/tbody/tr[1]")  public WebElement GridRow;

	@FindBy(xpath="//td[contains(text(),'SCAC Code')]")  public WebElement PageTitle;

	
	
	public WebElement Tables() {
		return Tables;
	}
	
	
	public WebElement SCACcodeTab() {
		return SCACcodeTab;
	}
	
	public WebElement SCACcode() {
		return SCACcode;
	}
	
	
		public WebElement scacName() {
		return scacName;
	}
		
		public WebElement carrierCode() {
			return carrierCode;
		}
		
		public WebElement New() {
			return New;
		}
		
		
		public WebElement Save() {
			return Save;
		}
		
		
		public WebElement Delete() {
			return Delete;
		}
		
		public WebElement Find() {
			return Find;
		}
		
		public WebElement sName() {
			return sName;
		}
		
		
		public WebElement SearchButton() {
			return SearchButton;
		}
		
		public WebElement GridRow() {
			return GridRow;
		}
		
		public WebElement PageTitle() {
			return PageTitle;
		}
}
