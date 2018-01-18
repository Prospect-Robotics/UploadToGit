// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2813.Robot4.commands;

import org.usfirst.frc2813.Robot4.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
    public AutonomousCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	addSequential(new ResetGyro());
    	addSequential(new ResetEncoders());
		//addSequential(new PrintOutRawValueOverTime(500,Robot.driveTrain.quadratureEncoder2,Robot.driveTrain.quadratureEncoder3,Robot.driveTrain.quadratureEncoder4));
    	//addSequential(new ResetEncoders());
    	//addParallel(new AutoDrive(0, -.75, 100, Robot.driveTrain.quadratureEncoder2));
		addSequential(new AutoDrive(0,-.9, 108, Robot.driveTrain.quadratureEncoder2, Robot.driveTrain.quadratureEncoder3, Robot.driveTrain.quadratureEncoder4));//x speed percent,y speed percent,distance,encoder
		//addSequential(new ResetGyro());
		//addSequential(new Rotate(150,0.75));
		System.out.println("In AutonomousCommand after reset gyro.getAngle() is: "+Robot.gyro.getAngle());
		//addSequential(new PrintOutRotate());
		addSequential(new ResetEncoders());
		addSequential(new ResetGyro());
		//addSequential(new AutoDrive(0, -.9, 48, Robot.driveTrain.quadratureEncoder2, Robot.driveTrain.quadratureEncoder3, Robot.driveTrain.quadratureEncoder4));
		//addParallel(new ControlEncoders(Robot.driveTrain.quadratureEncoder2,Robot.driveTrain.quadratureEncoder3,Robot.driveTrain.quadratureEncoder4));
		//addSequential(new ResetEncoders());
		//addSequential(new TimedCommand(5));
		//addSequential(new ResetGyro());
		//System.out.println("SLOW");
		//addSequential(new AutoDrive(0, 0.75, 36, Robot.driveTrain.quadratureEncoder2, Robot.driveTrain.quadratureEncoder4));
		//addSequential(new AutoDrive(0, 0.3, 24, Robot.driveTrain.quadratureEncoder2, Robot.driveTrain.quadratureEncoder4));
		
		System.out.println("In AutonomousCommand after reset gyro.getAngle() is: "+Robot.gyro.getAngle());
        //addSequential(new AutoDrive(0,-0.75,30.5, Robot.driveTrain.quadratureEncoder2, Robot.driveTrain.quadratureEncoder4));
		// To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS
 
    } 
}
