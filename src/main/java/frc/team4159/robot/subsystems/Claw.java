package frc.team4159.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.team4159.robot.commands.MoveClaw;

public class Claw extends Subsystem {
    private static Claw instance;

    public static Claw getInstance() {
        if (instance == null) {
            instance = new Claw();
        }

        return instance;
    }

    private VictorSP leftVictor;
    private VictorSP rightVictor;

    private Claw() {
        leftVictor = new VictorSP(3);
        rightVictor = new VictorSP(4);
    }

    public void outtake() {
        leftVictor.setSpeed(1);
        rightVictor.setSpeed(-1);
    }

    public void intake() {
        leftVictor.setSpeed(-1);
        rightVictor.setSpeed(1);
    }

    public void stop() {
        leftVictor.setSpeed(0);
        rightVictor.setSpeed(0);
    }

    @Override
    protected void initDefaultCommand() {
        new MoveClaw();
    }
}
