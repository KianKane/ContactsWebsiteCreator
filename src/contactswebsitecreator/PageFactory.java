package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Creates HTML pages and uses the FileWriter to write them to disk
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class PageFactory
{
    private final String path;
    
    public PageFactory(String path)
    {
        this.path = path;
    }
    
    public void createIndexPage(ArrayList<Contact> contacts)
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
            FileWriter.writeFile(path + "/index.html", content);
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create index page: " + e.getMessage());
        }
    }
    
    public void createContactPage(Contact contact)
    {
        String content = 
                    HTML.doctype() + 
                    HTML.html(
                            HTML.head(HTML.title(contact.forename + " " + contact.surname)) + 
                            HTML.body(
                                    HTML.h1(contact.forename + " " + contact.surname) + 
                                    HTML.p("Contact ID: " + contact.id) +
                                    HTML.p("Full Name: " + contact.forename + " " + contact.surname) +
                                    HTML.p("Email Address: " + contact.email) +
                                    HTML.p("Phone Number: " + contact.phone) +
                                    HTML.a("index.html", "<-- Go Back")));
        try
        {
            FileWriter.writeFile(path + "/" + contact.id + ".html", content);
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create contact page (Contact ID: " + contact.id + "): " + e.getMessage());
        }
    }
}
