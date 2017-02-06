package contactswebsitecreator;

import java.io.File;
import java.io.IOException;

/**
 * A HTML contact page
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class ContactPage implements IPage
{
    private final String path;
    private final Contact contact;
    
    public ContactPage(String path, Contact contact)
    {
        this.path = path;
        this.contact = contact;
    }

    @Override public File createFile() throws IOException
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

            return FileWriter.writeFile(path + "/" + contact.id + ".html", content);
    }
}
