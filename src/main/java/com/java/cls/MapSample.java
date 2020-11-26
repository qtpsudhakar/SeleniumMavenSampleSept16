package com.java.cls;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {
		
		Map<String, String> userData = new HashMap<>();
		userData.put("username", "admin");
		userData.put("password", "asdf");
		userData.put(null, "asdf");
		
		System.out.println(userData.get("username"));
		System.out.println(userData.get("password"));
		System.out.println(userData.get(null)); //hashmap accepts null
		
		Hashtable<String, String> userDetails = new Hashtable<>();
		userDetails.put("username", "admin");
		userDetails.put("password", "asdf");
//		userDetails.put(null, "asdf"); // null not accepted
		
		
//		System.out.println(userDetails.get(null));
		
		Hashtable<String,String> kids = new Hashtable<>();
		kids.put("a", "apple");
		
		System.out.println(kids.get("a"));
		
		
		String names[] = {"aaa","bbb"};
		Map users = new HashMap<>();
		
		Map<String,Object> toolData = new HashMap<>();
		toolData.put("tool1", names);
		toolData.put("tool2", users);
		
		
	}

}
