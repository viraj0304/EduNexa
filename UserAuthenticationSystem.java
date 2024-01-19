package edunexa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

public class UserAuthenticationSystem 
{
    private static final Map<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        while (true) 
        {
            System.out.println("Menues:");
            System.out.println("\n");
            System.out.println("1.Sign Up");
            System.out.println("2.Log In");
            System.out.println("3.Log Out");
            System.out.println("4.Exit");
            System.out.println("\n");
            System.out.print("Your choice:");

            int chc=scanner.nextInt();
            scanner.nextLine();

            switch (chc) 
            {
                case 1:
                    rgrusr(scanner);
                    break;
                    
                case 2:
                    logusr(scanner);
                    break;
                    
                case 3:
                    System.out.println("\nLog out successfully");
                    break;
                    
                case 4:
                    System.out.println("\nExiring");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
        }
    }

    private static void rgrusr(Scanner scanner) 
    {
        System.out.print("\nEnter your name:");
        String username = scanner.nextLine();

        if (userDatabase.containsKey(username)) 
        {
            System.out.println("\nAlready Exists");
            return;
        }

        System.out.print("\nCreate password: ");
        String password = scanner.nextLine();

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        userDatabase.put(username, hashedPassword);
        System.out.println("\nRegistered successful\n");
    }

    private static void logusr(Scanner scanner) {
        System.out.print("\nEnter your name:");
        String username = scanner.nextLine();

        if (!userDatabase.containsKey(username)) 
        {
            System.out.println("\nInvalid Input");
            return;
        }

        System.out.print("\nEnter your password:");
        String password = scanner.nextLine();

        String storedHashedPassword=userDatabase.get(username);

        if (BCrypt.checkpw(password, storedHashedPassword))
        {
            System.out.println("\nLogin successful\n");
        } 
        else 
        {
            System.out.println("\nInvalid credentials");
        }
    }
}
