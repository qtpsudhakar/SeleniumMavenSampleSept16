package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData_DB {

	public static void main(String[] args) throws SQLException {
		// DB Server
		// DB Name
		// User Name
		// Password

		String sqldb_url = "jdbc:mysql://localhost:3307/company";
		// Use your database username here. It Is "root" for root account.
		String sqldb_uname = "root";
		String sqldb_pass = "admin";
		// To Create database connection.
		Connection db = DriverManager.getConnection(sqldb_url, sqldb_uname, sqldb_pass);
		Statement st = db.createStatement();
		ResultSet rs = st.executeQuery("select * from emp");
		
		ResultSetMetaData rsm = rs.getMetaData();
		
		int cc = rsm.getColumnCount();
		
		for(int c=1;c<=cc;c++) {
			String cName = rsm.getColumnName(c);
			System.out.println("**********************");
			System.out.println(cName);
			System.out.println("**********************");
			while(rs.next()) {
				System.out.println(rs.getString(cName));
			}
			rs.beforeFirst();
		}
		
		db.close();
		
	}

}









