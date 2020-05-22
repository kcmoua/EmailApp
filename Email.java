package emailapp;

import java.util.Scanner;

public class Email {
	// private variables
	private String firstName, lastName, password, department, email, alternateEmail;
	private String companySuffix = "winprogram.com";
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 12;
	// Constructor for first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// Call a method for the department - return the department
		this.department = setDepartment();
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("New worker: " + firstName + ". DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner scan = new Scanner(System.in);
		int depChoice = scan.nextInt();
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "dev";
		} else if(depChoice == 3) {
			return "acct";
		} else {
			return "";
		}
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	// Getters
	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}
	public String getAlternateEmail() {
		return this.alternateEmail;
	}
	public String getPassword() {
		return this.password;
	}
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
