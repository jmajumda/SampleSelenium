package testngg;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookPage {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\jit majumdar\\Desktop\\WD\\Work\\Frameworks\\src\\testngg\\config.properties");
		prop.load(ip);
		
		String Browser=prop.getProperty("browser");
		
		if (Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jit majumdar\\Desktop\\WD\\jars\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}else if(Browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jit majumdar\\Desktop\\WD\\jars\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}else if(Browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\jit majumdar\\Desktop\\WD\\jars\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("email_Xpath"))).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath(prop.getProperty("password_Xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("FirstName_Xpath"))).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.xpath(prop.getProperty("SurName_Xpath"))).sendKeys(prop.getProperty("SurName"));
		driver.findElement(By.xpath(prop.getProperty("mobile_Xpath"))).sendKeys(prop.getProperty("mobile"));
		
		Select s=new Select(driver.findElement(By.xpath(prop.getProperty("day_Xpath"))));
		s.selectByValue(prop.getProperty("day"));
		Select s1=new Select(driver.findElement(By.xpath(prop.getProperty("month_Xpath"))));
		s1.selectByVisibleText(prop.getProperty("month"));
		Select s2=new Select(driver.findElement(By.xpath(prop.getProperty("year_Xpath"))));
		s2.selectByValue(prop.getProperty("year"));
		
		
		
		
		


	}

}
