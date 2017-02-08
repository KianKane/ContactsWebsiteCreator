package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import filesystem.FileWriter;
import html.HTML;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Generates a CSS style page by copying the style page stored with the program
 * 
 * @author Kian Kane
 * @version 08/02/2017
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
        try
        {
            File source = new File(sourceFullPath);
            File target = new File(path);
            Files.copy(source.toPath(), target.toPath());
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create style page: " + e.getMessage());
        }
    }
}
