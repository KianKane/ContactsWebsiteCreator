package contactswebsitecreator;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Provides some useful methods for dealing with folders
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class FolderUtilities
{
    public static void createFolders(String path)
    {
        File directory = new File(path);
        directory.mkdirs();
    }
    
    public static void clearFolder(String path)
    {
        File directory = new File(path);
        for (File file: directory.listFiles())
        {
            file.delete();
        }
    }
    
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
