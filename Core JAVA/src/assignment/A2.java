/*Write a Java program that takes the user to provide a single character from the alphabet.
Print Vowel or Consonant, depending on the user input. 
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, 
print an error message.*/

package assignment;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		System.out.print("Please enter single character:");
		
		Scanner sc= new Scanner(System.in);
		char c;
		c=sc.next().charAt(0);
		int ch=c;
		
		if(c=='a' ||c=='e'|| c=='i' || c=='o'|| c=='u') { 
			System.out.println(c +" is Vowel"); 
		} 
		else { 
			System.out.println(c + " is Consonant "); 
		}
		 
		
		//System.out.println(ch);
	}
}
