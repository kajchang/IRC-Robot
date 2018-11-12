package frc.team4159.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

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

    private Joystick armJoy;

    private JoystickButton intakeButton;
    private JoystickButton outtakeButton;

    private OI() {
        leftJoy = new Joystick(0);
        rightJoy = new Joystick(1);

        armJoy = new Joystick(2);

        intakeButton = new JoystickButton(armJoy, 0);
        outtakeButton = new JoystickButton(armJoy, 1);
    }

    public double getLeftJoy() {
        return leftJoy.getY();
    }

    public double getRightJoy() {
        return rightJoy.getY();
    }

    public double getArmJoy() {
        return armJoy.getY();
    }

    public boolean getIntakeButton() {
        return intakeButton.get();
    }

    public boolean getOuttakeButton() {
        return intakeButton.get();
    }
}
