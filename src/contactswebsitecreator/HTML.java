package contactswebsitecreator;

/**
 * Used to create HTML strings
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class HTML
{
    public static String doctype()
    {
        return "<!DOCTYPE html>";
    }
    
    public static String html(String innerHTML)
    {
        return "<html>" + innerHTML + "</html>";
    }
    
    public static String head(String innerHTML)
    {
        return "<head>" + innerHTML + "</head>";
    }
    
    public static String title(String innerHTML)
    {
        return "<title>" + innerHTML + "</title>";
    }
    
    public static String body(String innerHTML)
    {
        return "<body>" + innerHTML + "</body>";
    }
    
    public static String h1(String innerHTML)
    {
        return "<h1>" + innerHTML + "</h1>";
    }
    
    public static String p(String innerHTML)
    {
        return "<p>" + innerHTML + "</p>";
    }
   
    public static String br()
    {
        return "<br>";
    }
    
    public static String a(String href, String innerHTML)
    {
        return "<a href=\"" + href + "\">" + innerHTML + "</a>";
    }
}
