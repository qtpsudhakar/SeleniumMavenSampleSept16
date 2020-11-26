package com.java.inter;

public class CreateCars {

	public static void main(String[] args) {
		
		TataNano car1 = new TataNano();
		car1.addAlloyWheels();
		car1.addGPS();
		car1.addInfotainment();
		car1.addRearCam();
		car1.addRearEngine();

		TataCars car2 = new TataTiago();
		car2.addAlloyWheels();
		car2.addGPS();
		car2.addInfotainment();
		car2.addRearCam();
//		car2.addRearEngine();

		Irs car3 = new TataNano();
		car3.addRightHandSideSteering();		

		TataCars car4 = (TataCars) car3;
	}

}
