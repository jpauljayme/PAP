package pap.util;

import javax.swing.JOptionPane;

/**
 * Methods for displaying warning to user.
 *
 * @author John Paul Jayme jpaul.jayme.com
 */
public class Warning {

    /**
     * Display message dialog with info to user.
     *
     * @author John Paul Jayme jpaul.jayme.com
     * 
     * @param infoMessage the message to be displayed
     * @param titleBar the title of the box
     */
    
    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage,
                titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Displays confirm box to user.
     *
     * @author John Paul Jayme jpaul.jayme.com
     * 
     * @param message The message to be displayed.
     */
    public static int confirmBox(String message) {
        return JOptionPane.showConfirmDialog(null, message);
    }
}
