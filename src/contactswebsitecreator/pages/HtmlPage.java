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
    public HtmlPage(String path, IFileWriter fileWriter)
    {
        super(path, fileWriter);
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
