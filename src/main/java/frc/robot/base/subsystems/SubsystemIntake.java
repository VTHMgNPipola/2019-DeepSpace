package frc.robot.base.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.superclasses.Subsystem5800;

import static frc.robot.RobotMap.CARGO_MOTOR_LEFT_ID;
import static frc.robot.RobotMap.CARGO_MOTOR_RIGHT_ID;

public class SubsystemIntake extends Subsystem5800 {
    public boolean status = false;

    public VictorSP motorLeft = new VictorSP(CARGO_MOTOR_LEFT_ID);
    public VictorSP motorRight = new VictorSP(CARGO_MOTOR_RIGHT_ID);
    public SpeedControllerGroup intakeMotors = new SpeedControllerGroup(motorLeft, motorRight);

    public SubsystemIntake() {
        super();
        motorRight.setInverted(true);
    }

    public void onInit() {
        this.cargoIntakeSet(0.15);
    }

    public void cargoIntakeSet(double speed) {
        motorLeft.set(speed);
        motorRight.set(speed);
    }
}