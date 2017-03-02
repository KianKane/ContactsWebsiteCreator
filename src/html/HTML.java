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
    
    /** Creates and returns a meta tag with the specified charset
     * @param charset The charset to be used for the page
     * @return A meta tag with the specified charset */
    public static String meta(String charset)
    {
        return "<meta charset=\"" + charset + "\">\n";
    }
    
    /** Creates and returns title tags with the specified innerHTML
     * @param innerHTML The content between the title tags
     * @return title tags with the specified innerHTML */
    public static String title(String innerHTML)
    {
        return "<title>" + innerHTML + "</title>\n";
    }
    
    /** Creates and returns link tags linking the page to the style sheet at the specified href
     * @param href The location of the style sheet
     * @return link tags linking the page to the style sheet at the specified href */
    public static String stylesheet(String href)
    {
        return "<link rel=\"stylesheet\" type=\"text/css\" href=\"" + href + "\">\n";
    }
    
    /** Creates and returns script tags linking the page to the script file at the specified href
     * @param href The location of the script file
     * @return script tags linking the page to the script file at the specified href */
    public static String script(String href)
    {
        return "<script src=\"" + href + "\"></script>\n";
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
        return "<a href=\"" + href + "\">" + innerHTML + "</a>";
    }
    
    /** Creates and returns table tags with the specified innerHTML
     * @param innerHTML The content between the table tags
     * @return table tags with the specified innerHTML */
    public static String table(String innerHTML)
    {
        return "<table>\n" + innerHTML + "</table>\n";
    }
    
    /** Creates and returns table row tags with the specified innerHTML
     * @param innerHTML The content between the table row tags
     * @return table row tags with the specified innerHTML */
    public static String tr(String innerHTML)
    {
        return "<tr>\n" + innerHTML + "</tr>\n";
    }
    
    /** Creates and returns table header tags with the specified innerHTML
     * @param innerHTML The content between the table header tags
     * @return table header tags with the specified innerHTML */
    public static String th(String innerHTML)
    {
        return "<th>" + innerHTML + "</th>\n";
    }
    
    /** Creates and returns table data tags with the specified innerHTML
     * @param innerHTML The content between the table data tags
     * @return table data tags with the specified innerHTML */
    public static String td(String innerHTML)
    {
        return "<td>" + innerHTML + "</td>\n";
    }
    
    /** Creates and returns an input field of type text
     * @return an input field of type text */
    public static String inputText()
    {
        return "<input type=\"text\"></input>\n";
    }
}
