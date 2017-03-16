package contactswebsitecreator.acceptancetesting;

import contactswebsitecreator.ContactsWebsiteCreator;

/**
 * This acceptance test covers all the original use case requirements.
 * <br><br>
 * Note that these tests do not go through the console interface and instead
 * go directly through a given instance of ContactsWebsiteCreator.
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class ContactsWebsiteCreatorAcceptanceTests
{
    /** Run all tests acceptance tests on this class
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void runAllTests(ContactsWebsiteCreator cwc)
    {
        System.out.println("Run All Tests");
        testSetUserContent(cwc);
        testDisplayRaw(cwc);
        testDisplayHtml(cwc);
        testGenerate(cwc);
    }
    
    /** Ensures that the program can allow descriptive information to be added 
     * to the index page and to individual contact pages as specified by the
     * requirements of the project.
     * <br><br>
     * This test adds the following descriptive text to the index page:
     * "Index user content".<br>
     * And the following descriptive text to each contact page:
     * "Contact {id} user content".<br>
     * 
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void testSetUserContent(ContactsWebsiteCreator cwc)
    {
        System.out.println("Test Set User Content");
        cwc.setIndexUserContent("Index user content");
        for(Integer i : cwc.getAllContactIDs())
        {
            cwc.setContactUserContent("Contact " + i + " user content", i);
        }
    }
    
    /** Ensures that the program can display the raw contact data both for all 
     * contacts and for specific individual contacts in the console window as 
     * specified by the requirements of the project.
     * <br><br>
     * This test displays the index page raw data (which should be a list of all contact data) 
     * and then loops through all existing contact pages and displays the raw data for each of them.
     * 
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void testDisplayRaw(ContactsWebsiteCreator cwc)
    {
        System.out.println("Test Display Raw");
        cwc.displayIndexRaw();
        for(Integer i : cwc.getAllContactIDs())
        {
            cwc.displayContactRaw(i);
        }
    }
    
    /** Ensures that the program can display the HTML content of contact pages
     * in the console window as specified by the requirements of the project.
     * <br><br>
     * This test displays the index page HTML and then loops through all  
     * existing contact pages and displays the HTML for each of them.
     * 
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void testDisplayHtml(ContactsWebsiteCreator cwc)
    {
        System.out.println("Test Display HTML");
        cwc.displayIndexHtml();
        for(Integer i : cwc.getAllContactIDs())
        {
            cwc.displayContactHtml(i);
        }
    }

    /** Ensures that the program can generate the required pages as specified
     * by the requirements of the project.
     * <br><br>
     * This test should generate the required files and open them in windows explorer.
     * 
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void testGenerate(ContactsWebsiteCreator cwc)
    {
        System.out.println("Test Generate");
        cwc.generateFiles();
    }
}
