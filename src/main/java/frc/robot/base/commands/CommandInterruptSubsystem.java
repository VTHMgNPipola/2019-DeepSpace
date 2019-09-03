package frc.robot.base.commands;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.superclasses.Command5800;

public class CommandInterruptSubsystem extends Command5800 {
    Subsystem subsystem;

    public CommandInterruptSubsystem(Subsystem sub) {
        super(null);
        subsystem = sub;
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isDone() {
        return true;
    }

    @Override
    protected void onCompletion() {
        subsystem.getCurrentCommand().cancel();
    }
}
