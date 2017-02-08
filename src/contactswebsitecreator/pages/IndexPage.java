package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import filesystem.FileWriter;
import html.HTML;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Generates an index page which lists and links to a number of contacts
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public class IndexPage extends Page
{
    private final ArrayList<Contact> contacts;
    
    /** Constructor
     * @param path The path to the folder to be used
     * @param contacts The list of contacts for the index page to link to */
    public IndexPage(String path, ArrayList<Contact> contacts)
    {
        super(path + "/index.html");
        this.contacts = contacts;
    }

    @Override public void generatePage()
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
        
        try
        {
            FileWriter.writeFile(path, content);
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create index page: " + e.getMessage());
        }
    }
}
