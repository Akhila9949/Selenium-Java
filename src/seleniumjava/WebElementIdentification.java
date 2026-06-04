package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement UserName=driver.findElement(By.id("user-name"));
		UserName.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.name("password"));
		Password .sendKeys("secret_sauce");
		WebElement btn_clk=driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]"));
		btn_clk.click();
		driver.quit();
		
		
	
	}

}
