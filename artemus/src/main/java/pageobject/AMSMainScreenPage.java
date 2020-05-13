package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMSMainScreenPage {


	WebDriver driver;

	public AMSMainScreenPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//AMS Main Screen

	    @FindBy(linkText ="AMS")	public WebElement AMS;

	 
	    @FindBy(xpath =" //a[contains(text(),'AMS Main Screen')]")	public WebElement AMSmainscreen;
 
	    @FindBy(xpath ="//td[contains(text(),'AMS Main Screen')]")	public WebElement pageTitle;

	
		@FindBy(css ="select[name='vesselId']")	public WebElement vesselIdmain;

		@FindBy(css ="select[name='voyageId']")	public WebElement voyageIdmain;
		
		@FindBy(css ="select[name='loadPort']")	public WebElement loadPort;

		
		@FindBy(css ="select[name='dischargePort']")	public WebElement dischargePort;

		@FindBy(css ="img[alt='Find Criteria']")	public WebElement findinmain;

		@FindBy(xpath =" //tr[@class='GridData']")	public WebElement GridData;
		
		@FindBy(xpath ="//tr[@class='GridData']//td[1]")	public WebElement loadportgriddata;

		@FindBy(xpath ="//tr[@class='GridData']//td[2]")	public WebElement dischargportgriddata;
		
		@FindBy(xpath ="//tr[@class='GridData']//td[4]")	public WebElement billcount;


		@FindBy(xpath ="//input[@name='billDetailInformation']")	public WebElement billDetailInformation;

		@FindBy(xpath ="//*[@id='modal1']/div/table[1]/tbody/tr/td[2]/img")	public WebElement closepopup;

		@FindBy(css ="input[name='customsErrorScreen']")	public WebElement customsErrorScreen;

		@FindBy(xpath ="//input[@name='originalManifestTracking']")	public WebElement originalManifestTracking;

		@FindBy(xpath ="//input[@name='billAmendTracking']")	public WebElement billAmendTracking;

		@FindBy(xpath =" //div[@id='portDetail']//td[4]")	public WebElement billnumberTotal;

		@FindBy(css ="div[id='buttonDiv']")	public WebElement buttonDiv;

		@FindBy(xpath ="//*[@id='modal1']")	public WebElement  billDetailInformationtable;

		@FindBy(css ="table[id='billDetailInformationTable']")	public WebElement  billDetailInformationRow;

		@FindBy(xpath ="//div[@id='modal1']//div//div//img")	public WebElement  billDetailInformationExcel;

		@FindBy(css ="table[id='customErrorTable']")	public WebElement  customErrorTableRow;

		@FindBy(xpath ="//*[@id='modal1']/div/div[1]/table")	public WebElement  originalManifestTrackingRow;

		@FindBy(xpath ="//body//div[@id='modal1']//div//div[1]")	public WebElement  billAmendTrackingRow;

		
		public WebElement AMS() {
			return AMS;
			
			
		}
		
		public WebElement AMSmainscreen() {
			return AMSmainscreen;
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
		
		public WebElement billDetailInformation() {
			return billDetailInformation;
		}
		

		public WebElement closepopup() {
			return closepopup;
		}
		
		
		public WebElement customsErrorScreen() {
			return customsErrorScreen;
		}
		
		public WebElement originalManifestTracking() {
			return originalManifestTracking;
		}
		
		
		public WebElement billAmendTracking() {
			return billAmendTracking;
		}
		
		
		public WebElement billnumberTotal() {
			return billnumberTotal;
		}
		
	
		public WebElement pageTitle() {
			return pageTitle;
		}
		
		public WebElement loadportgriddata() {
			return loadportgriddata;
		}
		
		public WebElement dischargportgriddata() {
			return dischargportgriddata;
		}
		
		public WebElement buttonDiv() {
			return buttonDiv;
		}
		
		public WebElement billcount() {
			return billcount;
		}
		
		public WebElement billDetailInformationtable() {
			return billDetailInformationtable;
		}
		
		public WebElement billDetailInformationRow() {
			return billDetailInformationRow;
		}
		
		public WebElement billDetailInformationExcel() {
			return billDetailInformationExcel;
		}
		
		public WebElement customErrorTableRow() {
			return customErrorTableRow;
		}
		
		public WebElement originalManifestTrackingRow() {
			return originalManifestTrackingRow;
	}
		
		public WebElement billAmendTrackingRow() {
			return billAmendTrackingRow;
	}
		
		
}
