package mocks;

import filesystem.IFileWriter;
import java.io.File;

/**
 * A mock class implementing the IFileWriter interface
 * 
 * @author Kian Kane
 * @version 23/03/2017
 */
public class FileWriterMock implements IFileWriter
{
    public String output;

    public FileWriterMock()
    {
        output = "";
    }

    @Override public File writeFile(String fullPath, String content)
    {
        output = fullPath + " " + content;
        return null;
    }

    @Override public void copyFile(String fromPath, String toPath)
    {
        output = fromPath + " " + toPath;
    }
}
