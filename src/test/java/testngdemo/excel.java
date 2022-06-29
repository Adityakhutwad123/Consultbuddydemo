package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class excel {
	File f;
	FileInputStream fis;
	XSSFWorkbook w;
	XSSFSheet s;
	XSSFRow r;
	XSSFCell c;
	int ro,co;
	WebDriver d;
	 @BeforeMethod
	  public void beforeMethod() throws Exception {
		  f= new File("C:\\Users\\adityak\\Desktop//Book1.xlsx");
		  fis= new FileInputStream(f);
		  w= new XSSFWorkbook(fis);
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adityak\\Downloads\\chromedriver_win32 (1)2\\chromedriver.exe\\");
		 d=new ChromeDriver();
		 d.manage().window().maximize();
		 d.get("http://demo.consultbuddy.com/consultant-registration");
		 
	  }
  @Test
  public void f() throws Exception {
	  //s=w.getSheetAt(0);
	  s=w.getSheet("sheet1");
	  for(ro=0;ro<4;ro++) 
	  { 
		 if(ro==0) {
		  r=s.getRow(ro); 
	  for(co=0;co<4;co++) 		
	  { 			
		  c=r.getCell(co); 
		if(co==0) {
		  String name1=c.getStringCellValue();
	  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1);
	  Thread.sleep(2000);
	  //d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).clear();
		}
		else {}
		if(co==1) {
			String name2=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
			  Thread.sleep(2000);
			//d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).clear();
		}
		else {}
		if(co==2) {
			String name3=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name3);
			  Thread.sleep(2000);
			 // d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).clear();

		}
		
	  }
	  //Enter Mobile No
	  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9771642672");
	  //Enter Email id 
	  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Viratkhohli18@gmail.com");
	  //Click On Calender
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		    //Click On Year Range
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
		 //Click  On Year
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[2]/div[1]")).click();
		 //Click On month 
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
		 //Click On Date
		 Thread.sleep(4000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
		 //Enter Aadhar No
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("972121285416");
		 //Enter Address
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("flat No.-102 Bandra Mumbai 123456");
		 //Click On State
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		 //Select State
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[22]/span")).click();
		 //Enter City Name
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Mumbai");
		 //Enter Landmark
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Near Salman Khan's Home");
		 //Enter Pincode
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("123456");
		 //Click On Next
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[2]/button[2]/span[1]")).click();
		 //Click On Type Of Retirment
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
		 //Click On Date Of Joinig
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		 //click on year 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
		 //Select year
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[4]/div[1]")).click();
		 //Select month
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
		 //Select Date
		 Thread.sleep(3000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
		 //Select  Date of Retirement
		 Thread.sleep(2000);
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		 //click on  Year
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
		 //Select Year 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[2]/div[1]")).click();
		 //Select Month
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
		 //Select Date 
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
		 //Upload Retirement Document
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[2]/div/div/div[2]/div/div/button[1]/img")).click();
		 //Select Authority To Retired
		 Thread.sleep(10000);
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
		 //Select ministry /PSU
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		 Thread.sleep(1000);
		 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
		 //Designation At The Time Of Retirement
		 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President Of BCCI");
		 //Scroll Window Down
		 Thread.sleep(2000);
		 String s;
		JavascriptExecutor j=(JavascriptExecutor) d;
		j.executeScript(s= "window.scrollBy(0,200)");
		//Select Authority
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
		//Select Ministri /Psu
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
		//Enter Designation
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President of BCCI");
		//Select Zone
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
		//Select  District
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
		//Select  from Date 
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		
		//click on Year
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]")).click();
		//Select Year
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[3]/div[1]")).click();
		//Select Month
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
		//Selet Date 
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[3]/div[1]")).click();
		//select To Date
		Thread.sleep(7000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[7]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
		//Select Year
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
		//Select Year
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div[1]")).click();
		//Select Month
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
		//Select Date
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
		//Click on Add
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[8]/div/button[2]/span[1]")).click();
		//Scroll Down
		Thread.sleep(2000);
		//Enter Friend Name 
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rohit");
		//Enter Last name 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Sharma");
		//Enter Mobile No
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("6574546457");
		
		Thread.sleep(2000);
		//Scroll Down
		 String s1;
			JavascriptExecutor j1=(JavascriptExecutor) d;
			j1.executeScript(s1= "window.scrollBy(0,200)");
		//Select Category
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[12]/span")).click();
		//Select Expertise Area 
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
		//Clcik On Add
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[3]/button[2]/span[1]")).click();
		
		//Scroll Down
		Thread.sleep(2000);
		 String s2;
			JavascriptExecutor j2=(JavascriptExecutor) d;
			j2.executeScript(s2= "window.scrollBy(0,100)");
		 //Click On Submit
			Thread.sleep(10000);
		d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[5]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-success-modal/div/div/div/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(10000);
  }{
	  d.get("http://demo.consultbuddy.com/consultant-registration");
		  if(ro==1) {
			  r=s.getRow(ro); 
			  for(co=0;co<4;co++) 		
			  { 			
				  c=r.getCell(co); 
				if(co==0) {
				  String name1=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1);
			  Thread.sleep(2000);
			 // d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).clear();
				}
				else {}
				if(co==1) {
					String name2=c.getStringCellValue();
					  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
					  Thread.sleep(2000);
					//d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).clear();
				}
				else {}
				if(co==2) {
					String name3=c.getStringCellValue();
					  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name3);
					  Thread.sleep(2000);
					 // d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).clear();

				}
				
			  }
			  //Enter Mobile No
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9153606624");
			  //Enter Email id 
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rohitsharma12@gmail.com");
			  //Click On Calender
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
				    //Click On Year Range
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
				 //Click  On Year
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[2]/div[1]")).click();
				 //Click On month 
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
				 //Click On Date
				 Thread.sleep(4000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
				 //Enter Aadhar No
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("925415058225");
				 //Enter Address
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("flat No.-102 Bandra Mumbai 123456");
				 //Click On State
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				 //Select State
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[22]/span")).click();
				 //Enter City Name
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Mumbai");
				 //Enter Landmark
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Near Salman Khan's Home");
				 //Enter Pincode
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("123456");
				 //Click On Next
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[2]/button[2]/span[1]")).click();
				 //Click On Type Of Retirment
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")).click();
				 Thread.sleep(5000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
				 //Click On Date Of Joinig
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
				 //click on year 
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
				 //Select year
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[4]/div[1]")).click();
				 //Select month
				 Thread.sleep(3000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
				 //Select Date
				 Thread.sleep(3000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
				 //Select  Date of Retirement
				 Thread.sleep(2000);
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
				 //click on  Year
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
				 //Select Year 
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[2]/div[1]")).click();
				 //Select Month
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
				 //Select Date 
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
				 //Upload Retirement Document
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[2]/div/div/div[2]/div/div/button[1]/img")).click();
				 //Select Authority To Retired
				 Thread.sleep(10000);
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
				 //Select ministry /PSU
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				 Thread.sleep(1000);
				 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
				 //Designation At The Time Of Retirement
				 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President Of BCCI");
				 //Scroll Window Down
				 Thread.sleep(2000);
				 String s;
				JavascriptExecutor j=(JavascriptExecutor) d;
				j.executeScript(s= "window.scrollBy(0,200)");
				//Select Authority
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
				//Select Ministri /Psu
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
				//Enter Designation
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President of BCCI");
				//Select Zone
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
				//Select  District
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
				//Select  from Date 
				Thread.sleep(2000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
				
				//click on Year
				Thread.sleep(2000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]")).click();
				//Select Year
				Thread.sleep(5000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[3]/div[1]")).click();
				//Select Month
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
				//Selet Date 
				Thread.sleep(5000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[3]/div[1]")).click();
				//select To Date
				Thread.sleep(7000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[7]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
				//Select Year
				Thread.sleep(5000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
				//Select Year
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div[1]")).click();
				//Select Month
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
				//Select Date
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
				//Click on Add
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[8]/div/button[2]/span[1]")).click();
				//Scroll Down
				Thread.sleep(2000);
				//Enter Friend Name 
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rohit");
				//Enter Last name 
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Sharma");
				//Enter Mobile No
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("6574546457");
				
				Thread.sleep(2000);
				//Scroll Down
				 String s1;
					JavascriptExecutor j1=(JavascriptExecutor) d;
					j1.executeScript(s1= "window.scrollBy(0,200)");
				//Select Category
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[12]/span")).click();
				//Select Expertise Area 
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
				//Clcik On Add
				Thread.sleep(1000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[3]/button[2]/span[1]")).click();
				
				//Scroll Down
				Thread.sleep(2000);
				 String s2;
					JavascriptExecutor j2=(JavascriptExecutor) d;
					j2.executeScript(s2= "window.scrollBy(0,100)");
				 //Click On Submit
					Thread.sleep(10000);
				d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[5]/button[2]/span[1]")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-success-modal/div/div/div/div/div[2]/div[2]/div/button")).click();
				Thread.sleep(10000);
			  
		  }
		  {
			  d.get("http://demo.consultbuddy.com/consultant-registration");
			  if(ro==2) {
				  r=s.getRow(ro); 
				  for(co=0;co<4;co++) 		
				  { 			
					  c=r.getCell(co); 
					if(co==0) {
					  String name1=c.getStringCellValue();
				  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1);
				  Thread.sleep(2000);
				 // d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).clear();
					}
					else {}
					if(co==1) {
						String name2=c.getStringCellValue();
						  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
						  Thread.sleep(2000);
						//d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).clear();
					}
					else {}
					if(co==2) {
						String name3=c.getStringCellValue();
						  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name3);
						  Thread.sleep(2000);
						 // d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).clear();

					}
					
				  }
				  //Enter Mobile No
				  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("9752117654");
				  //Enter Email id 
				  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("IshanKishan@gmail.com");
				  //Click On Calender
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
					    //Click On Year Range
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
					 //Click  On Year
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[1]/td[2]/div[1]")).click();
					 //Click On month 
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
					 //Click On Date
					 Thread.sleep(4000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
					 //Enter Aadhar No
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("925211058545");
					 //Enter Address
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("flat No.-102 Bandra Mumbai 123456");
					 //Click On State
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					 //Select State
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[22]/span")).click();
					 //Enter City Name
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Mumbai");
					 //Enter Landmark
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Near Salman Khan's Home");
					 //Enter Pincode
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[3]/div[2]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("123456");
					 //Click On Next
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[2]/button[2]/span[1]")).click();
					 //Click On Type Of Retirment
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")).click();
					 Thread.sleep(5000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
					 //Click On Date Of Joinig
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
					 //click on year 
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
					 //Select year
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[5]/td[4]/div[1]")).click();
					 //Select month
					 Thread.sleep(3000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
					 //Select Date
					 Thread.sleep(3000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[3]/div[1]")).click();
					 //Select  Date of Retirement
					 Thread.sleep(2000);
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
					 //click on  Year
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
					 //Select Year 
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[2]/div[1]")).click();
					 //Select Month
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
					 //Select Date 
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
					 //Upload Retirement Document
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[2]/div/div/div[2]/div/div/button[1]/img")).click();
					 //Select Authority To Retired
					 Thread.sleep(10000);
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
					 //Select ministry /PSU
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
					 //Designation At The Time Of Retirement
					 d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[1]/div/div[1]/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President Of BCCI");
					 //Scroll Window Down
					 Thread.sleep(2000);
					 String s;
					JavascriptExecutor j=(JavascriptExecutor) d;
					j.executeScript(s= "window.scrollBy(0,200)");
					//Select Authority
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[1]/span")).click();
					//Select Ministri /Psu
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[3]/span")).click();
					//Enter Designation
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("President of BCCI");
					//Select Zone
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
					//Select  District
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option/span")).click();
					//Select  from Date 
					Thread.sleep(2000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[6]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
					
					//click on Year
					Thread.sleep(2000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]")).click();
					//Select Year
					Thread.sleep(5000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[3]/div[1]")).click();
					//Select Month
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]")).click();
					//Selet Date 
					Thread.sleep(5000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[3]/div[1]")).click();
					//select To Date
					Thread.sleep(7000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[7]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]")).click();
					//Select Year
					Thread.sleep(5000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[1]/span[1]/span")).click();
					//Select Year
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div[1]")).click();
					//Select Month
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]")).click();
					//Select Date
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]")).click();
					//Click on Add
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[2]/div[2]/div[1]/div[8]/div/button[2]/span[1]")).click();
					//Scroll Down
					Thread.sleep(2000);
					//Enter Friend Name 
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Rohit");
					//Enter Last name 
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Sharma");
					//Enter Mobile No
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[3]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("6574546457");
					
					Thread.sleep(2000);
					//Scroll Down
					 String s1;
						JavascriptExecutor j1=(JavascriptExecutor) d;
						j1.executeScript(s1= "window.scrollBy(0,200)");
					//Select Category
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[12]/span")).click();
					//Select Expertise Area 
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/mat-option[2]/span")).click();
					//Clcik On Add
					Thread.sleep(1000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[4]/div[2]/div/div[1]/div/div[3]/button[2]/span[1]")).click();
					
					//Scroll Down
					Thread.sleep(2000);
					 String s2;
						JavascriptExecutor j2=(JavascriptExecutor) d;
						j2.executeScript(s2= "window.scrollBy(0,100)");
					 //Click On Submit
						Thread.sleep(10000);
					d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[2]/form/div[5]/button[2]/span[1]")).click();
					Thread.sleep(2000);
					d.findElement(By.xpath("/html/body/div[4]/div[2]/div/mat-dialog-container/app-success-modal/div/div/div/div/div[2]/div[2]/div/button")).click();
					Thread.sleep(10000);
				
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  }
}
	  }}}
 

  @AfterMethod
  public void afterMethod() {
  }

}
