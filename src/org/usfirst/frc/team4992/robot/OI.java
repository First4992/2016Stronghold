package org.usfirst.frc.team4992.robot;

import org.usfirst.frc.team4992.robot.commands.ActivatePiston;
import org.usfirst.frc.team4992.robot.commands.TurnLeft;
import org.usfirst.frc.team4992.robot.commands.TurnRight;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
   static final Joystick controller = new Joystick(0);
   static final Joystick stick = new Joystick(0);
   
   //Buttons
   public static final Button AButton = new JoystickButton(controller,RobotMap.A_BUTTON);
   public static final Button BButton = new JoystickButton(controller,RobotMap.B_BUTTON);
   public static final Button leftBumper = new JoystickButton(controller,RobotMap.LEFT_BUMPER);
   public static final Button rightBumper = new JoystickButton(controller,RobotMap.RIGHT_BUMPER);
   
   
   
   public OI(){
	   //Call commands
		 AButton.whenPressed(new ActivatePiston());//Activate the piston when a is clicked
		 leftBumper.whileHeld(new TurnLeft());//Turn left while the left bumper is held
		 rightBumper.whileHeld(new TurnRight());//Turn right while the right bumper is pressed
   }
  
   //getter for controller
   public static Joystick getController(){
	   	return controller;  
   }
   //Getter for joystick
   public static Joystick getJoystick(){
	   return stick;
   }
   
   
}
