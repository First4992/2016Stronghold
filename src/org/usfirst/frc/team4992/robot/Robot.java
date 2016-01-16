package org.usfirst.frc.team4992.robot;

import org.usfirst.frc.team4992.robot.subsystems.Chassis;
import org.usfirst.frc.team4992.robot.subsystems.Piston;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;

    //Declare all commands
    
	//Declare all subsystems
    public static Chassis chassis;// Chassis object
    public static Piston piston;
    public static DigitalInput limitSwitch; //Sensor object
    public static Compressor compressor;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
		
		//Instanitate subsystems
		chassis = new Chassis();
		limitSwitch = new DigitalInput(0);
		piston = new Piston();
		compressor = new Compressor(0);
		
		//Start compressor
		compressor.start();
		
		//Set piston to be in reverse state
		piston.getSolenoid().set(DoubleSolenoid.Value.kReverse);
		
		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
       // System.out.println(motorInput.get());
       // test.set(-OI.getController().getRawAxis(RobotMap.LEFT_STICK_Y));
        //System.out.println(piston.magSensor.getValue());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
