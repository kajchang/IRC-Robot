package frc.team4159.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import frc.team4159.robot.subsystems.Arm;
import frc.team4159.robot.subsystems.Claw;
import frc.team4159.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {
    private static Drivetrain drivetrain;
    private static Arm arm;
    private static Claw claw;
    private static OI oi;

    @Override
    public void robotInit() {
        drivetrain = Drivetrain.getInstance();
        arm = Arm.getInstance();
        claw = Claw.getInstance();
        oi = OI.getInstance();
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void disabledPeriodic() {

    }

    @Override
    public void autonomousInit() {

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
    public static Claw getClaw() {
        return claw;
    }
    public static OI getOI() {
        return  oi;
    }
}
