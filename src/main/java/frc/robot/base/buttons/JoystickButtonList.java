package frc.robot.base.buttons;

import edu.wpi.first.wpilibj.buttons.Button;

/**
 * An extension of the Button class that allows for a list of buttons to be
 * required to trigger the action.
 *
 * @author Sean Zammit
 */
public class JoystickButtonList extends Button {
    Button[] buttonList;

    /**
     * Creates a 'button' holding a list of buttons that must all be pressed to
     * trigger a command.
     *
     * @param buttons The list of buttons.
     */
    public JoystickButtonList(Button... buttons) {
        buttonList = buttons;
    }

    public boolean get() {
        for (Button button : buttonList) {
            if (!button.get()) {
                return false;
            }
        }
        return true;
    }
}
