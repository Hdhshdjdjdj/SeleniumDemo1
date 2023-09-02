package com.demo.SeleniumDemo;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Datatable2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

	
		

		File file=new File("C:\\Users\\PARESPAT\\eclipse-workspace\\.metadata\\SeleniumDemo\\Exceldata\\data4.xlsx");

		         

		        FileInputStream fos= new FileInputStream(file);

		        XSSFWorkbook w1=new XSSFWorkbook(fos);

		        

		        Sheet s= w1.getSheetAt(0);

		        Row r=s.getRow(0);

		        Cell c=r.getCell(1);

		        System.out.println(c);

		        w1.close();

		        fos.close();

	}

}
