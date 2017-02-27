package contactswebsitecreator.acceptancetesting;

import contactswebsitecreator.ContactsWebsiteCreator;

/**
 * AcceptanceTesting covering all of the use cases
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class ContactsWebsiteCreatorAcceptanceTests
{
    /** Run all tests
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void runAllTests(ContactsWebsiteCreator cwc)
    {
        System.out.println("Run All Tests");
        testSetUserContent(cwc);
        testDisplayRaw(cwc);
        testDisplayHtml(cwc);
        testGenerate(cwc);
    }
    
    /** Sets the user content on all pages
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
    
    /** Displays the raw information for all pages
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
    
    /** Displays the HTML for all pages
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

    /** Generates files
     * @param cwc ContactsWebsiteCreator instance to use */
    public static void testGenerate(ContactsWebsiteCreator cwc)
    {
        System.out.println("Test Generate");
        cwc.generateFiles();
    }
}
