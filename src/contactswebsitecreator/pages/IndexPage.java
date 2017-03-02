package contactswebsitecreator.pages;

import contactswebsitecreator.Contact;
import filesystem.IFileWriter;
import html.HTML;
import java.util.ArrayList;

/**
 * Generates an index page which lists and links to a number of contacts
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class IndexPage extends HtmlPage
{
    private final ArrayList<Contact> contacts;
    
    /** Constructor
     * @param path The path to the folder to be used
     * @param contacts The list of contacts for the index page to link to
     * @param fileWriter The instance of an IFileWriter to use when generating files */
    public IndexPage(String path, ArrayList<Contact> contacts, IFileWriter fileWriter)
    {
        super(path + "/index.html", fileWriter);
        this.contacts = contacts;
    }

    @Override public String getRaw()
    {
        String raw = "";
        for (Contact contact : contacts)
        {
            raw += contact.toString() + "\n";
        }
        return raw;
    }

    @Override public String getHtml()
    {
        String contactsHtml = "";
        for (Contact contact : contacts)
        {
            contactsHtml += 
                    HTML.tr(
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", Integer.toString(contact.id))) +
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", contact.forename)) +
                            HTML.td(
                                    HTML.a("individualContacts/" + contact.id + ".html", contact.surname)));
        }
        String html = 
                HTML.doctype() + 
                HTML.html(
                        HTML.head(
                                HTML.meta("utf-8") +
                                HTML.title("All Contacts") +
                                HTML.stylesheet("style.css")) +
                        HTML.body(
                                HTML.h1("All Contacts") +
                                HTML.inputText() +
                                HTML.table(
                                        HTML.tr(HTML.th("Contact ID") + HTML.th("Forename") + HTML.th("Surname")) +
                                        contactsHtml) +
                                HTML.p(userContent) +
                                HTML.script("script.js")));
        return html;
    }
}
