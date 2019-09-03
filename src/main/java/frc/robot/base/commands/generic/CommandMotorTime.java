package frc.robot.base.commands.generic;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.base.commands.CommandBase;
import frc.robot.superclasses.Command5800;
import frc.robot.superclasses.Subsystem5800;

public class CommandMotorTime extends Command5800 {
    public VictorSP motor;
    public double speed;

    public CommandMotorTime(Subsystem5800 requiredSubsystem, double speed, double time) {
        super(requiredSubsystem);
        setTimeout(time);
        this.speed = speed;
    }

    @Override
    protected void execute() {
        CommandBase.driver.tankDrive(this.speed, this.speed);
    }

    @Override
    protected boolean isDone() {
        return isTimedOut();
    }

    @Override
    protected void onCompletion() {
        this.speed = 0;
    }
}
