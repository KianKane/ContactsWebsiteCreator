package filesystem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 * Writes files to the disk
 * 
 * @author Kian Kane
 * @version 16/02/2017
 */
public class FileWriter
{
    /** Writes a file to disk
     * @param fullPath Full path including filename and extention
     * @param content The contents of the file
     * @return Returns the created file
     * @throws java.io.IOException when the PrintWriter fails to correctly save the file */
    public static File writeFile(String fullPath, String content) throws IOException
    {
        File file = new File(fullPath);
        PrintWriter writer = new PrintWriter(file);
        writer.write(content);
        writer.close();
        return file;
    }
    
    /** Copy the specified file to the specified location
     * @param fromPath The path of the file to copy from
     * @param toPath The path of the file to copy to */
    public static void copyFile(String fromPath, String toPath)
    {
        try
        {
            File source = new File(fromPath);
            File target = new File(toPath);
            Files.copy(source.toPath(), target.toPath());
        }
        catch (IOException e)
        {
            System.out.println ("Unable to copy file from " + fromPath + " to " + toPath + ": " + e.getMessage());
        }
    }
}
