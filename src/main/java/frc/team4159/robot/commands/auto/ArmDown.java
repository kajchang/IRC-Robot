package frc.team4159.robot.commands.auto;

import edu.wpi.first.wpilibj.command.TimedCommand;

import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Arm;

public class ArmDown extends TimedCommand {
    private Arm arm;

    public ArmDown(double time) {
        super(time);
        arm = Robot.getArm();
        requires(arm);
    }

    @Override
    protected void execute() {
        arm.setArmSpeed(-0.5);
    }

    @Override
    protected void end() {
        arm.setArmSpeed(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
