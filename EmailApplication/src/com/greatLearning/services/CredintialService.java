package com.greatLearning.services;

import java.util.Random;

import com.greatLearning.module.Employee;

public class CredintialService {
	
	public char[] generatePassword() {
		//all the characters to be used in the password
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrst0123456789!@#$%^&*_=+-/.?<>";
		
		//Using random method to get character to be passed into for loop for each index value
		Random random = new Random();
		
		//Generating password in character for data protection
		char[] password = new char[8];
		
		for(int i=0; i<8; i++) {
			//Use of charAt() method : to get character value
			//Use of nextInt() as it is scanning the value as int
			password[i] = characters.charAt(random.nextInt(characters.length()));
		}
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+"."+lastName+"@"+department+".cool.com";
	}
	
	public void showCredintials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Hello,\n     "+ employee.getFirstName()+" "+ employee.getLastName()+" your generated credientials are as follows:- ");
		System.out.println("\n     Email id:- "+ email);
		System.out.println("     Password:- "+ generatedPassword);
	}

}
