package frc.team4159.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
    private static OI instance;

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }

        return instance;
    }

    private Joystick leftJoy;
    private Joystick rightJoy;

    private OI() {
        leftJoy = new Joystick(0);
        rightJoy = new Joystick(1);
    }

    public double getLeftJoy() {
        return leftJoy.getY();
    }

    public double getRightJoy() {
        return rightJoy.getY();
    }
}
