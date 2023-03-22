package javaprograms;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Enter any number/String");
		Scanner sc1 = new Scanner(System.in);
		original = sc1.nextLine();
		int length = original.length();
		
		for(int i=length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
			
		}
		if(original.equals(reverse)){
System.out.println("It is palindrome");
		
	}
		else {
			System.out.println("It is not palindrome");
		}

}}
