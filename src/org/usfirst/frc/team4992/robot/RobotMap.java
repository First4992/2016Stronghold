package org.usfirst.frc.team4992.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	//Drive Motors
	public static final int BACK_LEFT_TALON = 3;//Code for back left speed controller
	public static final int BACK_RIGHT_TALON = 2;//Code for back right speed controller
	public static final int FRONT_LEFT_TALON = 4;
	public static final int FRONT_RIGHT_TALON = 1;
	
	//Buttons
	public static final int A_BUTTON = 1;
	public static final int B_BUTTON = 2;
	public static final int LEFT_BUMPER = 5;
	public static final int RIGHT_BUMPER = 6;
	
	//Sticks
	public static final int LEFT_STICK_Y = 1;
	public static final int LEFT_STICK_X = 0;
	public static final int RIGHT_STICK_X = 4;
	public static final int RIGHT_STICK_Y = 5;
	
	//Triggers
	public static final int LEFT_TRIGGER = 2;
	public static final int RIGHT_TRIGGER = 3;
	
}