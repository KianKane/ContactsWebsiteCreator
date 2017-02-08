package contactswebsitecreator;

import java.util.ArrayList;

/**
 * Creates HTML pages and uses the FileWriter to write them to disk
 * 
 * @author Kian Kane
 * @version 08/02/2017
 */
public class PageFactory
{
    private final String path;
    
    /** Constructor
     * @param path The path to the contacts folder */
    public PageFactory(String path)
    {
        this.path = path;
    }
    
    /** Creates and returns an index page
     * @param contacts The list of contacts for the index page to link to
     * @return An IndexPage as a Page */
    public Page getIndexPage(ArrayList<Contact> contacts)
    {
        return (Page)new IndexPage(path, contacts);
    }
    
    /** Creates and returns a contact page
     * @param contact The contact to describe in the page
     * @return A ContactPage as a Page */
    public Page getContactPage(Contact contact)
    {
        return (Page)new ContactPage(path, contact);
    }
}
