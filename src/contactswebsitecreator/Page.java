package contactswebsitecreator;

import java.io.File;
import java.io.IOException;

/**
 * A base HTML page
 * 
 * @author Kian Kane
 * @version 02/02/2017
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
    
    /** Returns the opening part of a HTML skeleton up until the body
     * @param title The page title
     * @return Returns the opening part of a HTML skeleton up until the body */
    protected String getOpenSkeleton(String title)
    {
        String output = "";
        output += "<!DOCTYPE html>\n";
        output += "<html>\n";
        output += "<head>\n";
        output += "<title>" + title + "</title>\n";
        output += "</head>\n";
        output += "<body>\n";
        return output;
    }
    
    /** Returns the closing part of a HTML skeleton from the body to the end of the file
     * @return Returns the closing part of a HTML skeleton from the body to the end of the file */
    protected String getCloseSkeleton()
    {
        String output = "";
        output += "</body>\n";
        output += "<html>\n";
        return output;
    }
}
