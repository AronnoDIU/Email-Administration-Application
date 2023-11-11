import java.util.Random;
import java.util.Scanner;

// Class Email is created to store the employee's information.
public class Email {
    public Scanner userInput = new Scanner(System.in);

    private final String firstName;
    private final String lastName;
    private final String department;
    private final String email;
    private String password;
    private int mailCapacity = 500;
    private String alter_email;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("NEW EMPLOYEE: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = this.setDepartment();

        // Call a method that returns a random password
        this.password = this.generate_password();

        // Combine elements to generate an email
        this.email = this.generate_email();
    }

    // Generating the email according to the given syntax
    private String generate_email() {
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase()
                + "@" + this.department.toLowerCase() + ".company.com";
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("""
                DEPARTMENT CODES
                1 for Sales
                2 for Development
                3 for Accounting
                0 for None""");

        boolean flag = false; // To check if the user entered a valid choice

        //noinspection LoopConditionNotUpdatedInsideLoop
        do {
            System.out.print("Enter Department Code: ");
            int choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    return "Sales";
                case 2:
                    return "Development";
                case 3:
                    return "Accounting";
                case 0:
                    return "None";
                default:
                    System.out.println("***INVALID CHOICE***");
            }
        } while (!flag);
        return null;
    }

    // Generating a random password
    private String generate_password() {
        Random randomGenerate = new Random();

        String UpperCaseCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCaseCharacter = "abcdefghijklmnopqrstuvwxyz";
        String NumericCharacters = "0123456789";
        String SpecialCharacter = "!@#$%&?";

        // Combining all the characters
        String CharacterValues = UpperCaseCharacter +
                LowerCaseCharacter + NumericCharacters + SpecialCharacter;

        StringBuilder password = new StringBuilder(); // To store the password

        for (int i = 0; i < 8; i++) {

            // Selecting a random character from the CharacterValues
            password.append(CharacterValues.charAt
                    (randomGenerate.nextInt(CharacterValues.length())));
        }
        return password.toString();
    }

    // Change the password
    public void set_password() {
        boolean flag = false; // To check if the user entered a valid choice

        do {
            System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");

            char choice = userInput.next().charAt(0);

            // Check if the user wants to change the password
            if (choice == 'Y' || choice == 'y') {
                flag = true;

                System.out.print("Enter current password: ");
                String temp = userInput.next();

                // Check if the password is correct
                if (temp.equals(this.password)) {
                    System.out.println("Enter new password: ");
                    this.password = userInput.next();
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
                } else {
                    System.out.println("Incorrect Password!");
                }
            }
            // If the user does not want to change the password
            else if (choice == 'N' || choice == 'n') {
                flag = true;
                System.out.println("PASSWORD CHANGE CANCELED!");
            } else {
                System.out.println("***ENTER A VALID CHOICE***");
            }
        } while (!flag);
    }

    // Set the mailbox capacity
    public void setMailCapacity() {
        System.out.println("Current capacity = " + this.mailCapacity + " Mega Bytes");
        System.out.print("Enter new capacity: ");
        this.mailCapacity = userInput.nextInt();
        System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");

    }

    // Set the alternate email
    public void alternateEmail() {
        System.out.print("Enter new alternate email: ");
        this.alter_email = userInput.next();
        System.out.println("ALTERNATE EMAIL SET SUCCESSFULLY!");
    }

    // Displaying the employee's information
    public void getInformation() {
        System.out.println("NAME: " + this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT: " + this.department);
        System.out.println("EMAIL: " + this.email);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("MAILBOX CAPACITY: " + this.mailCapacity + " Mega Bytes");
        System.out.println("ALTER EMAIL: " + this.alter_email);
    }
}
