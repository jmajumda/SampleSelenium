package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	public WebDriver driver;
	
	@Given("^user is on login page$")
	public void login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jit majumdar\\Desktop\\WebD\\jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[text()='Log In']")).click();
		
	}
	
	@When("^title of the page is cogmento CRM$")
	public void title_of_the_page_is_cogmento_CRM(){
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		   
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		
		driver.findElement(By.name("email")).sendKeys("jit2014majumdar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9620160862@Aj");
				
	}
	
	@Then("^user click on login button$")
	public void user_click_on_login_button(){
		driver.findElement(By.xpath("//*[text()='Login']")).click();
	}

	@Then("^user will move to home page$")
	public void user_will_move_to_home_page(){

		String home_title=driver.getTitle();
		Assert.assertEquals(home_title, "Cogmento CRM");
	}

}
