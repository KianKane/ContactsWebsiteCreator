package contactswebsitecreator;

import contactswebsitecreator.acceptancetesting.ContactsWebsiteCreatorAcceptanceTests;
import java.util.Scanner;

/**
 * Program starting point
 * 
 * @author Kian Kane
 * @version 21/02/2017
 */
public class Main
{
    /** Program starting point
     * @param args the command line arguments */
    public static void main(String[] args)
    {
        boolean testing = true;
        
        String path = System.getProperty("user.home") + "/desktop/contacts";
        String host = "jdbc:oracle:thin:@//10.1.9.106:1521/sw2";
        String user = "kian";
        String pass = "password";
        
        ContactsWebsiteCreator cwc = new ContactsWebsiteCreator(path, host, user, pass);
        
        if (testing)
            ContactsWebsiteCreatorAcceptanceTests.runAllTests(cwc);
        else
            userControlledMenuLoop(cwc);
    }
    
    /** Allows the user to control the application through the console
     * @param cwc The instance of ContactsWebsiteCreator to use */
    public static void userControlledMenuLoop(ContactsWebsiteCreator cwc)
    {
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do
        {
            System.out.println("Menu: ");
            System.out.println("\tDisplay all contacts    (display)");
            System.out.println("\tDisplay contact         (display [contactID])");
            System.out.println("\tGenerate files          (generate)");
            System.out.println("\tDisplay index html      (display-html)");
            System.out.println("\tDisplay contact html    (display-html [contactID])");
            System.out.println("\tSet index description   (set-content)");
            System.out.println("\tSet contact description (set-content [contactID])");
            System.out.println("\tExit                    (exit)");
            System.out.print("Enter what you want to do: ");
            String[] choices = input.nextLine().trim().toLowerCase().split(" ");
            System.out.println();
            
            String choice = "";
            int id = -1;
            if (choices.length > 0)
                choice = choices[0];
            if (choices.length > 1)
            {
                try
                {
                    id = Integer.parseInt(choices[1]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid contactID");
                    choice = "";
                }
            }
            
            switch(choice)
            {
                case "display":
                    if (id == -1)
                        cwc.displayIndexRaw();
                    else
                        cwc.displayContactRaw(id);
                    break;
                    
                case "generate":
                    cwc.generateFiles();
                    break;
                    
                case "display-html":
                    if (id == -1)
                        cwc.displayIndexHtml();
                    else
                        cwc.displayContactHtml(id);
                    break;
                
                case "set-content":
                    if (id == -1)
                    {
                        System.out.print("Enter content for index page: ");
                        String content = input.nextLine();
                        cwc.setIndexUserContent(content);
                        System.out.println("Content added\n");
                    }
                    else
                    {
                        if (cwc.contactExists(id))
                        {
                            System.out.print("Enter content for contact " + id + ": ");
                            String content = input.nextLine();
                            cwc.setContactUserContent(content, id);
                            System.out.println("Content added\n");
                        }
                        else
                        {
                            System.out.println("No contact with that id exists\n");
                        }
                    }
                    break;
                    
                case "exit":
                    System.out.println("Finished");
                    done = true;
                    break;
                    
                default:
                    System.out.println("Invalid input, please run the program again");
                    done = true;
                    break;
            }
        } while (!done);
    }
}
