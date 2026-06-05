package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement Rdbtn1=driver.findElement(By.xpath("//input[@value=\"Option 1\"]"));
		WebElement Rdbtn2=driver.findElement(By.xpath("//input[@value=\"Option 2\"]"));
		WebElement Rdbtn3=driver.findElement(By.xpath("//input[@value=\"Option 3\"]"));
		Rdbtn1.click();
		System.out.println("radiobutton1 status"+Rdbtn1.isSelected());
		System.out.println("radiobutton2 status"+Rdbtn2.isSelected());
		System.out.println("radiobutton3 status"+Rdbtn3.isSelected());
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value=\"checkbox1\"]"));
		WebElement checkbox2=driver.findElement(By.xpath("//input[@value=\"checkbox2\"]"));
		WebElement checkbox3=driver.findElement(By.xpath("//input[@value=\"checkbox3\"]"));
		checkbox1.click();
		checkbox2.click();
		System.out.println("Checkbox1 after selection"+ checkbox1.isSelected());
		System.out.println("Checkbox2 after selection" + checkbox2.isSelected());
		System.out.println("Checkbox3 after selection"+ checkbox3.isSelected());
		if(checkbox1.isSelected())
		{
			checkbox1.click();
		}
		System.out.println("After Deselected"+checkbox1.isSelected());
		System.out.println("After Deselected"+checkbox2.isSelected());
		
		driver.quit();
	}

}
