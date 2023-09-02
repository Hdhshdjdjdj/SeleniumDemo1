package com.demo.SeleniumDemo;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\PARESPAT\\eclipse-workspace\\.metadata\\SeleniumDemo\\Exceldata\\data4.xlsx");
		
		FileOutputStream fos= new FileOutputStream(file);
		Workbook w=new XSSFWorkbook();
		
		Sheet s=w.createSheet();
	

		s.createRow(0);

		        s.getRow(0).createCell(0).setCellValue("Hello");

		        s.getRow(0).createCell(1).setCellValue("paresh");

		        s.createRow(1);

		        s.getRow(1).createCell(0).setCellValue("Capg");

		        s.getRow(1).createCell(1).setCellValue("");
		        
		        //another sheet
		        
		        Sheet s1=w.createSheet("Testing Data");
		        
		        s1.createRow(0);
		        s1.getRow(0).createCell(0).setCellValue("Hello");

		        s1.getRow(0).createCell(1).setCellValue("capg");
		        

		        

		        w.write(fos);

		        w.close();
		
	
		

	}

}
