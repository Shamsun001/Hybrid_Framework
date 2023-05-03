package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(id="email")
	private WebElement un_ele;
	@FindBy(id="pass")
	private WebElement pwd_ele;
	@FindBy(name="login")
	private WebElement btn_ele;
	
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String us1)
	{
		un_ele.sendKeys("manager");
	}
	public void password(String Pwd1)
	{
		pwd_ele.sendKeys("hadmin");
	}
	public void login_btn()
	{
		btn_ele.click();
	}
}
