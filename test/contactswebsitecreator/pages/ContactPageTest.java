package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import mocks.FileWriterMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the ContactPage class
 * 
 * @author Kian Kane
 * @version 16/03/2017
 */
public class ContactPageTest
{
    ContactPage contactPage;
    FileWriterMock fileWriterMock;
    
    /** Executes before every test. */
    @Before public void setUp()
    {
        String path = "C:/Sample/Path";
        Contact contact = new Contact(1, "John", "Smith", "j.smith@email.com", "111.111.1111");
        fileWriterMock = new FileWriterMock();
        contactPage = new ContactPage(path, contact, fileWriterMock);
    }
    
    /** Executes after every test. */
    @After public void tearDown()
    {
        contactPage = null;
        fileWriterMock = null;
    }

    /** Test of getRaw method, of class IndexPage. */
    @Test public void testGetRaw()
    {
        System.out.println("ContactPageTest.testGetRaw()");
        String expResult = "Contact 1 | Name: John Smith | Email: j.smith@email.com | Phone: 111.111.1111";
        String result = contactPage.getRaw().replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of getHtml method, of class IndexPage. */
    @Test public void testGetHtml()
    {
        System.out.println("IndexPageTest.testGetHtml()");
        String expResult = 
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>John Smith</title>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"../style.css\">" +
                "</head>" +
                "<body>" +
                "<h1>John Smith</h1>" +
                "<p>Contact ID: 1</p>" +
                "<p>Full Name: John Smith</p>" +
                "<p>Email Address: j.smith@email.com</p>" +
                "<p>Phone Number: 111.111.1111</p>" +
                "<p></p>" +
                "<a href=\"../index.html\"><-- Go Back</a></body>" +
                "</html>";
        String result = contactPage.getHtml().replace("\n", "");
        assertEquals(expResult, result);
    }
    
    /** Test of generatePage method, of class IndexPage. */
    @Test public void testGeneratePage()
    {
        System.out.println("IndexPageTest.testGeneratePage()");
        String expResult = 
                "C:/Sample/Path/individualContacts/1.html " +
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>John Smith</title>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"../style.css\">" +
                "</head>" +
                "<body>" +
                "<h1>John Smith</h1>" +
                "<p>Contact ID: 1</p>" +
                "<p>Full Name: John Smith</p>" +
                "<p>Email Address: j.smith@email.com</p>" +
                "<p>Phone Number: 111.111.1111</p>" +
                "<p></p>" +
                "<a href=\"../index.html\"><-- Go Back</a></body>" +
                "</html>";
        contactPage.generatePage();
        String result = fileWriterMock.output.replace("\n", "");
        assertEquals(expResult, result);
    }
}
