package contactswebsitecreator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Holds a list of contacts loaded from the database
 * 
 * @author Kian Kane
 * @version 06/02/2017
 */
public class ContactDataSet
{
    private static final String SELECT_QUERY = "select contact_id, first_name, last_name, email, phone from contacts";
    
    public ArrayList<Contact> contacts;
    
    /** Fills the contacts list from the specified host
     * @param host The host database
     * @param user The username for the database
     * @param pass The password for the database */
    public void loadFromDatabase(String host, String user, String pass)
    {
        // Clear the contacts list
        if (contacts == null)
            contacts = new ArrayList<>();
        else
            contacts.clear();
        
        // Attempt to load from the database
        try
        {
            Connection connection = DriverManager.getConnection(host, user, pass);
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(SELECT_QUERY);
            while(results.next())
            {
                contacts.add(new Contact(
                        results.getInt(1),
                        results.getString(2),
                        results.getString(3),
                        results.getString(4),
                        results.getString(5)
                ));
            }
        }
        catch(SQLException e)
        {
            System.err.println("Failed to load contacts from database: " + e.getMessage());
        }
    }
}
