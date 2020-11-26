package com.wd.tng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.wd.util.DriverFactory;

public class Ohrm_DP{
	@DataProvider
	public String[][] getEmpData() {

		String empData[][] = new String[2][2];
		
		// 1st time
		empData[0][0] = "selenium";
		empData[0][1] = "hq";

		// 2nd time
		empData[1][0] = "web";
		empData[1][1] = "driver";

		return empData;
	}
	
	@DataProvider
	public String[][] getEmpDataFromExcel() throws IOException {
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
		
		String tcData[][] = new String[rc][cc];
		
		for(int r = 1;r<=rc;r++) {
			for(int c=0;c<cc;c++) {
				tcData[r-1][c] = sht.getRow(r).getCell(c).toString();
			}
		}
		
		wb.close();
		
		return tcData;
	}
	
	@DataProvider
	public Object[][] getEmpDataMapFromExcel() throws IOException {
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
		
		Object tcData[][] = new Object[rc][1];
		
		for(int r = 1;r<=rc;r++) {
			HashMap<String, String> tcMap = new HashMap<>();
			for(int c=0;c<cc;c++) {
				String kName= sht.getRow(0).getCell(c).toString();
				String kVal= sht.getRow(r).getCell(c).toString();
				tcMap.put(kName, kVal);
			}
			
			tcData[r-1][0] = tcMap;
		}
		
		wb.close();
		
		return tcData;
	}
}
