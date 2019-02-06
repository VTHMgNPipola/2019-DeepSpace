package frc.robot;

//import frc.robot.base.commands.autonomous.Autonomous;
import frc.robot.base.commands.teleoperated.*;
import frc.robot.base.commands.drive.*;
import frc.robot.base.commands.CommandBase;
import frc.robot.base.commands.generic.CommandSingleSolenoid;
import frc.robot.base.subsystems.SubsystemJoystick;

public class OI {
	public OI() {
		//Autonomous.initAutonomous();
		/*CommandBase.joystick.whenPressed(SubsystemJoystick.d_X, new CommandDoubleSolenoidActive());
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_A, new CommandDoubleSolenoidReverse());
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_B, new CommandDoubleSolenoidOff());
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_Y, new CommandDoubleSolenoidSla());
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_RT, new CommandSingleSolenoid(CommandBase.hatchIntake, CommandBase.hatchIntake.testOne, true));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_LT, new CommandSingleSolenoid(CommandBase.hatchIntake, CommandBase.hatchIntake.testOne, false));*/
		//CommandBase.joystick.whenPressed(SubsystemJoystick.d_X, new CommandHatchIntake());

		//CommandBase.joystick.whenHeld(SubsystemJoystick.d_A, new CommandLift(0.7));
		//CommandBase.joystick.whenHeld(SubsystemJoystick.d_B, new CommandLift(-0.7));
		//CommandBase.joystick.whenHeld(SubsystemJoystick.d_LT, new CommandCargoIntake(0.4, true));
		//CommandBase.joystick.whenHeld(SubsystemJoystick.d_RT, new CommandCargoIntake(0.4, false));

		CommandBase.joystick.whenPressed(SubsystemJoystick.d_A, new CommandDriverPosition(5));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_B, new CommandReset());
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_X, new CommandDriverAngle(90));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_Y, new CommandDriverVelocity(1));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_POV_U, new CommandDriverVelocity(1.5));
		CommandBase.joystick.whenPressed(SubsystemJoystick.d_POV_D, new CommandDriverVelocity(2));

	}
}