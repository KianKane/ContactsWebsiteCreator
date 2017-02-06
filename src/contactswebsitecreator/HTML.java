package contactswebsitecreator;

/**
 * Used to create HTML strings
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class HTML
{
    /** Creates and returns a DOCTYPE declaration
     * @return a DOCTYPE declaration */
    public static String doctype()
    {
        return "<!DOCTYPE html>";
    }
    
    /** Creates and returns html tags with the specified innerHTML
     * @param innerHTML The content between the html tags
     * @return html tags with the specified innerHTML */
    public static String html(String innerHTML)
    {
        return "<html>" + innerHTML + "</html>";
    }
    
    /** Creates and returns head tags with the specified innerHTML
     * @param innerHTML The content between the head tags
     * @return head tags with the specified innerHTML */
    public static String head(String innerHTML)
    {
        return "<head>" + innerHTML + "</head>";
    }
    
    /** Creates and returns title tags with the specified innerHTML
     * @param innerHTML The content between the title tags
     * @return title tags with the specified innerHTML */
    public static String title(String innerHTML)
    {
        return "<title>" + innerHTML + "</title>";
    }
    
    /** Creates and returns body tags with the specified innerHTML
     * @param innerHTML The content between the body tags
     * @return body tags with the specified innerHTML */
    public static String body(String innerHTML)
    {
        return "<body>" + innerHTML + "</body>";
    }
    
    /** Creates and returns header tags with the specified innerHTML
     * @param innerHTML The content between the header tags
     * @return header tags with the specified innerHTML */
    public static String h1(String innerHTML)
    {
        return "<h1>" + innerHTML + "</h1>";
    }
    
    /** Creates and returns paragraph tags with the specified innerHTML
     * @param innerHTML The content between the paragraph tags
     * @return paragraph tags with the specified innerHTML */
    public static String p(String innerHTML)
    {
        return "<p>" + innerHTML + "</p>";
    }
   
    /** Creates and returns a HTML break
     * @return A HTML break */
    public static String br()
    {
        return "<br>";
    }
    
    /** Creates and returns anchor tags with the specified HREF and innerHTML
     * @param href The URL that the link will direct to
     * @param innerHTML The content between the anchor tags
     * @return anchor tags with the specified HREF and innerHTML */
    public static String a(String href, String innerHTML)
    {
        return "<a href=\"" + href + "\">" + innerHTML + "</a>";
    }
}
