package frc.robot;

import frc.robot.base.commands.CommandBase;
import frc.robot.base.commands.teleoperated.CommandIntake;
import frc.robot.base.subsystems.SubsystemJoystick;

public class OI {
    public OI() {
        CommandBase.joystick.whenHeld(SubsystemJoystick.j_Thumb, new CommandIntake(true, true));
        CommandBase.joystick.whenHeld(SubsystemJoystick.j_Fire, new CommandIntake(false, true));
    }
}