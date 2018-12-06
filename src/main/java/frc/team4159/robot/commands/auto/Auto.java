package frc.team4159.robot.commands.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {
    public Auto() {
        addSequential(new DriveForward());
    }
}
