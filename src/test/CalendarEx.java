package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://jqueryui.com/datepicker/");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		//input[@id='datepicker']
		driver.switchTo().frame(0);
//		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
//		date.click();
//		date.sendKeys("10/1/2021");
//		WebElement previ = driver.findElement(By.xpath("//a[@title='Prev']"));
//		previ.click();
//		
//		WebElement dte = driver.findElement(By.xpath("//a[@data-date='2']"));
//		dte.click();
		WebElement date = driver.findElement(By.id("datepicker"));
        
        date.click();
        WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
        WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
        
        String sMonth = month.getText();
        
        while(!sMonth.equals("September")) {
            
            arrow.click();
            arrow = driver.findElement(By.xpath("//a[@title='Next']"));
            month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            sMonth = month.getText();
        }
        
        WebElement day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='15']"));
        day.click();
		
		
		
		

	}

}
