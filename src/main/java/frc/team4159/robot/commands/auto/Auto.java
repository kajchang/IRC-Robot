package frc.team4159.robot.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {
    public Auto() {
        addSequential(new DriveForward(4));
        addSequential(new ArmUp(1));
        addSequential(new ArmDown(1));
    }
}
