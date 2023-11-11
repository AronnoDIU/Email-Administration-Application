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
    private String alterEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("NEW EMPLOYEE CREATED SUCCESSFULLY ! \nYOUR NAME IS : " +
                this.firstName + " " + this.lastName);

        this.department = this.setDepartment(); // Ask for the department
        this.password = this.generatePassword(); // Generate a random password
        this.email = this.generateEmail(); // Generate an email
    }

    // Generating the email according to the given syntax
    private String generateEmail() {
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

        do {
            System.out.print("Enter Department Code for " + this.firstName + " : ");
            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    return "Sales Department";
                case 2:
                    return "Development Department";
                case 3:
                    return "Accounting Department";
                case 0:
                    return "None of the Above";
                default:
                    System.out.println("***INVALID CHOICE***");
            }
        } while (!flag);
        return null; // Return null if the user entered an invalid choice
    }

    // Generating a random password
    private String generatePassword() {
        Random randomGenerate = new Random();

        String UpperCaseCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LowerCaseCharacter = "abcdefghijklmnopqrstuvwxyz";
        String NumericCharacters = "0123456789";
        String SpecialCharacter = "!@#$%&?’*;:-.[]^-{}~`<=>/()_+";

        // Combining all the characters
        String CharacterValues = UpperCaseCharacter +
                LowerCaseCharacter + NumericCharacters + SpecialCharacter;

        StringBuilder password = new StringBuilder(); // To store the password

        for (int i = 0; i < 12; i++) {

            // Selecting a random character from the CharacterValues
            password.append(CharacterValues.charAt
                    (randomGenerate.nextInt(CharacterValues.length())));
        }
        return password.toString();
    }

    // Change the password
    public void setPassword() {
        boolean flag = false; // To check if the user entered a valid choice

        do {
            System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");

            char choice = userInput.next().charAt(0);

            // Check if the user wants to change the password
            if (choice == 'Y' || choice == 'y') {
                flag = true;

                System.out.print("Enter current password for " + this.email + " : ");
                String tempPassword = userInput.next(); // Store the current password

                // Check if the password is correct
                if (tempPassword.equals(this.password)) {
                    System.out.println("Enter a new password for " + this.email + " : ");
                    this.password = userInput.next();
                    System.out.println("PASSWORD HAS BEEN CHANGED TO " +
                            this.password + " SUCCESSFULLY!");
                } else {
                    System.out.println("Incorrect Password Entered! TRY AGAIN!");
                }
            }
            // If the user does not want to change the password
            else if (choice == 'N' || choice == 'n') {
                flag = true;
                System.out.println("PASSWORD CHANGE PROCESS HAS BEEN CANCELED!");
            } else {
                System.out.println("*** PLEASE ENTER A VALID CHOICE ***");
            }
        } while (!flag);
    }

    // Set the mailbox capacity
    public void setMailCapacity() {
        System.out.println("Current capacity of " + this.email + " = " +
                this.mailCapacity + " Mega Bytes");

        System.out.print("Enter new capacity for " + this.email + " : ");

        this.mailCapacity = userInput.nextInt();

        System.out.println("MAILBOX CAPACITY OF " + this.email
                + " HAS BEEN CHANGED SUCCESSFULLY!");
    }

    // Set the alternate email address
    public void alternateEmail() {
        System.out.print("Enter a new Alternate Email for " + this.email + " : ");
        this.alterEmail = userInput.next();
        System.out.println("ALTERNATE EMAIL HAS BEEN SET SUCCESSFULLY!");
    }

    // Displaying the employee's information
    public void getInformation() {
        System.out.println("YOUR NAME IS : " + this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT CODE : " + this.department);
        System.out.println("EMAIL ADDRESS : " + this.email);
        System.out.println("PASSWORD IS : " + this.password);
        System.out.println("MAILBOX CAPACITY IS : " + this.mailCapacity + " Mega Bytes");
        System.out.println("ALTERNATE EMAIL IS : " + this.alterEmail);
    }
}
