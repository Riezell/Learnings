package com.riezell;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
    private static Mobilephone mobilephone = new Mobilephone("0039 330 4408");
	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\nEnter action:(6 to show availbale actions");
			int action = scan.nextInt();
			scan.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("\nShutting diown...");
				quit = true;
				break;
			case 1:
				mobilephone.printContacts();
				break;
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}
			
		}
		
	}
	
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scan.nextLine();
		System.out.println("Enter phone Number: ");
		String phone = scan.nextLine();
		Contact newContact = Contact.createContact(name, phone);
		if(mobilephone.addNewContact(newContact)) {
			System.out.println("New contact added: name = " + name + ", phone = " + phone);	
		}else {
			System.out.println("Cannot add, " +name +" already on file" );
		 }
		}
	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name =scan.nextLine();
		Contact existingContactRecord = mobilephone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new contact name: ");
		String newName = scan.nextLine();
		System.out.println("Enter new contact phone number: ");
		String newNumber = scan.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(mobilephone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Error updating record");
		}else {
			System.out.println("Error updating record");
		}
	}
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name =scan.nextLine();
		Contact existingContactRecord = mobilephone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		  }
		if(mobilephone.removeContact(existingContactRecord)) {
			System.out.println("Succesfully deleted");
		}else {
			System.out.println("Error deleting contact");
		 }
		}
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name =scan.nextLine();
		Contact existingContactRecord = mobilephone.queryContact(name);
		if(existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		  }
		System.out.println("Name: " + existingContactRecord.getName()+ " phone number is " + existingContactRecord.getPhoneNumber());
		
		}
	private static  void  startPhone() {
		System.out.println("Starting phone...");
	}
	private static void printActions() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0 - to shutdown\n"+
		                   "1 - to print contacts\n" +
				           "2 - to add a new contact\n" +
		                   "3 - to update an existing contact\n" +
				           "4 - to remove an existing contact\n" +
		                   "5 - to query if an existing contact exist\n" +
				           "6 - to print a list of available actions.");
		System.out.println("Choose your action" );
		
	}

}
