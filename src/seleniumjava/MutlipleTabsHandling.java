package seleniumjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipleTabsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.out.println("********Opening First Tab***********");
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		String firstPageHandle=driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		System.out.println("********Opening Second Tab***********");
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(firstPageHandle);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
