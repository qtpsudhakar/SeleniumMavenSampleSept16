package com.java.inter;

public class TataNano implements TataCars,Irs{

	public void addGPS() {
		System.out.println("gps added to nano");
	}
	
	public void addRearCam() {
		System.out.println("RearCam added to nano");
	}
	
	public void addInfotainment() {
		System.out.println("Infotainment added to nano");
	}
	
	public void addAlloyWheels() {
		System.out.println("Alloy Wheels added to nano");
	}
	
	public void addRearEngine() {
		System.out.println("rear engine added");
	}

	@Override
	public void addRightHandSideSteering() {
		
		System.out.println("RightHandSideSteering added");
		
	}
}
