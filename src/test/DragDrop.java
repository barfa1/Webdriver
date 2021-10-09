package test;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.get("https://www.w3schools.com/");
		
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement from = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(from, to).build().perform();
		act.sendKeys(Keys.PAGE_DOWN);
		
		

	}

}
