package frc.team4159.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.team4159.robot.OI;
import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Drivetrain;

public class Drive extends Command {
    private OI oi;
    private Drivetrain drivetrain;

    public void execute() {
        drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());
    }

    @Override
    protected void end() {
        drivetrain.setSpeed(0, 0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    public Drive() {
        oi = Robot.getOI();
        drivetrain = Robot.getDrivetrain();

        requires(drivetrain);
    }
}
