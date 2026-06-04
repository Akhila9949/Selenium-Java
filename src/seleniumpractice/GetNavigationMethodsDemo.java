package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigationMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.out.println("*****First Website*****");
		driver.get("https://www.frontlinesedutech.com/");
		driver.manage().window().maximize();
		System.out.println("Title of 1st Website: "+ driver.getTitle());
		System.out.println("URL of 1st Website: "+driver.getCurrentUrl());
		System.out.println("*****Second Website*****");
		driver.get("https://www.geeksforgeeks.org/");
		System.out.println("Title of 2nd Website: "+driver.getTitle());
		System.out.println("URL of 2nd Website :"+driver.getCurrentUrl());
		System.out.println("*****Third Website*****");
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("Title of 3rd Website: "+driver.getTitle());
		System.out.println("URL of 3rd Website: "+driver.getCurrentUrl());
		System.out.println("****Fourth Website*****");
		driver.navigate().to("https://www.hotstar.com/in/home");
		System.out.println("Title of 4th Website: "+driver.getTitle());
		System.out.println("URL of 4th Website: "+ driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().refresh();
		System.out.println("*****Fifth Website*****");
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
		System.out.println("Title of 5th Website: "+driver.getTitle());
		System.out.println("URL of 5th Website: "+driver.getCurrentUrl());
		driver.getPageSource();
		driver.navigate().refresh();
		driver.quit();
	}

}
