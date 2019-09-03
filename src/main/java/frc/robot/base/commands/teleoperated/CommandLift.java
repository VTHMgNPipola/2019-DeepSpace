package frc.robot.base.commands.teleoperated;

import frc.robot.base.commands.CommandBase;
import frc.robot.base.subsystems.SubsystemJoystick;
import frc.robot.superclasses.Command5800;

public class CommandLift extends Command5800 {

    public CommandLift() {
        super(CommandBase.lift);
    }

    protected void execute() {
        final double _sp = SubsystemJoystick.axis_j_Y.get() * 0.4;
        final int limit = 10000;
        if (_sp >= 0) {
            if (CommandBase.lift.liftMotor.getSelectedSensorPosition() <= limit) {
                CommandBase.lift.setLiftMotor(_sp);
            } else {
                CommandBase.lift.setLiftMotor(0.1);
            }
        } else {
            if (CommandBase.lift.liftMotor.getSelectedSensorPosition() >= -limit) {
                CommandBase.lift.setLiftMotor(_sp);
            } else {
                CommandBase.lift.setLiftMotor(-0.1);
            }
        }
    }

    protected boolean isDone() {
        return false;
    }

    protected void onCompletion() {
    }
}
