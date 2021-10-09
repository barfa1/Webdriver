package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://demoqa.com/alerts");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
//		WebElement btn = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement btn = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		btn.click();
		
//		WebElement ele = driver.findElement(By.partialLinkText("")));
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Shubham Varfa ");
		Thread.sleep(3000);
		alert.accept();
		
		
		
		

	}

}
