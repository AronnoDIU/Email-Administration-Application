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
                    email.getInformation();
                    break;
                case 2:
                    email.set_password();
                    break;
                case 3:
                    email.setMailCapacity();
                    break;
                case 4:
                    email.alternateEmail();
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

Application should do the following:

    Generate an email with the following syntax: firstname.lastname@department.company.com
    Determine the department (sales, development, accounting), if none leave blank,
    Generate a random String for a password
    Have set methods to change the password, set the mailbox capacity,
    and define an alternate email address
    Have get methods to display the name, email, and mailbox capacity

 */