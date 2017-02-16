package filesystem;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Provides some useful methods for dealing with folders
 * 
 * @author Kian Kane
 * @version 16/02/2017
 */
public class FolderUtilities
{
    /** Creates folders to the specified path if they do not already exist
     * @param path The path of the folder to create */
    public static void createFolders(String path)
    {
        File directory = new File(path);
        if (!directory.exists())
            directory.mkdirs();
    }
    
    /** Deletes files stored within the specified folder
     * @param path The path of the folder to clear */
    public static void clearFolder(String path)
    {
        File directory = new File(path);
        if (directory.list().length > 0)
        {
            int reply = JOptionPane.showConfirmDialog(null, path + " directory contains files, delete files from directory?", "Clear Directory", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION)
            {
                for (File file: directory.listFiles())
                {
                    file.delete();
                }
            }
        }
    }
    
    /** Open the specified folder in the explorer
     * @param path The path of the folder to open */
    public static void openFolder(String path)
    {
        try
        {
            Desktop.getDesktop().open(new File(path));
        }
        catch (IOException e)
        {
            System.err.println("Unable to open folder: " + e.getMessage());
        }
    }
}
