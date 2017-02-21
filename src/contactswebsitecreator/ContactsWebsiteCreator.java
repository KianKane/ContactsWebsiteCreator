package contactswebsitecreator;

import contactswebsitecreator.pages.HtmlPage;
import contactswebsitecreator.pages.Page;
import contactswebsitecreator.pages.PageFactory;
import filesystem.FolderUtilities;

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
        for (int i = 0; i < dataSet.contacts.size(); i++)
        {
            contactPages[i] = factory.getContactPage(dataSet.contacts.get(i));
        }
        additionalPages = new Page[]{
            factory.getStylePage(System.getProperty("user.dir") + "/style.css"),
            factory.getScriptPage(System.getProperty("user.dir") + "/script.js")};
    }
    
    /** Generates files for all of the pages */
    public void generateFiles()
    {
        FolderUtilities.createFolders(path);
        FolderUtilities.createFolders(path + "/individualContacts");
        FolderUtilities.clearFolder(path);
        FolderUtilities.clearFolder(path + "/individualContacts");
        
        indexPage.generatePage();
        for (Page contactPage : contactPages)
            contactPage.generatePage();
        for (Page page : additionalPages)
            page.generatePage();
        
        FolderUtilities.openFolder(path);
    }
}
