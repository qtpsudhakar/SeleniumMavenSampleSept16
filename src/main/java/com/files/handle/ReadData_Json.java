package com.files.handle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadData_Json {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		String flPath = "src\\main\\resources\\Files\\TestData.json";
		JSONParser jo = new JSONParser();
		JSONObject json= (JSONObject) jo.parse(new FileReader(flPath));
//		System.out.println(json.get("username"));
		
		JSONArray tcDataArray = (JSONArray) json.get("AddEmployee");

		for (int r = 0; r < tcDataArray.size(); r++) {
			JSONObject tcRows = (JSONObject) tcDataArray.get(r);

			 HashMap<String, String> tcMap = (HashMap<String, String>) tcRows.clone();
			System.out.println(tcMap);
		}

	}

}
