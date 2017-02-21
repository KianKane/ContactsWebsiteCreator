package contactswebsitecreator;

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
        String path = System.getProperty("user.home") + "/desktop/contacts";
        String host = "jdbc:oracle:thin:@//10.1.9.106:1521/sw2";
        String user = "kian";
        String pass = "password";
        
        ContactsWebsiteCreator cwc = new ContactsWebsiteCreator(path, host, user, pass);
        
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do
        {
            System.out.println("Menu: ");
            System.out.println("\tDisplay all contacts (display)");
            System.out.println("\tGenerate files       (generate)");
            System.out.println("\tDisplay index html   (display-html)");
            System.out.println("\tExit                 (exit)");
            System.out.print("Enter what you want to do: ");
            
            switch(input.next().trim().toLowerCase())
            {
                case "display":
                    cwc.displayIndexRaw();
                    break;
                case "generate":
                    cwc.generateFiles();
                    break;
                case "display-html":
                    cwc.displayIndexHtml();
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
