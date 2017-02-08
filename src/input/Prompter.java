package input;

import javax.swing.JOptionPane;

/**
 * Used prompt for user input
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public class Prompter
{
    public static boolean YesNo(String message, String title)
    {
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        return (reply == JOptionPane.YES_OPTION);
    }
}
