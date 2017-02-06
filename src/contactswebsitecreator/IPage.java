package contactswebsitecreator;

import java.io.File;
import java.io.IOException;

/**
 * An interface that defines how pages are created
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public interface IPage
{
    /** Create and write to disk the HTML file for this page
     * @return Returns the generated file
     * @throws java.io.IOException when the file cannot be properly created */
    public File createFile() throws IOException;
}
