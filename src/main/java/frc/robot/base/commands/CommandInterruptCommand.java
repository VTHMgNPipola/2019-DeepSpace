package frc.robot.base.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.superclasses.Command5800;

public class CommandInterruptCommand extends Command5800 {
    Command comToInterrupt;

    public CommandInterruptCommand(Command command) {
        super(null);
        comToInterrupt = command;
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
        comToInterrupt.cancel();
    }
}
