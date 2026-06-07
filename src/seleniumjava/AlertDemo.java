package seleniumjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			//Alert simpleAlert=driver.switchTo().alert();
			//System.out.println("Text in the Alert is :"+simpleAlert.getText());
			//simpleAlert.accept();
			//driver.close();
			//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			//Alert simpleAlert=driver.switchTo().alert();
			//System.out.println("Text in the alert is:"+simpleAlert.getText());
			//simpleAlert.dismiss();
			//simpleAlert.accept();
			//System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			Alert simpleAlert=driver.switchTo().alert();
			simpleAlert.sendKeys("Abhiram");
			System.out.println(simpleAlert.getText());
			simpleAlert.accept();
			System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
			
	}

}
