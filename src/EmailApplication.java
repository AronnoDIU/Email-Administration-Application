import java.util.Scanner;

public class EmailApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Email email = new Email("Yeasir", "Arafat");

        int choice; // Initialize choice variable.

        // This will be changed to 5 if the user wants to exit.
        do {
            System.out.println("""

                    **************************
                    ENTER YOUR CHOICE
                    1.Show Info
                    2.Change Password
                    3.Change Mailbox Capacity
                    4.Set Alternate Email
                    5.Exit""");

            choice = userInput.nextInt(); // Get user's choice

            switch (choice) {

                case 1:
                    email.getInfo();
                    break;
                case 2:
                    email.set_password();
                    break;
                case 3:
                    email.set_mailCap();
                    break;
                case 4:
                    email.alternate_email();
                    break;
                case 5:
                    System.out.println("\nTHANKS!!!");
                    break;
                default:
                    System.out.println("INVALID CHOICE! ENTER AGAIN!");
            }

        } while (choice != 5);
    }
}

/* Expected Output:



 */