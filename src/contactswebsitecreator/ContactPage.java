package contactswebsitecreator;

import java.io.IOException;

/**
 * Generates a contact page for a specific contact
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public class ContactPage extends Page
{
    private final Contact contact;

    /** Constructor
     * @param path The path to the folder to be used
     * @param contact The contact to describe in the page */
    public ContactPage(String path, Contact contact)
    {
        super(path + "/" + contact.id + ".html");
        this.contact = contact;
    }

    @Override public void generatePage()
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
            FileWriter.writeFile(path, content);
        }
        catch (IOException e)
        {
            System.out.println ("Unable to create contact page (Contact ID: " + contact.id + "): " + e.getMessage());
        }
    }  
}
