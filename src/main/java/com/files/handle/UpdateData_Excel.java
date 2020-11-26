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

public class UpdateData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook wb = new XSSFWorkbook();
		Sheet sht =  wb.createSheet("demo");
		Row hRow =  sht.createRow(0);
		hRow.createCell(0).setCellValue("name");
		hRow.createCell(1).setCellValue("age");
		
		Row row1 =  sht.createRow(1);
		row1.createCell(0).setCellValue("selenium");
		row1.createCell(1).setCellValue(15);
		
		String flPath = "src\\main\\resources\\Files\\Output.xlsx";
		FileOutputStream fos = new FileOutputStream(flPath);
		wb.write(fos);
		
		wb.close();
	}

}
