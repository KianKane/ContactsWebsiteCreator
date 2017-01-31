package contactswebsitecreator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A HTML contact page
 * 
 * @author Kian Kane
 * @version 30/01/2017
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
        try
        {
            File file = new File(path + "/" + contact.id + ".html");
            PrintWriter writer = new PrintWriter(file);
            writer.println(getOpenSkeleton(contact.forename + " " + contact.surname));
            writer.println("<h1>" + contact.forename + " " + contact.surname + "</h1>");
            writer.println("<p>" + "Contact ID: " + contact.id + "</p>");
            writer.println("<p>" + "Full Name: " + contact.forename + " " + contact.surname + "</p>");
            writer.println("<p>" + "Email Address: " + contact.email + "</p>");
            writer.println("<p>" + "Phone Number: " + contact.phone + "</p>");
            writer.println("<a href='index.html'><-- Go Back</a>");
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
