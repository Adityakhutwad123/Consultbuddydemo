package testngdemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Advance_Search {
	WebDriver w;
	@BeforeTest
	public void BeforAdvance_Search() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\adityak\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe\\");
		  w=new ChromeDriver();
		 w.manage().window().maximize();
		 w.get("http://demo.consultbuddy.com/home");
		 String FW=w.getWindowHandle();
		String a=w.getTitle();
		System.out.println("windo is"+a);
		//w.switchTo().newWindow(WindowType.TAB);
		//Click on Advance Search
				w.findElement(By.xpath("/html/body/app-root/app-web/div/app-home/div[2]/div[1]/div/div/form/div/div[2]/button/span[1]")).click();
			/*Set<String> s=w.getWindowHandles();
			for( String i:s) {
				if(!i.equals(FW)) {
					
					w.switchTo().window(i);
				System.out.println("Second Window Is" +w.getTitle());*/
				w.getWindowHandles();
				//Click On Government Body
				w.findElement(By.xpath("/html/body/app-root/app-web/div/app-tender-filters/mat-card/div/div/div[1]/div/div/form/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(2000);
				w.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
				//Click On 
				
				//}
				//}
	}
	@Test
	public void AdvanceSearch() throws InterruptedException {
		
		
		
		
	}
		
		
		
	
		
	}


