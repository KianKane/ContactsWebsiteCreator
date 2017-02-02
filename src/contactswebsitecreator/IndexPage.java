package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * A HTML index page
 * 
 * @author Kian Kane
 * @version 02/02/2017
 */
public class IndexPage extends Page
{
    private final ArrayList<Contact> contacts;
    
    public IndexPage(String path, ArrayList<Contact> contacts)
    {
        super(path);
        this.contacts = contacts;
    }

    @Override public File createFile() throws IOException
    {
        String content = "<h1>All Contacts</h1>\n";
        for (Contact contact : contacts)
        {
            content += "<a href='" + + contact.id + ".html'>" + contact.id + " " + contact.forename + " " + contact.surname + "</a><br>";
        }
        return HTMLFileWriter.writeFile(path + "/index.html", "All Contacts", content);
    }
}
