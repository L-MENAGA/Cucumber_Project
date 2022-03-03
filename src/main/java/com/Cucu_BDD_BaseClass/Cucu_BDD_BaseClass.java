package com.Cucu_BDD_BaseClass;


import java.io.File;
import java.io.FileInputStream;
//import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cucu_BDD_BaseClass {
	public static WebDriver driver; ///---- Have default null value
	public static String value;
	public static WebDriver getBrowser(String type){
	
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gekco.driver",  System.getProperty("user.dir")+"//Driver//firefox.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
        }
	public static void url(String url) {
		driver.get(url);
	    }
	public static void sleep (int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	    }
	public static void clickIt( WebElement element) {
		element.click();
		}
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
		}
	public static void actionsClass(String actionName, WebElement element) {
		Actions mouse = new Actions(driver);
		if(actionName.equalsIgnoreCase("moveTo")) {
		mouse.moveToElement(element).build().perform();}
		else if(actionName.equalsIgnoreCase("clickOn")){
		mouse.click(element).build().perform();}
		else if(actionName.equalsIgnoreCase("doubleClick")) {
		mouse.doubleClick(element).build().perform();}
		else if(actionName.equalsIgnoreCase("ContextClick")) {
		mouse.contextClick(element).build().perform();}
		
		}

	public static void scrollUp_Down(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",element);
		}
	public static void explicitwait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void dropdown(String type, WebElement element,String value) {
		Select s = new Select(element);
		
		 if(type.equalsIgnoreCase("Byvalue")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		
		}
		else if(type.equalsIgnoreCase("index")) {
		int num = Integer.parseInt(value);
		s.selectByIndex(num);
	}
	}
	
	public static void frameoperations(String frametype, String value, WebElement element) {
		if(frametype.equalsIgnoreCase("frameByID")) {
			driver.switchTo().frame(value);
		}
		
		
		else if (frametype.equalsIgnoreCase("frameByElement")) {
			driver.switchTo().frame(element);
		}
		else if (frametype.equalsIgnoreCase("frameByIndex")) {
			int inte =Integer.parseInt(value);
			driver.switchTo().frame(inte);
		}
		else if(frametype.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
		else if(frametype.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}
	}
	
		
		public static String  inputData_From_Excel(String path, int row_Index, int Cell_Index) throws Throwable{
			File f = new File (path);
			FileInputStream fis =new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(0);
		       Row row = sheetAt.getRow(row_Index);
		        Cell cell= row.getCell(Cell_Index);
		         CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
             value = cell.getStringCellValue(); // giving value instead of string value because it already get from string
				
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellvalue= cell.getNumericCellValue();
			int val=(int) numericCellvalue;
			value= String.valueOf(val);
			
		}
		return value;
		}

		
			
	

	
	
}	 
		
		
	
		
		
	

