package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "geckodriver");
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//				WebDriver driver = new FirefoxDriver();
				WebDriver driver = new ChromeDriver();
				
//				getting driver handle 
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				
//				managing window size 
				driver.manage().window().maximize();
//				implicit wait
				driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
				
				List<WebElement> trows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
				System.out.println(trows.size());
				List<WebElement> tcol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
				System.out.println(tcol.size());
				
//				List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
//				List <String> dta = new ArrayList<>();
//				for(WebElement ele : data) {
//					dta.add(ele.getText());
//					System.out.println(ele.getText());
//				}
//				
//				WebElement dt = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
//		        System.out.println(dt.getText());
		        
		        for(int i=2;i<=trows.size();i++) {
		            
		            WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
		            System.out.println(data1.getText());
		        }
		        
		        WebElement elem = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));
		        
		        
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView();", elem);

				
				
	}

}
