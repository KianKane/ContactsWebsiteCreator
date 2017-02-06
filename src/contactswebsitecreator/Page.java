package contactswebsitecreator;

import java.io.File;
import java.io.IOException;

/**
 * A base HTML page
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public abstract class Page
{
    protected String path;
    
    /** Constructor
     * @param path The path at which the file will be created (without filename and extension) */
    public Page(String path)
    {
        this.path = path;
    }
    
    /** Create the HTML file for this page
     * @return Returns true if the file was successfully created
     * @throws java.io.IOException when the file cannot be properly created */
    public abstract File createFile() throws IOException;
}
