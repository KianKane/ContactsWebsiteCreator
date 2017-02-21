package contactswebsitecreator;

/**
 * Contains all of the data for a single contact
 * 
 * @author Kian Kane
 * @version 20/02/2017
 */
public class Contact
{
    public final int    id;
    public final String forename;
    public final String surname;
    public final String email;
    public final String phone;
    
    /** Constructor
     * @param id       Contact ID
     * @param forename First name
     * @param surname  Last name
     * @param email    Email address
     * @param phone    Phone Number */
    public Contact(int id, String forename, String surname, String email, String phone)
    {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }
    
    @Override public String toString()
    {
        return "Contact " + id + " | Name: " + forename + " " + surname + " | Email: " + email + " | Phone: " + phone;
    }
}
