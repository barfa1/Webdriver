package test;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement terms = driver.findElement(By.linkText("Terms of Use"));
		
		String keytosend = Keys.chord(Keys.CONTROL,Keys.ENTER);
		terms.sendKeys(keytosend);
//		Set <String> allwindows = driver.getWindowHandles();
//		for(String singlewindow: allwindows) {
//			System.out.println(singlewindow);
//		}
//		
//		driver.switchTo().window(((WebDriver) allwindows).get(1));
		ArrayList<String> allWindows = new ArrayList<String> (driver.getWindowHandles());
        
        for(String window: allWindows) {
            
            System.out.println(window);
            
        }
        
        driver.switchTo().window(allWindows.get(1));
        
        WebElement element = driver.findElement(By.tagName("h1"));
        
        System.out.println(element.getText());
        driver.close();


		
		

	}

}
