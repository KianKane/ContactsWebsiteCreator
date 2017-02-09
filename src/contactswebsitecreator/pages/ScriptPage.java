package contactswebsitecreator.pages;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Generates a JavaScript file by copying the script file stored with the program
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public class ScriptPage extends Page
{
    private final String sourceFullPath;
    
    /** Constructor
     * @param path The path to the folder to be used
     * @param sourceFullPath The path of the source script file to use */
    public ScriptPage(String path, String sourceFullPath)
    {
        super(path + "/script.js");
        this.sourceFullPath = sourceFullPath;
    }

    @Override public void generatePage()
    {
        try
        {
            File source = new File(sourceFullPath);
            File target = new File(path);
            Files.copy(source.toPath(), target.toPath());
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create script file: " + e.getMessage());
        }
    }
}
