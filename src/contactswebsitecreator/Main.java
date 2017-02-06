package contactswebsitecreator;

/**
 * Program starting point
 * 
 * @author Kian Kane
 * @version 06/02/2017
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
        dataSet.loadFromDatabase(host, user, pass);
        
        // Ensure directory exists and clear files currently present
        FolderUtilities.createFolders(path);
        FolderUtilities.clearFolder(path);
        
        // Create files
        PageFactory creator = new PageFactory(path);
        creator.createIndexPage(dataSet.contacts);
        for (Contact contact : dataSet.contacts)
        {
            creator.createContactPage(contact);
        }

        // Open folder
        FolderUtilities.openFolder(path);
    }
}
