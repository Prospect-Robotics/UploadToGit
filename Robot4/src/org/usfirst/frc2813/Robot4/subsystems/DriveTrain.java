// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2813.Robot4.subsystems;

import org.usfirst.frc2813.Robot4.RobotMap;
import org.usfirst.frc2813.Robot4.commands.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
	
	

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public final Encoder quadratureEncoder1 = RobotMap.driveTrainQuadratureEncoder1;
    public final Encoder quadratureEncoder2 = RobotMap.driveTrainQuadratureEncoder2;
    public final Encoder quadratureEncoder3 = RobotMap.driveTrainQuadratureEncoder3;
    public final Encoder quadratureEncoder4 = RobotMap.driveTrainQuadratureEncoder4;
    private final SpeedController speedController1 = RobotMap.driveTrainSpeedController1;
    private final SpeedController speedController2 = RobotMap.driveTrainSpeedController2;
    private final SpeedController speedController3 = RobotMap.driveTrainSpeedController3;
    private final SpeedController speedController4 = RobotMap.driveTrainSpeedController4;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        setDefaultCommand(new OIDrive());
    }
    public void mecanumDrive(Joystick joystick1, double gyroAngle) {
    	robotDrive.mecanumDrive_Cartesian(joystick1.getX(),joystick1.getY(), joystick1.getTwist(), gyroAngle);
    }
}

