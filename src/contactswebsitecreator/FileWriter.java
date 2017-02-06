package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Writes files to the disk
 * 
 * @author Kian Kane
 * @version 06/02/2017
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
}
