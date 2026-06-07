package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsAssignment {



			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				System.out.println("*****First Website*****");
				driver.get("https://www.frontlinesedutech.com/");
				driver.manage().window().maximize();
				System.out.println("Title of 1st Website: "+ driver.getTitle());
				System.out.println("URL of 1st Website: "+driver.getCurrentUrl());
				String firstPageHandle=driver.getWindowHandle();
				System.out.println("*****Second Website*****");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://www.geeksforgeeks.org/");
				System.out.println("Title of 2nd Website: "+driver.getTitle());
				System.out.println("URL of 2nd Website :"+driver.getCurrentUrl());
				String secondPageHandle=driver.getWindowHandle();
				System.out.println("*****Third Website*****");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.get("https://demowebshop.tricentis.com/");
				System.out.println("Title of 3rd Website: "+driver.getTitle());
				System.out.println("URL of 3rd Website: "+driver.getCurrentUrl());
				//String thirdPageHandle=driver.getWindowHandle();
				System.out.println("****Fourth Website*****");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.navigate().to("https://www.hotstar.com/in/home");
				System.out.println("Title of 4th Website: "+driver.getTitle());
				System.out.println("URL of 4th Website: "+ driver.getCurrentUrl());
				//String fourthPageHandle=driver.getWindowHandle();
				System.out.println("*****Fifth Website*****");
				driver.switchTo().newWindow(WindowType.TAB);
				driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
				System.out.println("Title of 5th Website: "+driver.getTitle());
				System.out.println("URL of 5th Website: "+driver.getCurrentUrl());
				String fifthPageHandle=driver.getWindowHandle();
				System.out.println("Closing 2nd tab..."+driver.switchTo().window(secondPageHandle)); 
				Thread.sleep(3000);
				driver.close();
				System.out.println("Closing 1st tab..."+driver.switchTo().window(firstPageHandle)); 
				Thread.sleep(3000);
				driver.close();
				System.out.println("Closing 5th tab..."+driver.switchTo().window(fifthPageHandle));
				Thread.sleep(3000);
				driver.close();
				driver.quit();
			

	}

}
