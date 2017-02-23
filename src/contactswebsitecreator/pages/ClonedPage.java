package contactswebsitecreator.pages;

import filesystem.IFileWriter;

/**
 * Generates a file by copying another file from a specified location
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public class ClonedPage extends Page
{
    private final String sourceFullPath;
    
    /** Constructor
     * @param destinationFullPath The path to the destination file to be produced
     * @param sourceFullPath The path of the source file to be copied from
     * @param fileWriter The instance of an IFileWriter to use when generating files */
    public ClonedPage(String destinationFullPath, String sourceFullPath, IFileWriter fileWriter)
    {
        super(destinationFullPath, fileWriter);
        this.sourceFullPath = sourceFullPath;
    }

    @Override public void generatePage()
    {
        fileWriter.copyFile(sourceFullPath, path);
    }
}
