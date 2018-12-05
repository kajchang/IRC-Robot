package frc.team4159.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
    private static OI instance;

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }

        return instance;
    }

    private XboxController controller;

    private OI() {
        controller = new XboxController(0);
    }

    public double getLeftJoy() {
        return controller.getRawAxis(1);
    }

    public double getRightJoy() {
        return -controller.getRawAxis(5);
    }
}
