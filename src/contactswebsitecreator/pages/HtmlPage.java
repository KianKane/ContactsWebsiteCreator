package contactswebsitecreator.pages;

import filesystem.IFileWriter;

/**
 * A base class for all HTML based pages to inherit from
 * 
 * @author Kian Kane
 * @version 23/02/2017
 */
public abstract class HtmlPage extends Page
{
    protected String userContent;
    
    /** Sets the user content for this HTML page
     * @param userContent The new user content */
    public void setUserContent(String userContent)
    {
        this.userContent = userContent;
    }
    
    public HtmlPage(String path, IFileWriter fileWriter)
    {
        super(path, fileWriter);
        userContent = "";
    }
    
    /** Gets the data from this page without HTML tags
     * @return the data from this page without HTML tags */
    public abstract String getRaw();
    
    /** Gets the HTML representation of this page
     * @return A string containing the HTML representation of this page */
    public abstract String getHtml();

    @Override public void generatePage()
    {
        fileWriter.writeFile(path, getHtml());
    }
}
