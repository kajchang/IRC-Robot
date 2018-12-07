package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.team4159.robot.commands.Drive;

public class Drivetrain extends Subsystem {
    private static Drivetrain instance;

    public static Drivetrain getInstance() {
        if (instance == null) {
            instance = new Drivetrain();
        }

        return instance;
    }

    private VictorSP leftVictor;
    private VictorSP rightVictor;

    private Drivetrain() {
        leftVictor = new VictorSP(0);
        rightVictor = new VictorSP(1);
    }

    public void setSpeed(double left, double right) {
        leftVictor.set(-left);
        rightVictor.set(right);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
}
