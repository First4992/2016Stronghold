package org.usfirst.frc.team4992.robot.commands;

import org.usfirst.frc.team4992.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ActivatePiston extends Command {

    public ActivatePiston() {
        // Use requires() here to declare subsystem dependencies
       //requires(Robot.piston);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.piston.activatePiston();//Whenever the command runs, activate the piston once!
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
