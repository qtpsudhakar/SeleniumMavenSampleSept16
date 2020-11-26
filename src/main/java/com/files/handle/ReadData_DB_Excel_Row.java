//package com.files.handle;
//
//import java.util.List;
//
//import com.codoid.products.exception.FilloException;
//import com.codoid.products.fillo.Connection;
//import com.codoid.products.fillo.Fillo;
//import com.codoid.products.fillo.Recordset;
//
//public class ReadData_DB_Excel_Row {
//
//	public static void main(String[] args) throws FilloException {
//
//		Fillo fillo = new Fillo();
//		String flPath = "src\\main\\resources\\Files\\Ohrm.xlsx";
//		Connection connection = fillo.getConnection(flPath);
//
//		Recordset rs = connection.executeQuery("select * from Sheet1");
//		List<String> columns = rs.getFieldNames();
//
//		while (rs.next()) {
//			for (int c = 0; c < columns.size(); c++) {
//				System.out.println(rs.getField(c).value());
//			}
//		}
//
//		rs.close();
//		connection.close();
//
//	}
//
//}
