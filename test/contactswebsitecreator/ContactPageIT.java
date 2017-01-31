package contactswebsitecreator;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integration testing the ContactPage class
 * 
 * @author Kian Kane
 * @version 30/01/2017
 */
public class ContactPageIT
{
    /** Test of createFile method, of class ContactPage.*/
    @Test public void testCreateFile()
    {
        System.out.println("createFile");

        String path = System.getProperty("user.dir");
        
        // Create a sample contact
        Contact contact = new Contact(0, "John", "Smith", "j.smith@isp.co.uk", "000.000.0000");
        
        // Create page
        ContactPage contactPage = new ContactPage(path, contact);
        File file = contactPage.createFile();
     
        // Ensure createFile returned something
        assertNotEquals(null, file);
        
        // Ensure file exists
        File findFile = new File(path + "/0.html");
        assertEquals(file, findFile);
        
        // Clean up file
        file.delete();
    }
}
