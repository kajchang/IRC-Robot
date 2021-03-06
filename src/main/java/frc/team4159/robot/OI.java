package frc.team4159.robot;

import edu.wpi.first.wpilibj.GenericHID;
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
        return -controller.getY(GenericHID.Hand.kLeft) / 2;
    }

    public double getRightJoy() {
        return -controller.getY(GenericHID.Hand.kRight) / 2;
    }

    public double getArmValue() {
        if (controller.getTriggerAxis(GenericHID.Hand.kRight) > 0) {
            return 0.5;
        } else if (controller.getTriggerAxis(GenericHID.Hand.kLeft) > 0) {
            return -0.5;
        } else {
            return 0;
        }
    }
}
