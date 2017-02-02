package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A HTML contact page
 * 
 * @author Kian Kane
 * @version 02/02/2017
 */
public class ContactPage extends Page
{
    private final Contact contact;
    
    public ContactPage(String path, Contact contact)
    {
        super(path);
        this.contact = contact;
    }

    @Override public File createFile()
    {
            String content = "<h1>" + contact.forename + " " + contact.surname + "</h1>\n";
            content += "<h1>" + contact.forename + " " + contact.surname + "</h1>";
            content += "<p>" + "Contact ID: " + contact.id + "</p>";
            content += "<p>" + "Full Name: " + contact.forename + " " + contact.surname + "</p>";
            content += "<p>" + "Email Address: " + contact.email + "</p>";
            content += "<p>" + "Phone Number: " + contact.phone + "</p>";
            content += "<a href='index.html'><-- Go Back</a>";
            return HTMLFileWriter.writeFile(path + "/" + contact.id + ".html", contact.forename + " " + contact.surname, content);
    }
}
