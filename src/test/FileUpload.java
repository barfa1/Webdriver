package test;

import java.util.concurrent.TimeUnit;



import java.awt.*;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
//		getting driver handle 
		driver.get("https://www.monsterindia.com/seeker/registration");
		
//		managing window size 
		driver.manage().window().maximize();
//		implicit wait
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement file = driver.findElement(By.xpath("//input[@type = 'file']"));
//		file.sendKeys("C:\\Users\\svarfa\\Documents\\S.txt");
//		WebElement file = driver.findElement(By.xpath("//*[@class='upload-file']"));
        file.click();
  
        // creating object of Robot class
        Robot rb = new Robot();
     
        // copying File path to Clipboard
        StringSelection str = new StringSelection("C:\\Users\\svarfa\\Documents\\S.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     
         // press Contol+V for pasting
         rb.keyPress(MenuKeyEvent.VK_CONTROL);
         rb.keyPress(MenuKeyEvent.VK_V);
     
        // release Contol+V for pasting
        rb.keyRelease(MenuKeyEvent.VK_CONTROL);
        rb.keyRelease(MenuKeyEvent.VK_V);
     
        // for pressing and releasing Enter
        rb.keyPress(MenuKeyEvent.VK_ENTER);
        rb.keyRelease(MenuKeyEvent.VK_ENTER);
        
		
		


	}

}
