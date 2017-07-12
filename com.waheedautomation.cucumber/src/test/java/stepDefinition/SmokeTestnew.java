package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SmokeTestnew {
	
	WebDriver driver;

	@Given("^Open IE and start application$")
	public void Open_IE_and_start_application() throws Throwable {
		
		// Create object of DesiredCapabilities class
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		// Set ACCEPT_SSL_CERTS  variable to true
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.ie.driver", "C:\\Users\\waheed.ahmed\\Downloads\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
		//Just to fail the test step to get UNSTABLE Build and test email notification
		Assert.assertEquals("waheedahmed55@gmail.com", driver.findElement(By.id("email")).getAttribute("value"));
	
	}

	@Then("^user should be able to login successfully.$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	   driver.quit();
	}


}
