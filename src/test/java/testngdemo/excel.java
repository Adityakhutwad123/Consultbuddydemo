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
  @Test
  public void f() {
	  s=w.getSheetAt(0);
	  for(ro=0;ro<4;ro++) 	 { 		
		  r=s.getRow(ro); 
	  for(co=0;co<3;co++) 		
	  { 			
		  c=r.getCell(co); 
		if(co==0) {
		  String name1=c.getStringCellValue();
	  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1);
		}
		else {}
		if(co==1) {
			String name2=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
			
		}
		else {}
		if(co==2) {
			String name2=c.getStringCellValue();
			  d.findElement(By.xpath("/html/body/app-root/app-web/div/app-my-account/div/div[2]/div/div/mat-stepper/div[2]/div[1]/form/div[1]/div[2]/div[2]/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name2);
		}
	  } 		
	 
	  }
	  
	  
  }
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

  @AfterMethod
  public void afterMethod() {
  }

}
