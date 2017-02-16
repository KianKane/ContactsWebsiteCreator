package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import java.util.ArrayList;

/**
 * Creates HTML pages and uses the FileWriter to write them to disk
 * 
 * @author Kian Kane
 * @version 16/02/2017
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
    
    /** Creates and returns a style page
     * @param sourceFullPath The path of the source style sheet to use
     * @return A style page as a Page */
    public Page getStylePage(String sourceFullPath)
    {
        return (Page)new ClonedPage(path + "/style.css", sourceFullPath);
    }
    
    /** Creates and returns a script page
     * @param sourceFullPath The path of the source script file to use
     * @return A script page as a Page */
    public Page getScriptPage(String sourceFullPath)
    {
        return (Page)new ClonedPage(path + "/script.js", sourceFullPath);
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
