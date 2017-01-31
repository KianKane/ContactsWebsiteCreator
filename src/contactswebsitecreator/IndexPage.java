package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * A HTML index page
 * 
 * @author Kian Kane
 * @version 30/01/2017
 */
public class IndexPage extends Page
{
    private final ArrayList<Contact> contacts;
    
    public IndexPage(String path, ArrayList<Contact> contacts)
    {
        super(path);
        this.contacts = contacts;
    }

    @Override public File createFile()
    {
        try
        {
            File file = new File(path + "/index.html");
            PrintWriter writer = new PrintWriter(file);
            writer.println(getOpenSkeleton("All Contacts"));
            writer.println("<h1>All Contacts</h1>");
            for (Contact contact : contacts)
            {
                writer.println("<a href='" + + contact.id + ".html'>" + contact.id + " " + contact.forename + " " + contact.surname + "</a><br>");
            }
            writer.println(getCloseSkeleton());
            writer.close();
            return file;
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
