package contactswebsitecreator;

/**
 * Program starting point
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class Main
{
    /** Program starting point
     * @param args the command line arguments */
    public static void main(String[] args)
    {
        String path = System.getProperty("user.home") + "/desktop/contacts";
        String host = "jdbc:oracle:thin:@//10.1.9.106:1521/sw2";
        String user = "kian";
        String pass = "password";
        
        ContactsWebsiteCreator cwc = new ContactsWebsiteCreator(path, host, user, pass);
        cwc.generateFiles();
    }
}
