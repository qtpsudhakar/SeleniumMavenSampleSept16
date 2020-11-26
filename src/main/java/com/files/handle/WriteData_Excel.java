package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String flPath = "src\\main\\resources\\Files\\Output.xlsx";
		Workbook wb = new XSSFWorkbook(new FileInputStream(flPath));
		
		Sheet sht =  wb.getSheet("demo");

		Row row1 =  sht.createRow(2);
		row1.createCell(0).setCellValue("webdriver");
		row1.createCell(1).setCellValue(10);
		
		
		FileOutputStream fos = new FileOutputStream(flPath);
		wb.write(fos);
		
		wb.close();
	}

}
