package contactswebsitecreator.pages;

import mocks.FileWriterMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the ClonedPage class
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public class ClonedPageTest
{
    ClonedPage clonedPage;
    FileWriterMock fileWriterMock;
    
    @Before public void setUp()
    {
        String fromPath = "C:/Sample/Path/From";
        String toPath = "C:/Sample/Path/To";
        fileWriterMock = new FileWriterMock();
        clonedPage = new ClonedPage(toPath, fromPath, fileWriterMock);
    }
    
    @After public void tearDown()
    {
        clonedPage = null;
        fileWriterMock = null;
    }

    /** Test of generatePage method, of class ClonedPage. */
    @Test public void testGeneratePage()
    {
        System.out.println("ClonedPageTest.testGeneratedPage()");
        String expResult = "C:/Sample/Path/From C:/Sample/Path/To";
        clonedPage.generatePage();
        String result = fileWriterMock.output.replace("\n", "");
        assertEquals(expResult, result);
    }
}
