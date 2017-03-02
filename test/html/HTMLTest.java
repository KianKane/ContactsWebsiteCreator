package html;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the HTML class
 * 
 * @author Kian Kane
 * @version 16/02/2017
 */
public class HTMLTest
{
    /** Test of doctype method, of class HTML. */
    @Test public void testDoctype()
    {
        System.out.println("HTMLTest.testDoctype();");
        String expResult = "<!DOCTYPE html>";
        String result = HTML.doctype().replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of html method, of class HTML. */
    @Test public void testHtml()
    {
        System.out.println("HTMLTest.testHtml();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<html>Sample InnerHTML</html>";
        String result = HTML.html(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of head method, of class HTML. */
    @Test public void testHead()
    {
        System.out.println("HTMLTest.testHead();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<head>Sample InnerHTML</head>";
        String result = HTML.head(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of meta method, of class HTML. */
    @Test public void testMeta()
    {
        System.out.println("HTMLTest.testMeta();");
        String charset = "Sample Charset";
        String expResult = "<meta charset=\"Sample Charset\">";
        String result = HTML.meta(charset).replace("\n", "");
        assertEquals(expResult, result);
    }
    
    /** Test of title method, of class HTML. */
    @Test public void testTitle()
    {
        System.out.println("HTMLTest.testTitle();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<title>Sample InnerHTML</title>";
        String result = HTML.title(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of stylesheet method, of class HTML. */
    @Test public void testStylesheet()
    {
        System.out.println("HTMLTest.testStylesheet();");
        String href = "Sample Href";
        String expResult = "<link rel=\"stylesheet\" type=\"text/css\" href=\"Sample Href\">";
        String result = HTML.stylesheet(href).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of script method, of class HTML. */
    @Test public void testScript()
    {
        System.out.println("HTMLTest.testScript();");
        String href = "Sample Href";
        String expResult = "<script src=\"Sample Href\"></script>";
        String result = HTML.script(href).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of body method, of class HTML. */
    @Test public void testBody()
    {
        System.out.println("HTMLTest.testBody();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<body>Sample InnerHTML</body>";
        String result = HTML.body(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of h1 method, of class HTML. */
    @Test public void testH1()
    {
        System.out.println("HTMLTest.testH1();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<h1>Sample InnerHTML</h1>";
        String result = HTML.h1(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of p method, of class HTML. */
    @Test public void testP()
    {
        System.out.println("HTMLTest.testP();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<p>Sample InnerHTML</p>";
        String result = HTML.p(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of br method, of class HTML. */
    @Test public void testBr()
    {
        System.out.println("HTMLTest.testBr();");
        String expResult = "<br>";
        String result = HTML.br().replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of a method, of class HTML. */
    @Test public void testA()
    {
        System.out.println("HTMLTest.testA();");
        String href = "Sample Href";
        String innerHTML = "Sample InnerHTML";
        String expResult = "<a href=\"Sample Href\">Sample InnerHTML</a>";
        String result = HTML.a(href, innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of table method, of class HTML. */
    @Test public void testTable()
    {
        System.out.println("HTMLTest.testTable();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<table>Sample InnerHTML</table>";
        String result = HTML.table(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of tr method, of class HTML. */
    @Test public void testTr()
    {
        System.out.println("HTMLTest.testTr();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<tr>Sample InnerHTML</tr>";
        String result = HTML.tr(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of th method, of class HTML. */
    @Test public void testTh()
    {
        System.out.println("HTMLTest.testTh();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<th>Sample InnerHTML</th>";
        String result = HTML.th(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of td method, of class HTML. */
    @Test public void testTd()
    {
        System.out.println("HTMLTest.testTd();");
        String innerHTML = "Sample InnerHTML";
        String expResult = "<td>Sample InnerHTML</td>";
        String result = HTML.td(innerHTML).replace("\n", "");
        assertEquals(expResult, result);
    }

    /** Test of inputText method, of class HTML. */
    @Test public void testInputText()
    {
        System.out.println("HTMLTest.testInputText();");
        String expResult = "<input type=\"text\"></input>";
        String result = HTML.inputText().replace("\n", "");
        assertEquals(expResult, result);
    }
    
}
