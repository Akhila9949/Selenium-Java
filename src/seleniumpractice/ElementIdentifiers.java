package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIdentifiers {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement TextField =driver.findElement(By.xpath("//input[@id=\"searchInput\"]"));
		TextField.sendKeys("Selenium");
		WebElement Btn_clk=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		Btn_clk.click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
