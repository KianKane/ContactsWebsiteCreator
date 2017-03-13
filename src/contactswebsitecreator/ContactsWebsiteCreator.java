package contactswebsitecreator;

import contactswebsitecreator.pages.HtmlPage;
import contactswebsitecreator.pages.Page;
import contactswebsitecreator.pages.PageFactory;
import filesystem.FolderUtilities;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Acts as the primary program starting point
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class ContactsWebsiteCreator
{
    private final String path;
    private final HtmlPage indexPage;
    private final HtmlPage[] contactPages;
    private final Page[] additionalPages;
    private final HashMap<Integer, HtmlPage> contactsHashMap;
    
    /** Constructor
     * @param path Path to the folder the contacts will be stored in
     * @param host Database host
     * @param user Database username
     * @param pass Database password */
    public ContactsWebsiteCreator(String path, String host, String user, String pass)
    {
        this.path = path;
        
        // Load from database
        ContactDataSet dataSet = new ContactDataSet();
        dataSet.loadFromDatabase(host, user, pass);
        
        // Generate page files
        PageFactory factory = new PageFactory(path);
        indexPage = factory.getIndexPage(dataSet.contacts);
        contactPages = new HtmlPage[dataSet.contacts.size()];
        contactsHashMap = new HashMap();
        for (int i = 0; i < dataSet.contacts.size(); i++)
        {
            contactPages[i] = factory.getContactPage(dataSet.contacts.get(i));
            contactsHashMap.put(dataSet.contacts.get(i).id, contactPages[i]);
        }
        additionalPages = new Page[]{
            factory.getStylePage(System.getProperty("user.dir") + "/style.css"),
            factory.getScriptPage(System.getProperty("user.dir") + "/script.js")};
    }
    
    /** Prints the raw data from the index page */
    public void displayIndexRaw()
    {
        System.out.println(indexPage.getRaw());
    }
    
    /** Prints the HTML for the index page */
    public void displayIndexHtml()
    {
        System.out.println(indexPage.getHtml());
    }
    
    /** Prints the raw data from a specific contact page 
     * @param id The ID of the contact page to print from */
    public void displayContactRaw(int id)
    {
        HtmlPage contactPage = contactsHashMap.get(id);
        if (contactPage == null)
            System.out.println("No contact with that id exists\n");
        else
            System.out.println(contactPage.getRaw());
    }
    
    /** Prints the HTML for a specific contact page 
     * @param id The ID of the contact page to print from */
    public void displayContactHtml(int id)
    {
        HtmlPage contactPage = contactsHashMap.get(id);
        if (contactPage == null)
            System.out.println("No contact with that id exists\n");
        else
            System.out.println(contactPage.getHtml());
    }
    
    /** Sets the user content of the index page
     * @param userContent The user content to set for the index page */
    public void setIndexUserContent(String userContent)
    {
        indexPage.setUserContent(userContent);
    }
    
    /** Sets the user content of a specified contact page
     * @param userContent The user content to set for the specified contact page
     * @param id The ID of the contact page to modify */
    public void setContactUserContent(String userContent, int id)
    {
        HtmlPage contactPage = contactsHashMap.get(id);
        if (contactPage == null)
            System.out.println("No contact with that id exists\n");
        else
            contactPage.setUserContent(userContent);
    }
    
    /** Generates files for all of the pages */
    public void generateFiles()
    {
        FolderUtilities.createFolders(path);
        FolderUtilities.clearFolder(path);
        FolderUtilities.createFolders(path + "/individualContacts");
        FolderUtilities.clearFolder(path + "/individualContacts");
        
        indexPage.generatePage();
        for (Page contactPage : contactPages)
            contactPage.generatePage();
        for (Page page : additionalPages)
            page.generatePage();
        
        FolderUtilities.openFolder(path);
    }
    
    /** Returns true if the given contact ID exists
     * @param id The ID of the contact you want to check for
     * @return True if the given contact ID exists */
    public boolean contactExists(int id)
    {
        return contactsHashMap.containsKey(id);
    }
    
    /** Returns a list of all of the contact IDs
     * @return A list of all of the contact IDs */
    public ArrayList<Integer> getAllContactIDs()
    {
        return new ArrayList<Integer>(contactsHashMap.keySet());
    }
}
