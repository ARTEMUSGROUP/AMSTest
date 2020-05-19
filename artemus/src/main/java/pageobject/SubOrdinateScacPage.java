package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubOrdinateScacPage {

	
	public SubOrdinateScacPage(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[contains(text(),'Tables')]")  public WebElement Tables;
	
	@FindBy(xpath="//a[contains(text(),' Sub-Ordinate SCAC')]")  public WebElement SubOrdinateSCACTab;
	
	
	@FindBy(xpath="//td[contains(text(),'Sub-Ordinate Scac')]")  public WebElement PageTitle;

	@FindBy(css="input[name='scacCode']")  public WebElement scacCode;

	@FindBy(css="input[name='bondHolder']")  public WebElement bondHolder;

	@FindBy(css="select[name='bondActivityCode']")  public WebElement bondActivityCode;

	@FindBy(css="select[name='bondType']")  public WebElement bondType;

	@FindBy(css="input[name='vnumber']")  public WebElement vnumber;

	@FindBy(css="input[name='name']")  public WebElement name;

	@FindBy(css="img[alt='New']")  public WebElement New;

	@FindBy(css="img[alt='Save']")  public WebElement Save;

	@FindBy(css="img[alt='Delete']")  public WebElement Delete;

	@FindBy(css="img[alt='Find']")  public WebElement Find;

	@FindBy(css="input[name='sCode']")  public WebElement sCode;

	@FindBy(css="input[name='SearchButton']")  public WebElement SearchButton;

	@FindBy(xpath="//table[@class='GridTable']/tbody/tr")  public WebElement GridTable;

	
	
	public WebElement Tables() {
		return Tables;
	}
	
	
	public WebElement SubOrdinateSCACTab() {
		return SubOrdinateSCACTab;
	}
	
	
	public WebElement PageTitle() {
		return PageTitle;
	}
	
	
	public WebElement scacCode() {
		return scacCode;
	}
	
	
	public WebElement bondHolder() {
		return bondHolder;
	}
	
	
	public WebElement bondActivityCode() {
		return bondActivityCode;
	}
	
	
	public WebElement bondType() {
		return bondType;
	}
	

	public WebElement vnumber() {
		return vnumber;
	}
	
	
	public WebElement name() {
		return name;
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
	
	
	public WebElement sCode() {
		return sCode;
	}
	
	public WebElement SearchButton() {
		return SearchButton;
	}
	
	public WebElement GridTable() {
		return GridTable;
	}
}
