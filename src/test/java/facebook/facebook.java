package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		driver.manage().window().maximize();
	}

}
