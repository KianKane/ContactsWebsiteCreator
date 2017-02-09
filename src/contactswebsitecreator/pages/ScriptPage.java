package contactswebsitecreator.pages;

import filesystem.FolderUtilities;

/**
 * Generates a JavaScript file by copying the script file stored with the program
 * 
 * @author Kian Kane
 * @version 09/02/2017
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
        FolderUtilities.copyFile(sourceFullPath, path);
    }
}
