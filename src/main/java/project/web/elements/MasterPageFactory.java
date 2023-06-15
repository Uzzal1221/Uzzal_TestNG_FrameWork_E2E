package project.web.elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parent.base.ParentClass;
import project.Generics.CommonUtil;

public class MasterPageFactory extends ParentClass{
//this is how to initialize the pagefactory 
	public MasterPageFactory() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@name='email'])[1]")
	@CacheLookup
	//WebElement is a class from selenium 
	private WebElement enterEmail;
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	@FindBy(xpath="(//button[@type='submit'])[1]")
	@CacheLookup 
	private WebElement clickOnLoginBTN;
	public WebElement getclickOnLoginBTN() {
		return clickOnLoginBTN;
	}
	@FindBy(xpath="//*[text()=' Home']")
	@CacheLookup 
	private WebElement verifyText;
	public WebElement getverifyText() {
		return verifyText;
	}
	@FindBy(xpath="//a[@href='/products']")
	@CacheLookup 
	private WebElement clickOnProduct;
	public WebElement getclickOnProduct() {
		return clickOnProduct;
	}
	public void getLoginIn(String userName, String Pass) {
		getEnterEmail().sendKeys(userName);
		getEnterPassword().sendKeys(Pass);
		CommonUtil.actionClick(getclickOnLoginBTN());
		//Actions ac = new Actions(driver);
		//ac.click(getclickOnLoginBTN()).build().perform();
		
	}
	
}
