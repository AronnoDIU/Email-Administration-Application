import java.util.Scanner;

public class EmailApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Create an object of Email class.
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

                case 1: // For Show Info
                    email.getInformation();
                    break;
                case 2: // For Change Password
                    email.setPassword();
                    break;
                case 3: // For Change Mailbox Capacity
                    email.setMailCapacity();
                    break;
                case 4: // For Set Alternate Email
                    email.alternateEmail();
                    break;
                case 5: // For Exit
                    System.out.println("\nTHANKS FOR USING OUR APPLICATION!");
                    break;
                default: // For Invalid Choice
                    System.out.println("INVALID CHOICE! ENTER AGAIN!");
            }

        } while (choice != 5); // The Loop will continue until the user enters 5.
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