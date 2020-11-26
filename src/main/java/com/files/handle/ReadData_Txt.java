package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Txt {

	public static void main(String[] args) {

		String flPath = "src\\main\\resources\\Files\\Demo.txt";

		// filereader
		// bufferedreader

		FileReader fReader;
		try {
			fReader = new FileReader(flPath);

			BufferedReader br = new BufferedReader(fReader);

			String lnData = br.readLine();

			while (lnData != null) {
				System.out.println(lnData);
				lnData = br.readLine();
			}

			br.close();
			fReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//post condition for try block
		}
	}

}
