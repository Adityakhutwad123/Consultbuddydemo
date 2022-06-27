package testngdemo;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSTED {
	
	
	WebDriver d;
	@BeforeTest
	public void Login() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\adityak\\\\Downloads\\\\chromedriver_win32 (1)2\\\\chromedriver.exe\\\\");
		 d=new ChromeDriver();
		d.get("http://demo.consultbuddy.com/login");
	}
	
	
		@Test
	public void counsult() throws InterruptedException {
			
			
			
			//Enter user name and password
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("admin@gmail.com");
			d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Admin@123");
			//Enter captcha 
			String s=JOptionPane.showInputDialog("enter our captcha");
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(s);
			//Click on Login 
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/app-root/app-web/div/app-login/div/div/div[2]/div/form/div[5]/div[2]/button")).click();
            // Click On Tender 
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/h2/button/div")).click();
			//Click on Tenders 
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/app-sidebar/nav/div/div/div[4]/div/div/div/div/a[1]")).click();
			//Click on Add Tender
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tenders/div/div[2]/a/span[1]/mat-icon")).click();
			//Select Govt.Body 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
			Thread.sleep(2000);
			//Select Ministry 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
			Thread.sleep(4000);
			//Select Zone/Region 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(4000);
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
			Thread.sleep(4000);
			//Select District /Division
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(4000);
			d.findElement(By.xpath("//span[@class=\"mat-option-text\"]")).click();
			//Select Category
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
			Thread.sleep(2000);
			//Select Expertise Area 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[1]/div[7]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
			Thread.sleep(1000);
			d.findElement(By.xpath("//span[@class=\"mat-option-text\"]")).click();
			//Enter Tender Id
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("T-04");
			//Enter Tender Ammount 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("1000000");
			//Enter Booklet Price
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).click();
			//Enter Tender Name 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[3]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Electrical12");
			//Select Closing Date 
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).click();
			Thread.sleep(1000);
			//Select Next Month
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[3]")).click();
			Thread.sleep(1000);
			//Select Date 
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[2]/div[1]")).click();
			//Enter Description
			d.findElement(By.xpath("//textarea[@id=\"mat-input-11\"]")).sendKeys("this Tender Related To The Space");
			//Scroll BarDown
			JavascriptExecutor js1=(JavascriptExecutor) d;
			js1.executeScript("window.scrollBy(0,213)");
			//Enter Location
			d.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("GV24+R6M, Saras Baug Rd, Dadawadi, Shukrawar Peth, Pune, Maharashtra 411002");
			Thread.sleep(3000);
			//Enter Longitude And Lattitude
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("18.5020566");
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("73.8527081");
			//Enter officer Name
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("A.K.Patil");
			//Enter Designation 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("D.Y.S.P");
			//Enter Contact No
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9865642456");
			//Upload RFP
			Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]")).click();
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("https://demo.consultbuddy.com/consultant-appointments");
			//Select Img
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[5]/div[2]/div[2]/button[1]/img")).click();
			Thread.sleep(2000);
			//Select Questiories 
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[2]/div[2]/div/div[6]/div[2]/div[2]/button[1]/img")).click();
			//Click On Add Tender 
			Thread.sleep(15000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-add-tenders/mat-card/div/form/div/div[3]/div/button[2]/span[1]")).click();
			//Click on Confir mation Ok
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"success-modal\"]/div[2]/div[2]/div/button")).click();
			//Published Tender By Admin
			Thread.sleep(2000);
			d.findElement(By.xpath("/html/body/app-root/partial-admin-layout/div/div/div/div/app-tenders/mat-card/div/div[2]/mat-table/mat-row[1]/mat-cell[7]/mat-icon/mat-slide-toggle/label/div")).click();
			Thread.sleep(1000);
			d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-confirmation-modal/div/div/div/div/div[2]/div[2]/div/button[2]")).click();
			Thread.sleep(1000);
	
	                       }
	
			
			
		                  
		@AfterTest
		public void end(){
			d.close();
		                  }
	

}
