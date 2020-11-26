package com.files.handle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Txt {

	public static void main(String[] args){
		String flPath = "src\\main\\resources\\Files\\Demo1.txt";

		// filewriter
		// bufferedwriter
		try {
			FileWriter fw = new FileWriter(flPath, true); // true will update existing file
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("data1");
			bw.newLine();
			bw.write("data2");
			bw.newLine();
			bw.write("data3");

			bw.close();
			fw.close();
		} catch (Exception e) {

		}
	}

}
