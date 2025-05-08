package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_test {
	/*
	 * WebDriver driver;
	 * 
	 * @Given("Open the chrome browser") public void openChrome() { driver=new
	 * ChromeDriver(); driver.manage().deleteAllCookies();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); }
	 * 
	 * @Given("Enter the url practice.expandtesting.comlogin") public void url() {
	 * driver.get("https://practice.expandtesting.com/login"); }
	 * 
	 * @When("User name as practice") public void username() {
	 * driver.findElement(By.id("username")).sendKeys("practice"); }
	 * 
	 * @When("password as SuperSecretPassword!") public void password() {
	 * driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!"); }
	 * 
	 * @When("user clicks on the login button") public void
	 * user_clicks_on_the_login_button() {
	 * driver.findElement(By.xpath("//*[text()='Login']")).click(); }
	 * 
	 * @Then("user will be navigate to logout page") public void
	 * user_will_be_navigate_to_logout_page() {
	 * driver.findElement(By.xpath(" //i[text()=' Logout']")).click();
	 * 
	 * }
	 * 
	 * @Then("user close the browser") public void user_close_the_browser() {
	 * driver.close(); }
	 * 
	 * 
	 * @Given("Enter the url practice.expandtesting.com login") public void
	 * enter_the_url_https_practice_expandtesting_com_login() {
	 * driver.get("https://practice.expandtesting.com/login"); }
	 * 
	 * @When("User name as practice1") public void user_name_as_practice1() {
	 * driver.findElement(By.id("username")).sendKeys("practice1");
	 * 
	 * }
	 * 
	 * @When("password as SuperSecretPassword12!") public void
	 * password_as_super_secret_password12() {
	 * driver.findElement(By.id("password")).sendKeys("SuperSecretPassword12!"); }
	 * 
	 * @When("User name as practice11") public void user_name_as_practice11() {
	 * driver.findElement(By.id("username")).sendKeys("practice11");
	 * 
	 * 
	 * }
	 */
	WebDriver driver;

	@Given("the user opens the Chrome browser")
	public void the_user_opens_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@Given("navigates to the URL {string}")
	public void navigates_to_the_url(String url) {
		driver.get(url);
	}

	@When("the user enters username {string}")
	public void the_user_enters_username(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@When("the user enters password {string}")
	public void the_user_enters_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("the user should be redirected to the logout page")
	public void the_user_should_be_redirected_to_the_logout_page() {
		driver.findElement(By.xpath(" //i[text()=' Logout']")).click();
	}

	@Then("the user closes the browser")
	public void the_user_closes_the_browser() {
		driver.quit();
	}
}
