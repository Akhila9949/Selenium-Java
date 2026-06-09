package seleniumjava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class TableDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		System.out.println("*****reading data from table**********");
		List<WebElement> headers=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement header:headers)
		{
			System.out.print(header.getText()+"|");
		}
		System.out.println();
		List <WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		for(int i=1;i<rows.size();i++)
			
			{
				List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
				for(WebElement col:cols)
				{
					System.out.print(col.getText()+"|");
				}
				System.out.println();
				
			}
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\Akhila\\Pictures\\Screenshots\\08062026.png");
		FileUtils.copyFile(screenshotFile, destinationFile);

		System.out.println("Screenshot is successfull");

				driver.quit();

	}

}
