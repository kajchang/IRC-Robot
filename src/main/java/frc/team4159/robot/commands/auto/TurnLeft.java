package frc.team4159.robot.commands.auto;

import edu.wpi.first.wpilibj.command.TimedCommand;

import frc.team4159.robot.Robot;
import frc.team4159.robot.subsystems.Drivetrain;

public class TurnLeft extends TimedCommand {
    private Drivetrain drivetrain;

    public TurnLeft(double time) {
        super(time);
        drivetrain = Robot.getDrivetrain();
        requires(drivetrain);
    }

    @Override
    protected void execute() {
        drivetrain.setSpeed(0, 1);
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
        return isTimedOut();
    }
}
