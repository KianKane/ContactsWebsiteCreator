package contactswebsitecreator.pages;

import filesystem.IFileWriter;

/**
 * A base page class
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public abstract class Page
{

    /** The path to where the page should be placed (will be used as the full path including filename by child classes) */
    protected final String path;
    /** The instance of an IFileWriter to use when generating files */
    protected final IFileWriter fileWriter;
    
    /** Constructor
     * @param path The path to where the page should be placed
     * @param fileWriter The instance of an IFileWriter to use when generating files */
    public Page(String path, IFileWriter fileWriter)
    {
        this.path = path;
        this.fileWriter = fileWriter;
    }
    
    /** Generate the page and write it to the file system at the designated path */
    public abstract void generatePage();
}
