package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A HTML index page
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class IndexPage implements IPage
{
    private final String path;
    private final ArrayList<Contact> contacts;
    
    public IndexPage(String path, ArrayList<Contact> contacts)
    {
        this.path = path;
        this.contacts = contacts;
    }

    @Override public File createFile() throws IOException
    {
        String contactsHTML = "";
        for (Contact contact : contacts)
        {
            contactsHTML += HTML.a(contact.id + ".html", contact.id + " " + contact.forename + " " + contact.surname) + HTML.br();
        }
        
        String content = 
                HTML.doctype() + 
                HTML.html(
                        HTML.head(HTML.title("All Contacts")) + 
                        HTML.body(contactsHTML));
        
        return FileWriter.writeFile(path + "/index.html", content);
    }
}
