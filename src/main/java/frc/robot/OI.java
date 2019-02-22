package frc.robot;

//import frc.robot.base.commands.autonomous.Autonomous;
import frc.robot.base.commands.teleoperated.*;
import frc.robot.base.commands.drive.*;
import frc.robot.base.commands.CommandBase;
import frc.robot.base.commands.CommandInterruptCommand;
import frc.robot.base.subsystems.SubsystemJoystick;

public class OI {
	public OI() {
		//Autonomous.initAutonomous();
	
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_X, new CommandHatchIntake());
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_B, new CommandArmSetMotor(-0.7));
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_Y, new CommandArmSetMotor(0.7));
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_A, new CommandArmSetMotor(0));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_A, new CommandArm(200));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_B, new CommandArm(3350));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_X, new CommandLift(0));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_Y, new CommandLift(5000));
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_B, new CommandReset());

		//Cargo Intake
		CommandBase.joystick.whenHeld(SubsystemJoystick.d_LT, new CommandCargoIntake(0.5));
		CommandBase.joystick.whenHeld(SubsystemJoystick.d_RT, new CommandCargoIntake(-0.5));

		//Hatch Intake
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Six, new CommandHatchMotorUp(0.6));
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Five, new CommandHatchMotorUp(-0.2));
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Thumb, new CommandHatchIntakeSolenoid());

		//PID Buttons
		/*CommandBase.joystick.whenPressed(SubsystemJoystick.j_Seven, new CommandLift(1235)
		.setSequential(new CommandArm(1111))); //Cargo1
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Eight, new CommandLift(17500)
		.setSequential(new CommandArm(1380))); //Cargo2
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Nine, new CommandLift(16711)
		.setSequential(new CommandArm(3461))); //Cargo3
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Ten, new CommandLift(3785)
		.setSequential(new CommandArm(300))); //Hatch1
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Eleven, new CommandLift(18500)
		.setSequential(new CommandArm(400))); //Hatch2
		CommandBase.joystick.whenPressed(SubsystemJoystick.j_Twelve, new CommandLift(17132)
		.setSequential(new CommandArm(3474))); //Hatch3
		*/
		
	}
}