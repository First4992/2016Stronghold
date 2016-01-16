package org.usfirst.frc.team4992.robot.commands;

import org.usfirst.frc.team4992.robot.OI;
import org.usfirst.frc.team4992.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TurnLeft extends Command {

    public TurnLeft() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(!OI.rightBumper.get())Robot.chassis.turnLeft();//If the right bumper is free, then execute the command.
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
