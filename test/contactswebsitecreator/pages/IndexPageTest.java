package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import java.util.ArrayList;
import mocks.FileWriterMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the IndexPage class
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public class IndexPageTest
{
    IndexPage indexPage;
    FileWriterMock fileWriterMock;
    
    @Before public void setUp()
    {
        String path = "C:/Sample/Path";
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "John", "Smith", "j.smith@email.com", "111.111.1111"));
        contacts.add(new Contact(2, "Mary", "Jane", "m.jane@email.com", "222.222.2222"));
        contacts.add(new Contact(3, "William", "Jones", "w.jones@email.com", "333.333.3333"));
        fileWriterMock = new FileWriterMock();
        indexPage = new IndexPage(path, contacts, fileWriterMock);
    }
    
    @After public void tearDown()
    {
        indexPage = null;
        fileWriterMock = null;
    }

    /** Test of getRaw method, of class IndexPage. */
    @Test public void testGetRaw()
    {
        System.out.println("IndexPageTest.testGetRaw()");
        String expResult = 
                "Contact 1 | Name: John Smith | Email: j.smith@email.com | Phone: 111.111.1111" +
                "Contact 2 | Name: Mary Jane | Email: m.jane@email.com | Phone: 222.222.2222" +
                "Contact 3 | Name: William Jones | Email: w.jones@email.com | Phone: 333.333.3333";
        String result = indexPage.getRaw().replace("\n", "");
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
                "<title>All Contacts</title>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">" +
                "</head>" +
                "<body>" +
                "<h1>All Contacts</h1>" +
                "<input type=\"text\"></input>" +
                "<table>" +
                "<tr>" +
                "<th>Contact ID</th>" +
                "<th>Forename</th>" +
                "<th>Surname</th>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/1.html\">1</a></td>" +
                "<td><a href=\"individualContacts/1.html\">John</a></td>" +
                "<td><a href=\"individualContacts/1.html\">Smith</a></td>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/2.html\">2</a></td>" +
                "<td><a href=\"individualContacts/2.html\">Mary</a></td>" +
                "<td><a href=\"individualContacts/2.html\">Jane</a></td>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/3.html\">3</a></td>" +
                "<td><a href=\"individualContacts/3.html\">William</a></td>" +
                "<td><a href=\"individualContacts/3.html\">Jones</a></td>" +
                "</tr>" +
                "</table>" +
                "<p></p>" +
                "<script src=\"script.js\"></script>" +
                "</body>" +
                "</html>";
        String result = indexPage.getHtml().replace("\n", "");
        assertEquals(expResult, result);
    }
    
    /** Test of generatePage method, of class IndexPage. */
    @Test public void testGeneratePage()
    {
        System.out.println("IndexPageTest.testGeneratePage()");
        String expResult = 
                "C:/Sample/Path/index.html " +
                "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>All Contacts</title>" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">" +
                "</head>" +
                "<body>" +
                "<h1>All Contacts</h1>" +
                "<input type=\"text\"></input>" +
                "<table>" +
                "<tr>" +
                "<th>Contact ID</th>" +
                "<th>Forename</th>" +
                "<th>Surname</th>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/1.html\">1</a></td>" +
                "<td><a href=\"individualContacts/1.html\">John</a></td>" +
                "<td><a href=\"individualContacts/1.html\">Smith</a></td>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/2.html\">2</a></td>" +
                "<td><a href=\"individualContacts/2.html\">Mary</a></td>" +
                "<td><a href=\"individualContacts/2.html\">Jane</a></td>" +
                "</tr>" +
                "<tr>" +
                "<td><a href=\"individualContacts/3.html\">3</a></td>" +
                "<td><a href=\"individualContacts/3.html\">William</a></td>" +
                "<td><a href=\"individualContacts/3.html\">Jones</a></td>" +
                "</tr>" +
                "</table>" +
                "<p></p>" +
                "<script src=\"script.js\"></script>" +
                "</body>" +
                "</html>";
        indexPage.generatePage();
        String result = fileWriterMock.output.replace("\n", "");
        assertEquals(expResult, result);
    }
}
