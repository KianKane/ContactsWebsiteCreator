package html;

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
        return "<!DOCTYPE html>\n";
    }
    
    /** Creates and returns html tags with the specified innerHTML
     * @param innerHTML The content between the html tags
     * @return html tags with the specified innerHTML */
    public static String html(String innerHTML)
    {
        return "<html>\n" + innerHTML + "</html>\n";
    }
    
    /** Creates and returns head tags with the specified innerHTML
     * @param innerHTML The content between the head tags
     * @return head tags with the specified innerHTML */
    public static String head(String innerHTML)
    {
        return "<head>\n" + innerHTML + "</head>\n";
    }
    
    /** Creates and returns title tags with the specified innerHTML
     * @param innerHTML The content between the title tags
     * @return title tags with the specified innerHTML */
    public static String title(String innerHTML)
    {
        return "<title>" + innerHTML + "</title>\n";
    }
    
    public static String stylesheet(String href)
    {
        return "<link rel=\"stylesheet\" type=\"text/css\" href=\"" + href + "\">\n";
    }
    
    /** Creates and returns body tags with the specified innerHTML
     * @param innerHTML The content between the body tags
     * @return body tags with the specified innerHTML */
    public static String body(String innerHTML)
    {
        return "<body>\n" + innerHTML + "</body>\n";
    }
    
    /** Creates and returns header tags with the specified innerHTML
     * @param innerHTML The content between the header tags
     * @return header tags with the specified innerHTML */
    public static String h1(String innerHTML)
    {
        return "<h1>" + innerHTML + "</h1>\n";
    }
    
    /** Creates and returns paragraph tags with the specified innerHTML
     * @param innerHTML The content between the paragraph tags
     * @return paragraph tags with the specified innerHTML */
    public static String p(String innerHTML)
    {
        return "<p>" + innerHTML + "</p>\n";
    }
   
    /** Creates and returns a HTML break
     * @return A HTML break */
    public static String br()
    {
        return "<br>\n";
    }
    
    /** Creates and returns anchor tags with the specified HREF and innerHTML
     * @param href The URL that the link will direct to
     * @param innerHTML The content between the anchor tags
     * @return anchor tags with the specified HREF and innerHTML */
    public static String a(String href, String innerHTML)
    {
        return "<a href=\"" + href + "\">" + innerHTML + "</a>\n";
    }
}
