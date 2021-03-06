package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://en-gb.facebook.com/");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//		getting element by different locator
		
//		WebElement UserName = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
//		if(UserName.isDisplayed()) {
//			System.out.println("Yes");
//		}

		
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
//		System.out.println(UserName.getAttribute("placeholder"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("MyPass@123");
		
		WebElement loginlink = driver.findElement(By.xpath("//button[@name='login']"));
		loginlink.click();
		
		

	}

}
