package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException {
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
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
//		System.out.println(UserName.getAttribute("placeholder"));
		UserName.sendKeys("abc@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys("MyPass@123");
		
		WebElement loginlink = driver.findElement(By.xpath("//button[@name='login']"));
		TakesScreenshot ss = (TakesScreenshot) driver;
		File image = ss.getScreenshotAs(OutputType.FILE);
		
		loginlink.click();
		
		FileUtils.copyFile(image, new File("C:\\Users\\svarfa\\Downloads\\screenshot222.png"));

	}

}
