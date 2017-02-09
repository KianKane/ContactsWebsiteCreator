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
            contactsHTML += 
                    HTML.tr(
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", Integer.toString(contact.id))) +
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", contact.forename)) +
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", contact.surname)));
        }
        
        String content = 
                HTML.doctype() + 
                HTML.html(
                        HTML.head(
                                HTML.title("All Contacts") +
                                HTML.stylesheet("style.css")) +
                        HTML.body(
                                HTML.h1("All Contacts") +
                                HTML.inputText() +
                                HTML.table(
                                        HTML.tr(HTML.th("Contact ID") + HTML.th("Forename") + HTML.th("Surname")) +
                                        contactsHTML) +
                                HTML.script("script.js")));
        
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
