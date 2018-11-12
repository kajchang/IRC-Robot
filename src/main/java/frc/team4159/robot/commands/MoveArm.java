package frc.team4159.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.team4159.robot.OI;
import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Arm;

public class MoveArm extends Command {
    private OI oi;
    private Arm arm;

    public void execute() {
        arm.setArmSpeed(oi.getArmJoy());
    }

    @Override
    protected void end() {
        arm.setArmSpeed(0);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    public MoveArm() {
        oi = Robot.getOI();
        arm = Robot.getArm();

        requires(arm);
    }
}
