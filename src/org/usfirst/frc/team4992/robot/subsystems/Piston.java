package org.usfirst.frc.team4992.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Piston extends Subsystem {
	
	private DoubleSolenoid solenoid = new DoubleSolenoid(0,1);//Solenoid for piston airflow control
   public AnalogInput magSensor = new AnalogInput(0);//Analog input for magnetic reed switch
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void activatePiston(){
		System.out.println("Piston Activated");

		Value currentState = getSolenoid().get();
		Value forwardState = DoubleSolenoid.Value.kForward;
		Value reverseState = DoubleSolenoid.Value.kReverse;
		Value offState = DoubleSolenoid.Value.kOff;
		
		//if the piston is out, put it in reverse, otherwise put it in reverse
		
		if(currentState == forwardState || currentState == offState) getSolenoid().set(reverseState);
		else getSolenoid().set(forwardState);
	}
	
	public void openPiston(){
		solenoid.set(DoubleSolenoid.Value.kForward);//Activate the forward channel on the piston's solenoid
	}
	
	public void closePiston(){
		solenoid.set(DoubleSolenoid.Value.kReverse);//Activate the reverse channel on the piston's solenoid
	}
		
	public void doNothing(){
		solenoid.set(solenoid.get());
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new PistonDoNothing());
    }

	public DoubleSolenoid getSolenoid() {
		return solenoid;
	}



	public void setSolenoid(DoubleSolenoid solenoid) {
		this.solenoid = solenoid;
	}
}

