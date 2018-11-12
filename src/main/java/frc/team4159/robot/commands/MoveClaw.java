package frc.team4159.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.team4159.robot.OI;
import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Claw;

public class MoveClaw extends Command {
    private OI oi;
    private Claw claw;

    public void execute() {
        if (oi.getIntakeButton()) {
            claw.intake();
        } else if (oi.getOuttakeButton()) {
            claw.outtake();
        } else {
            claw.stop();
        }
    }

    @Override
    protected void end() {
        claw.stop();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    public MoveClaw() {
        oi = Robot.getOI();
        claw = Robot.getClaw();

        requires(claw);
    }
}
