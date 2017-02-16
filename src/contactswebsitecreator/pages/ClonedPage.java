package contactswebsitecreator.pages;

import filesystem.FileWriter;

/**
 * Generates a file by copying another file from a specified location
 * 
 * @author Kian Kane
 * @version 16/02/2017
 */
public class ClonedPage extends Page
{
    private final String sourceFullPath;
    
    /** Constructor
     * @param destinationFullPath The path to the destination file to be produced
     * @param sourceFullPath The path of the source file to be copied from */
    public ClonedPage(String destinationFullPath, String sourceFullPath)
    {
        super(destinationFullPath);
        this.sourceFullPath = sourceFullPath;
    }

    @Override public void generatePage()
    {
        FileWriter.copyFile(sourceFullPath, path);
    }
}
