package com.files.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String flPath = "src\\main\\resources\\Files\\Ohrm.xlsx";
		FileInputStream fis = new FileInputStream(flPath);
		
		Workbook wb;
		if(flPath.endsWith(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		}else {
			wb = new HSSFWorkbook(fis);
		}				
		
		Sheet sht =  wb.getSheet("OhrmAddEmployee");
		int rc = sht.getLastRowNum();
		int cc = sht.getRow(0).getLastCellNum();
		System.out.println(rc);
		System.out.println(cc);
//		System.out.println(sht.getRow(1).getCell(1).toString());
		
		for(int r = 0;r<=rc;r++) {
			for(int c=0;c<cc;c++) {
				System.out.println(sht.getRow(r).getCell(c).toString());
			}
		}
		
		wb.close();
	}

}
