package org.usfirst.frc.team4992.robot;

import edu.wpi.first.wpilibj.Joystick;

/*
 * This class is used to make the driving experience for the driver by incrementing the speed of the 
 * robot for more precise control of the robot.
 */

public class Smoothing {
	//Variables
	private static double speedY = 0; //Speed of the robot forward and back (-1.0 to 1.0)
	private static double accConst = 0.025; //The rate at which the speed increments 
	
	/*
	 * This method takes in the joystick controlls and increments the robots speed
	 * up to the value of the joystick at a smooth pace
	 */
	public static double smoothSpeed(Joystick joy) {
		
		//Increments Positively
		if(joy.getRawAxis(1) > 0) {
			if(speedY < joy.getRawAxis(1)) {
				speedY += accConst; 
			}
			if(speedY > joy.getRawAxis(1)) {
				speedY = joy.getRawAxis(1); 
			}
		}
		//Increments Negatively
		if(joy.getRawAxis(1) < 0) {
			if(speedY > joy.getRawAxis(1)) {
				speedY -= accConst; 
			}
			if(speedY < joy.getRawAxis(1)) {
				speedY = joy.getRawAxis(1); 
			}
		}
		
		//Stops the robot when the joy is in a dead zone
		if(joy.getRawAxis(1) < 0.05 && joy.getRawAxis(1) > -0.05) {
			speedY = 0; 
		}
		
		System.out.println(speedY);
		
		return speedY; 
	}
}
