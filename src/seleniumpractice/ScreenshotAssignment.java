package seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotAssignment {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.frontlinesedutech.com/");
		driver.manage().window().maximize();
		System.out.println("Title of the page"+driver.getTitle());
		File flmScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File fScreenshot=new File("C:\\Users\\Akhila\\Pictures\\Screenshots\\flmScreenshot.png");
		FileUtils.copyFile(flmScreenshot, fScreenshot);
		System.out.println(" FLM Sign in Page Screenshot is taken");
		WebElement loginbtn=driver.findElement(By.xpath("//a[text()='Login']"));
		loginbtn.click();
		Thread.sleep(5000);
		File signinPage=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File siginPagescreenshot=new File("C:\\Users\\Akhila\\Pictures\\Screenshots\\flmSign.png");
		FileUtils.copyFile(signinPage, siginPagescreenshot);
		System.out.println("Screenshot is taken for Signin Page");
		driver.quit();

	}

}
