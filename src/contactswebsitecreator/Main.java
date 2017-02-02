package contactswebsitecreator;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program starting point
 * 
 * @author Kian Kane
 * @version 02/02/2017
 */
public class Main
{
    /** Program starting point
     * @param args the command line arguments */
    public static void main(String[] args)
    {
        String host = "jdbc:oracle:thin:@//10.1.9.106:1521/sw2";
        String user = "kian";
        String pass = "password";
        String path = System.getProperty("user.home") + "/desktop/contacts";
        
        // Load from database
        ContactDataSet dataSet = new ContactDataSet();
        if (!dataSet.loadFromDatabase(host, user, pass))
        {
            System.err.println("Failed to load contacts from database");
            return;
        }
        
        // Ensure directory exists and clear files currently present
        File dir = new File(path);
        dir.mkdirs();
        for (File file: dir.listFiles())
        {
            file.delete();
        }
        
        // Create files
        IndexPage indexPage = new IndexPage(path, dataSet.contacts);
        try {
            indexPage.createFile();
        } catch (IOException e) {
            System.out.println ("Unable to create index page: " + e.getMessage());
        }
        for (Contact contact : dataSet.contacts)
        {
            ContactPage contactPage = new ContactPage(path, contact);
            try {
                contactPage.createFile();
            } catch (IOException e) {
                System.out.println ("Unable to create contact page (Contact ID: " + contact.id + "): " + e.getMessage());
            }
        }

        // Open folder
        try
        {
            Desktop.getDesktop().open(new File(path));
        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }
    }
}
