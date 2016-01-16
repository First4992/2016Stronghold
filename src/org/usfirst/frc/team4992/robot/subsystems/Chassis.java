package org.usfirst.frc.team4992.robot.subsystems;																																																																																																																																																										//Hamza X Grace

import org.usfirst.frc.team4992.robot.RobotMap;
import org.usfirst.frc.team4992.robot.Smoothing;
import org.usfirst.frc.team4992.robot.commands.ArcadeDrive;
import org.usfirst.frc.team4992.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
	
	//Create an object for each of the speed controllers
	CANTalon backLeft = new CANTalon(RobotMap.BACK_LEFT_TALON);
	CANTalon backRight = new CANTalon(RobotMap.BACK_RIGHT_TALON);
	CANTalon frontLeft = new CANTalon(RobotMap.FRONT_LEFT_TALON);
	CANTalon frontRight = new CANTalon(RobotMap.FRONT_RIGHT_TALON);
	
	RobotDrive drive = new RobotDrive(frontLeft,backLeft,frontRight,backRight);//Create drive object that uses each of the speedcontrollers
	
	public double accelerationConst = 1.0;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void arcadeDrive(Joystick controller){       
		drive.arcadeDrive(-Smoothing.smoothSpeed(controller),0);//Get the y value of the controller and have no curve
	}
	
	public void turnLeft(){
		drive.arcadeDrive(0,0.5);//Curve to the left at half speed
	}
	
	public void turnRight(){
		drive.arcadeDrive(0,-0.5);//Curve to right at half speed
	}
	
	public void tankDrive(Joystick controller){
		drive.tankDrive(-controller.getRawAxis(1), -controller.getRawAxis(5));//Get the y values of both xbox sticks to drive
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ArcadeDrive());//Set the default command for chassis to arcadedrive
    }
}
