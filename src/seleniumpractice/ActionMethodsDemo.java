package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethodsDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement inputTextBox=driver.findElement(By.className("cdx-text-input__input"));
		inputTextBox.sendKeys("Selenium");
		
		
		
	}

}
