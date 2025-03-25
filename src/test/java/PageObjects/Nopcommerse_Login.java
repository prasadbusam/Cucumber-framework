package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nopcommerse_Login {
	WebDriver driver;
	public Nopcommerse_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@id='Email']") WebElement Email_loc;
@FindBy(xpath="//input[@id='Password']") WebElement Password_loc;
@FindBy(xpath="//button[normalize-space()='Log in']") WebElement Login_button_loc;


public void Setemail(String email) 
{
	Email_loc.sendKeys(email);
}

public void Setpassword(String password)
{
	Password_loc.sendKeys(password);
}

public void Click_login_button()
{
	Login_button_loc.click();
}

}


