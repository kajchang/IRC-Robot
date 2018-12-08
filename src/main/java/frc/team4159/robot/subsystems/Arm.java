package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.team4159.robot.commands.MoveArm;

public class Arm extends Subsystem {
    private static Arm instance;

    public static Arm getInstance() {
        if (instance == null) {
            instance = new Arm();
        }

        return instance;
    }

    private VictorSP armMotor;

    private Arm() {
        armMotor = new VictorSP(2);
    }

    public void setArmSpeed(double speed) {
        armMotor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MoveArm());
    }
}
