package frc.team4159.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import frc.team4159.robot.commands.auto.Auto;
import frc.team4159.robot.subsystems.Arm;
import frc.team4159.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {
    private static Drivetrain drivetrain;
    private static Arm arm;
    private static OI oi;

    private static Command autoCommand;

    @Override
    public void robotInit() {
        drivetrain = Drivetrain.getInstance();
        oi = OI.getInstance();
        arm = arm.getInstance();

        autoCommand = new Auto();
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void disabledPeriodic() {

    }

    @Override
    public void autonomousInit() {
        autoCommand.start();
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public static Drivetrain getDrivetrain() {
        return drivetrain;
    }

    public static Arm getArm() {
        return arm;
    }

    public static OI getOI() {
        return oi;
    }
}
