package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	WebDriver w ;
	
	@Given("I should be in the login page of Facebook")
	public void i_should_be_in_the_login_page_of_facebook() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C://selenium//selenium-java-4.1.2//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
		w.navigate().to("https://www.facebook.com/");
	    
	}
	@When("Enter Email")
	public void enter_email() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@id='email']")).sendKeys("tanupatil777@gmail.com");
	}
	@When("Enter Password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@id='pass']")).sendKeys("tanvipatil123456");
	}
	@When("Click on Login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Login Done")
	public void login_done() {
	    // Write code here that turns the phrase above into concrete actions
		w.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
	}

}
