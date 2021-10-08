package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://www.simplilearn.com/");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
//		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
//		getting element by different locator
		
//		Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,15);
		WebElement loginlink = driver.findElement(By.linkText("Log in"));

		wait.until(ExpectedConditions.visibilityOf(loginlink));
		
//		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		
		loginlink.click();
		
		WebElement username = driver.findElement(By.name("user_login"));
		
//		typing into username field 
		username.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Abcd@1234");
		
		WebElement rem = driver.findElement(By.className("rememberMe"));
		rem.click();
//		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.name("btn_login"));
		login.click();
		
		WebElement msg = driver.findElement(By.id("msg_box"));
		String msg1 = msg.getText();
		String checkMessage = "The email or password you have entered is invalid.";
		
		if(msg1.equals(checkMessage)) 
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are "+ links.size());
		for(WebElement data : links) {
			System.out.println(data.getAttribute("href"));
//			System.out.println(data);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
//		Thread.sleep(2000);
//		WebElement forgot = driver.findElement(By.partialLinkText("Forgot "));
//		forgot.click();
//		Thread.sleep(2000);
//		
//		
//		
		
		driver.close();
		driver.quit();


	}

}
