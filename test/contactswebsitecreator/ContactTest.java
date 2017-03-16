package contactswebsitecreator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Contact class.
 * <br><br>
 * These tests ensure that the constructor sets up the correct values.
 * 
 * @author Kian Kane
 * @version 16/02/2017
 */
public class ContactTest
{
    Contact contact;
    
    /** Set up the sample contact */
    @Before public void setUp()
    {
        contact = new Contact(1234, "John", "Smith", "j.smith@email.com", "123.456.7890");
    }
    
    /** Tear down the sample contact */
    @After public void tearDown()
    {
        contact = null;
    }

    /** Ensure that the contact id is as expected */
    @Test public void testContactId()
    {
        System.out.println("ContactTest.testId();");
        int expResult = 1234;
        int result = contact.id;
        assertEquals(expResult, result);
    }
    
    /** Ensure that the contact forename is as expected */
    @Test public void testForename()
    {
        System.out.println("ContactTest.testForename();");
        String expResult = "John";
        String result = contact.forename;
        assertEquals(expResult, result);
    }
    
    /** Ensure that the contact surname is as expected */
    @Test public void testSurname()
    {
        System.out.println("ContactTest.testSurname();");
        String expResult = "Smith";
        String result = contact.surname;
        assertEquals(expResult, result);
    }
    /** Ensure that the contact email is as expected */
    @Test public void testEmail()
    {
        System.out.println("ContactTest.testEmail();");
        String expResult = "j.smith@email.com";
        String result = contact.email;
        assertEquals(expResult, result);
    }
    
    /** Ensure that the contact phone number is as expected */
    @Test public void testPhone()
    {
        System.out.println("ContactTest.testPhone();");
        String expResult = "123.456.7890";
        String result = contact.phone;
        assertEquals(expResult, result);
    }
}
