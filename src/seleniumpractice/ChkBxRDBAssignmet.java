package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChkBxRDBAssignmet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement radibtn=driver.findElement(By.xpath("//input[@value='Option 2']"));
		radibtn.click();
		System.out.println("Checking all the checkboxes.......");
		WebElement chkbx1=driver.findElement(By.xpath("//input[@value='checkbox1']"));
		WebElement chkbx2=driver.findElement(By.xpath("//input[@value='checkbox2']"));
		WebElement chkbx3=driver.findElement(By.xpath("//input[@value='checkbox3']"));
		chkbx1.click();
		chkbx2.click();
		chkbx3.click();
		if((chkbx1.isSelected()) && (chkbx2.isSelected()) && (chkbx3.isSelected()))
		{
			chkbx1.click();
			chkbx2.click();
			chkbx3.click();
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
