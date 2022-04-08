package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver w ;
	
	@Given("I should be in the login page of orangeHRM")
	public void i_should_be_in_the_login_page_of_orange_hrm() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "C://selenium//selenium-java-4.1.2//chromedriver.exe");
		w = new ChromeDriver();
		w.navigate().to("https://opensource-demo.orangehrmlive.com");
	   
	}
	@When("Enter name")
	public void enter_name() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	   
	}
	@When("Enter password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	    
	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@id='btnLogin']")).click();
	    
	}
	@Then("Login successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
		
	    
	}




}
