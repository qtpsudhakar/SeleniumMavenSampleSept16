package com.wd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtils {

	public static HashMap<String, String> getTcData(String tcName) throws IOException {
		String flPath = "src\\main\\resources\\Files\\Ohrm.xlsx";
		FileInputStream fis = new FileInputStream(flPath);
		
		Workbook wb;
		if(flPath.endsWith(".xlsx")) {
			wb = new XSSFWorkbook(fis);
		}else {
			wb = new HSSFWorkbook(fis);
		}				
		
		Sheet sht =  wb.getSheet("AllTc");
		int rc = sht.getLastRowNum();
		int cc = sht.getRow(0).getLastCellNum();
		
		HashMap<String, String> tcMap = new HashMap<>();
		
		for(int r = 1;r<=rc;r++) {
			String tcId= sht.getRow(r).getCell(0).toString();
			
			if(tcId.equalsIgnoreCase(tcName)) {			
				for(int c=0;c<cc;c++) {	
					String kName= sht.getRow(0).getCell(c).toString();
					String kVal= sht.getRow(r).getCell(c).toString();
					tcMap.put(kName, kVal);
				}
				
				break;
			}
		}
		
		wb.close();
		
		return tcMap;

	}
	public static String getUniqueId() {
		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMddHHmmss");
		return sd.format(new Date());

	}
}
