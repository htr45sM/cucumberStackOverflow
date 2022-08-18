package cucumberframework.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStep {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		this.driver = new FirefoxDriver();
		
	}
	
	@Given("^User navigates to the Stackoverflow website$")
	public void user_navigates_to_the_Stackoverflow_website()  {
		// Write code here that turns the phrase above into concrete actions

		this.driver.get("http://stackoverflow.com");
	}

	@Given("^User click on Login button$")
	public void user_click_on_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		this.driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[3]/a")).click();
		System.out.println("User click on Login button");

	}

	@Given("^User enters valid username$")
	public void user_enters_valid_username()  {
		// Write code here that turns the phrase above into concrete actions
		this.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("webdriveruniversity2@mail.com");
		
	}

	@Given("^User enters valid password$")
	public void user_enters_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		
		
		this.driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Yellow321!");
		System.out.println("User enters valid password");
	}

	@When("^User clicks on Submit$")
	public void user_clicks_on_Submit()  {
		
		this.driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	}

	@Then("^User is taken to home page successfully$")
	public void user_is_taken_to_home_page_successfully()  {
		
		WebElement askQuestionButton = 	this.driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[1]/div/a"));
		assertEquals(true, askQuestionButton.isDisplayed());       				
		
	}

	
	//////////////////////////
	
	
     
	@Given("User navigates to the Stackoverflow website2")
	public void user_navigates_to_the_stackoverflow_website2() {
           System.out.println("Hello ");
	}
	@Given("User click on Login button2")
	public void user_click_on_login_button2() {
		 System.out.println("Hello ");
	}
	@Given("User enters valid username2")
	public void user_enters_valid_username2() {
		 System.out.println("Hello ");
	}
	@Given("User enters valid password2")
	public void user_enters_valid_password2() {
		 System.out.println("Hello ");
	}
	@When("User clicks on Submit2")
	public void user_clicks_on_submit2() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Hello ");
	}
	@Then("User is taken to home page successfully2")
	public void user_is_taken_to_home_page_successfully2() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Hello ");
	}




}
