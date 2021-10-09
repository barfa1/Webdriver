package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://en-gb.facebook.com/");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement createAcc = driver.findElement(By.xpath("//a[text() ='Create New Account']"));
		createAcc.click();
		
		WebElement FirstName = driver.findElement(By.cssSelector("input[name=firstname]"));
        FirstName.sendKeys("John");
//		WebElement fname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
//		fname.sendKeys("Shubham");
		
		
		
		WebElement selectDay = driver.findElement(By.cssSelector("select#day>option:nth-of-type()"));
		
		Select bdaydate = new Select(selectDay);
		
		bdaydate.selectByVisibleText("19");
		
		WebElement selectMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select bdaymonth = new Select(selectMonth);
		
		bdaymonth.selectByIndex(10);
		
		WebElement selectYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select bdayyear = new Select(selectYear);
		
		bdayyear.selectByValue("2021");
		WebElement Female = driver.findElement(By.xpath("//input[@type ='radio' and @value='1']"));
		Female.click();
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
//		for(WebElement ele : Months) {
//			System.out.println(ele.getText());
//		}
		for(int i = 0; i < Months.size();i++) {
			
			WebElement ele = driver.findElement(By.xpath("//select[@id='month']/option["+ i +"]"));
			System.out.println(ele.getText());
		}

	}

}
