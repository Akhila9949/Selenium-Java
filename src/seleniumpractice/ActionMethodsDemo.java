package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement inputTextBox=driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
		inputTextBox.sendKeys("Selenium");
		WebElement SearchButton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		SearchButton.click();
		Thread.sleep(3000);
		driver.quit();
				
		
		
	}

}
