package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlingAssignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Abhiram");
		driver.findElement(By.id("lname")).sendKeys("Karri");
		driver.findElement(By.id("male")).click();
		WebElement dropdown=driver.findElement(By.id("option"));
		Select selectvalue=new Select(dropdown);
		selectvalue.selectByValue("option 1");
		WebElement dropdown1=driver.findElement(By.id("owc"));
		Select selectvalue1=new Select(dropdown1);
		selectvalue1.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='option1']")).click();
		driver.findElement(By.xpath("//input[@name='option3']")).click();
		driver.findElement(By.xpath("//input[@list='datalists']")).sendKeys("Chocolate");
		driver.findElement(By.xpath("//button[text()=' Your Sample Alert Button!']")).click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.quit();

	}

}
