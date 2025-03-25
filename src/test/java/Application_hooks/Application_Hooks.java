package Application_hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Application_Hooks {
	WebDriver driver;
	
	@Before(order=1)
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@After
	public void teardown() {
		driver.close();
	}
	
	@BeforeStep
	public void bfstep() {
		
	}
	

}
