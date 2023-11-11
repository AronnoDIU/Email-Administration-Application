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
        this.password = this.generate_password(8);

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
    private String generate_password(int length) {
        Random r = new Random();

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&?";
        String values = Capital_chars + Small_chars + numbers + symbols;

        String password = "";
        for (int i = 0; i < length; i++) {
            password = password + values.charAt(r.nextInt(values.length()));
        }
        return password;
    }

    // Change the password
    public void set_password() {
        boolean flag = false;
        do {
            System.out.print("ARE YOU SURE YOU WANT TO CHANGE YOUR PASSWORD? (Y/N) : ");
            char choice = userInput.next().charAt(0);
            if (choice == 'Y' || choice == 'y') {
                flag = true;
                System.out.print("Enter current password: ");
                String temp = userInput.next();
                if (temp.equals(this.password)) {
                    System.out.println("Enter new password: ");
                    this.password = userInput.next();
                    System.out.println("PASSWORD CHANGED SUCCESSFULLY!");
                } else {
                    System.out.println("Incorrect Password!");
                }
            } else if (choice == 'N' || choice == 'n') {
                flag = true;
                System.out.println("PASSWORD CHANGE CANCELED!");
            } else {
                System.out.println("***ENTER A VALID CHOICE***");
            }
        } while (!flag);
    }

    // Set the mailbox capacity
    public void set_mailCap() {
        System.out.println("Current capacity = " + this.mailCapacity + "mb");
        System.out.print("Enter new capacity: ");
        this.mailCapacity = userInput.nextInt();
        System.out.println("MAILBOX CAPACITY CHANGED SUCCESSFULLY!");

    }

    // Set the alternate email
    public void alternate_email() {
        System.out.print("Enter new alternate email: ");
        this.alter_email = userInput.next();
        System.out.println("ALTERNATE EMAIL SET SUCCESSFULLY!");
    }

    // Displaying the employee's information
    public void getInfo() {
        System.out.println("NAME: " + this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT: " + this.department);
        System.out.println("EMAIL: " + this.email);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("MAILBOX CAPACITY: " + this.mailCapacity + "mb");
        System.out.println("ALTER EMAIL: " + this.alter_email);
    }
}
