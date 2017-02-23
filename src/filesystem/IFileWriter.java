package filesystem;

import java.io.File;

/**
 * Defines how a file writer should behave
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public interface IFileWriter
{
    /** Writes a file to disk
     * @param fullPath Full path including filename and extention
     * @param content The contents of the file
     * @return Returns the created file */
    public File writeFile(String fullPath, String content);
    
    /** Copy the specified file to the specified location
     * @param fromPath The path of the file to copy from
     * @param toPath The path of the file to copy to */
    public void copyFile(String fromPath, String toPath);
}
