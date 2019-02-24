package testngg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.asserts.SoftAssert;

public class Facebook {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.id("email")).sendKeys("Jit");
	  SoftAssert s=new SoftAssert();
	  boolean a=driver.findElement(By.id("pass")).isDisplayed();
	  s.assertEquals(true, a);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\jit majumdar\\Desktop\\WD\\jars\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://facebook.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
