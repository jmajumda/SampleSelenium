package testngg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jit majumdar\\Desktop\\WebDriver\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> frame=driver.findElements(By.tagName("frame"));
		
		for(int i=0; i<frame.size(); i++){
			System.out.println(frame.get(i).getAttribute("name"));
		}
		

	}

}
