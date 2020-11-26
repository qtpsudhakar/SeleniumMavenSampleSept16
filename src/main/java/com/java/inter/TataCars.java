package com.java.inter;

public interface TataCars {
	String brand = "TATA";
	
	public void addGPS(); //A method without bpdy is called abstract method
	public void addRearCam();
	public void addInfotainment();	
	public void addAlloyWheels();
	
	public default void addTyres() {
		
	}
}
