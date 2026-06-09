package seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableScreenshotAssignment {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		System.out.println("Title of the page:"+driver.getTitle());
		List<WebElement> tableheaders=driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for(WebElement tableheader: tableheaders)
		{
			System.out.print(tableheader.getText()+"|");
		}
		System.out.println();
		List<WebElement> tablerows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for(int i=1;i<tablerows.size();i++)
		{
			List<WebElement> tablecols=(tablerows.get(i)).findElements(By.tagName("td"));
			for(WebElement tablecol:tablecols)
			{
				System.out.print(tablecol.getText()+"|");
			}
			System.out.println();
		}
		
		File takeScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File fileLocation=new File("C:\\Users\\Akhila\\Pictures\\Screenshots\\09062026.png");
		FileUtils.copyFile(takeScreenshot, fileLocation);
		System.out.println("Screenshot is taken");
		
		driver.quit();
	}

}
