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
    /** Writes a HTML file to disk
     * @param fullPath Full path including filename and extention
     * @param title HTML title for the page
     * @param content HTML content (inside the <body> tags)
     * @return Returns the created file
     * @throws java.io.IOException when the PrintWriter fails to correctly save the file */
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
