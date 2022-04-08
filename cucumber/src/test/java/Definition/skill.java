package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class skill {
	WebDriver wb ;

	@Given("I should open the browser skillary")
	public void i_should_open_the_browser_skillary() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		 wb = new ChromeDriver();
		 wb.navigate().to("https://demoapp.skillrary.com");
		wb.findElement(By.xpath("//*[@href='login.php?type=login']")).click();
	    
	}
	@When("Enter name {string}")
	public void enter_name(String user) {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.xpath("//*[@id='email']")).sendKeys(user);
	}
	@When("Enter password {string}")
	public void enter_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	}
	@When("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.xpath("//*[@id='last']")).click();
	}
	
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String name) {
	    // Write code here that turns the phrase above into concrete actions
		
		 
		 
		 if(name == "Harry Den")
		 {
			 WebElement username = wb.findElement(By.xpath("//span[contains(text(),'Harry Den')]"));
			 Assert.assertEquals(username.getText(), name);
		 }else if(name == "SkillRary Admin")
		 {
			 WebElement admin = wb.findElement(By.xpath("//*[@class='pull-left info']/p"));
			 Assert.assertEquals(admin.getText(), name);
		 }
		
	}
//		@Then("I should see the username {string}")
//		public void i_should_see_the_username(String string) {
//		    // Write code here that turns the phrase above into concrete actions
//			 WebElement admin = wb.findElement(By.xpath("//*[@class='pull-left info']/p"));
//				Assert.assertEquals(admin.getText(), string);
//				wb.close();
//		}
	
		@Then("I should navigate to the page {string}")
		public void i_should_navigate_to_the_page(String string) {
		    // Write code here that turns the phrase above into concrete actions
		   WebElement we = wb.findElement(By.id("registerClick"));
		   Assert.assertEquals(we.getText(), string);
		   wb.close();
		   
		}
}
