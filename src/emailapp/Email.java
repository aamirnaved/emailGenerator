package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPassLength = 8;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "xyzcompany.com";

    // Constructor to initialize first name and last name;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


        //call a method asking for department, return a department
        this.department = setDepartment();


        //call a method that returns a random password:
        this.password = randomPassword(defaultPassLength);


        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "->" + department + "@" + companySuffix;

    }

    // Ask for the department.

    private String setDepartment() {
        System.out.print("New employee: " + firstName + "\nDepartment Codes:\n1 for Sales.\n2 for Development.\n3 for Accounting\n0 for none \nEnter department Code\n");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        return switch (choice) {
            case 1 -> "sales";
            case 2 -> "dev";
            case 3 -> "accounts";
            default -> "none";
        };
    }

    // Create a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
        char[] pass = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            pass[i] = passwordSet.charAt(rand);
        }
        return new String(pass);
    }

    // Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // Set the altername email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String newPass) {
        this.password = newPass;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity: " + mailBoxCapacity;
    }


}
