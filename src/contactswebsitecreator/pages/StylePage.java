package contactswebsitecreator.pages;

import filesystem.FolderUtilities;

/**
 * Generates a CSS style page by copying the style page stored with the program
 * 
 * @author Kian Kane
 * @version 09/02/2017
 */
public class StylePage extends Page
{
    private final String sourceFullPath;
    
    /** Constructor
     * @param path The path to the folder to be used
     * @param sourceFullPath The path of the source style sheet to use */
    public StylePage(String path, String sourceFullPath)
    {
        super(path + "/style.css");
        this.sourceFullPath = sourceFullPath;
    }

    @Override public void generatePage()
    {
        FolderUtilities.copyFile(sourceFullPath, path);
    }
}
