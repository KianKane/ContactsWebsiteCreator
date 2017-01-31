package contactswebsitecreator;

import java.io.File;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integration testing the IndexPage class
 * 
 * @author Kian Kane
 * @version 30/01/2017
 */
public class IndexPageIT
{
    /** Test of createFile method, of class IndexPage. */
    @Test public void testCreateFile()
    {
        System.out.println("createFile");

        String path = System.getProperty("user.dir");
        
        // Create and fill a sample contacts array list
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(0, "John", "Smith", "j.smith@isp.co.uk", "000.000.0000"));
        contacts.add(new Contact(0, "Jane", "Doe",   "j.doe@isp.co.uk",   "000.000.0000"));
        contacts.add(new Contact(0, "Mark", "Green", "m.green@isp.co.uk", "000.000.0000"));
        
        // Create page
        IndexPage indexPage = new IndexPage(path, contacts);
        File file = indexPage.createFile();
     
        // Ensure createFile returned something
        assertNotEquals(null, file);
        
        // Ensure file exists
        File findFile = new File(path + "/index.html");
        assertEquals(file, findFile);
        
        // Clean up file
        file.delete();
    }
}
