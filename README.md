# Email Administration Application

This is a simple Java application that simulates an email administration system. It generates an email with the syntax:
firstname.lastname@department.company.com and allows the user to interact with the application by changing the password,
setting the mailbox capacity, and defining an alternate email address. The application also displays the name, email,
and mailbox capacity. This project was created as part of
the [Java Programming Masterclass for Software Developers](https://www.udemy.com/course/java-the-complete-java-developer-course/)
course on Udemy.

## Table of Contents

- [Email Administration Application](#email-administration-application)
    - [Table of Contents](#table-of-contents)
    - [Description](#description)
    - [Features](#features)
    - [How to Run](#how-to-run)
    - [User Interaction](#user-interaction)
    - [Contributing](#contributing)
    - [License](#license)

## Description

This is a simple Java application that simulates an email administration system.

## Features

- Generates an email with the syntax: firstname.lastname@department.company.com
- Determines the department (sales, development, accounting), if none, leaves it blank
- Generate a random string for a password
- Allows the user to change the password
- Allows the user to set the mailbox capacity
- Allows the user to define an alternate email address
- Displays the name, email, and mailbox capacity

## How to Run

1. Clone the repository
2. Open the project in IntelliJ IDEA 2023.2.5 or any other Java IDE
3. Run the `EmailApplication.java` file

## User Interaction

The application prompts the user with a menu of choices:

1. Show Info: Displays the name, email, and mailbox capacity
2. Change Password: Allows the user to change the password
3. Change Mailbox Capacity: Allows the user to set the mailbox capacity
4. Set Alternate Email: Allows the user to define an alternate email address
5. Exit: Exits the application

The user can interact with the application by entering the number corresponding to their choice.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

This project is licensed under the [MIT](https://choosealicense.com/licenses/mit/) license.