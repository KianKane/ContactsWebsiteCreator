package contactswebsitecreator;

/**
 * A base page class
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public abstract class Page
{

    /** The path to where the page should be placed (will be used as the full path including filename by child classes) */
    protected final String path;
    
    /** Constructor
     * @param path The path to where the page should be placed */
    public Page(String path)
    {
        this.path = path;
    }
    
    /** Generate the page and write it to the file system at the designated path */
    public abstract void generatePage();
}
