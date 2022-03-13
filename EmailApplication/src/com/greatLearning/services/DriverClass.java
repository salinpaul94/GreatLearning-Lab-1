package com.greatLearning.services;

import java.util.Scanner;

import com.greatLearning.module.Employee;

public class DriverClass {
	
	public static void main(String[] args) {
		
		//Surrounding scanner in try-with-resources to free up memory after scanner is used
		try (Scanner name = new Scanner(System.in)) {
			System.out.print("Please enter first name:- ");
			String firstName1= name.next();
			System.out.print("Please enter second name:- ");
			String secondName1= name.next();
			Employee employee = new Employee(firstName1, secondName1);
			
			CredintialService cs = new CredintialService();
			String generatedEmail;
			char[] generatedPassword;
			
			System.out.println("Please select the department from the following:- ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			//Using switch statement to check user input and check if the input is valid
			try (Scanner sc = new Scanner(System.in)) {
				int option = sc.nextInt();
				
				//decide the domain name of the email
				switch(option) {
				case 1 -> {
					generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "tech");
					generatedPassword = cs.generatePassword();
					cs.showCredintials(employee, generatedEmail, generatedPassword);
				}
				case 2 -> {
					generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "admin");
					generatedPassword = cs.generatePassword();
					cs.showCredintials(employee, generatedEmail, generatedPassword);
				}
				case 3 -> {
					generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "hr");
					generatedPassword = cs.generatePassword();
					cs.showCredintials(employee, generatedEmail, generatedPassword);
				}
				case 4 -> {
					generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
							employee.getLastName().toLowerCase(), "legal");
					generatedPassword = cs.generatePassword();
					cs.showCredintials(employee, generatedEmail, generatedPassword);
				}
				//passing warning when the user enters an invalid input
				default -> System.out.println("Wrong option!");
				
				}
			}
		}
	}
}
