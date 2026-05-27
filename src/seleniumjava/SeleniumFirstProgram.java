package seleniumjava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.frontlinesedutech.com/s/store");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.netflix.com/title/82710848?g=5a157eda-be53-419a-a074-01eb6c58dc5c&lkid=URL_TITLE&lnktrk=EVO&trkid=13710079&MSG_TITLE=82710848");
		
	}

}
