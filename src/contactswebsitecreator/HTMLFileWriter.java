package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Writes HTML files to the disk
 * 
 * @author Kian Kane
 * @version 02/02/2017
 */
public class HTMLFileWriter
{
    public static File writeFile(String fullPath, String title, String content) throws IOException
    {
        File file = new File(fullPath);
        PrintWriter writer = new PrintWriter(file);
        String output = "";
        output += "<!DOCTYPE html>\n";
        output += "<html>\n";
        output += "<head>\n";
        output += "<title>" + title + "</title>\n";
        output += "</head>\n";
        output += "<body>\n";
        output += content;
        output += "</body>\n";
        output += "<html>\n";
        writer.write(output);
        return file;
    }
}
