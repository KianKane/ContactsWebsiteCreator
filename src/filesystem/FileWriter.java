package filesystem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

/**
 * Writes files to the disk
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public class FileWriter implements IFileWriter
{
    @Override public File writeFile(String fullPath, String content)
    {
        try
        {
            File file = new File(fullPath);
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
            return file;
        }
        catch (IOException e)
        {
            System.out.println("Unable to write file " + fullPath + ": " + e.getMessage());
            return null;
        }
    }

    @Override public void copyFile(String fromPath, String toPath)
    {
        try
        {
            File source = new File(fromPath);
            File target = new File(toPath);
            Files.copy(source.toPath(), target.toPath());
        }
        catch (IOException e)
        {
            System.out.println("Unable to copy file from " + fromPath + " to " + toPath + ": " + e.getMessage());
        }
    }
}
