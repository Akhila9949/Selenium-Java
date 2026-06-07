package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MasterElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.get("https://trytestingthis.netlify.app/");
			driver.manage().window().maximize();
			WebElement Dropdown=driver.findElement(By.id("option"));
			Select selectoption=new Select(Dropdown);
			//selectoption.selectByVisibleText("Option 1");
			//selectoption.selectByContainsVisibleText("1");
			//selectoption.selectByValue("option 1");
			selectoption.selectByIndex(2);
			
		}
		catch(Exception e){
			System.out.println("Exception ....");
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
		

	}

}
