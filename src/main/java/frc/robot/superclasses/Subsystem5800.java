package frc.robot.superclasses;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.base.commands.CommandBase;

public class Subsystem5800 extends Subsystem {
    public int systemID;

    public Subsystem5800() {
        super();
        systemID = CommandBase.id;
        CommandBase.subsystemList.add(this);
        CommandBase.id++;
    }

    public final void initDefaultCommand() {
        onInit();
    }

    public void onInit() {
    }

    public void setDefCommand(Command5800 command) {
        setDefaultCommand(command);
    }
}
