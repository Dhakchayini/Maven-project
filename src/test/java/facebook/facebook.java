package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("a.n.swathyraj@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Reset Password']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Mahamitu@14");
		driver.findElement(By.xpath("//span[text()='Reset Password']")).click();
		driver.getWindowHandle();
		
		
	}

}
