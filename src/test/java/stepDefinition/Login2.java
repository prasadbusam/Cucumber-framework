package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2 {
	WebDriver driver;
	
	@Given("Open chrome")
	public void open_chrome() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	}

	@Given("User navigates the url {string}")
	public void user_navigates_the_url(String url) throws InterruptedException {
		Thread.sleep(3000);
	    driver.get(url);
	}

	@When("User enter valid username {string}")
	public void user_enter_valid_username(String username) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(username);
	    	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String password) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	@Then("user should be redirect to logout page")
	public void user_should_be_redirect_to_logout_page() {
	    try {
	        boolean isLogoutDisplayed = driver.findElement(By.linkText("Logout")).isDisplayed();
	        if (isLogoutDisplayed) {
	            System.out.println("Login successful. Logging out...");
	            driver.findElement(By.linkText("Logout")).click();
	        } else {
	            throw new AssertionError("Login failed: Logout button not visible.");
	        }
	    } catch (Exception e) {
	        throw new AssertionError("Login failed: Logout element not found or error occurred.");
	    }
	}

	
	@Then("close the browser")
	public void user_close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


}
