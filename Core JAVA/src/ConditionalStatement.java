import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("a =");
		a=sc.nextInt();
		System.out.println("b =");
		b=sc.nextInt();
		System.out.println("c =");
		c=sc.nextInt();
		
		//simple if
		if(a>b) {
			System.out.println("a is greter than b");
		}
		
		//if else
		if(a>b) {
			System.out.println("a is greter than b");
		}
		else {
			System.out.println("b is greter than a");
		}
		
		//nested if else
		if(a>b) {
			if(a>c) {
				System.out.println("a is greter than b and c");
			}
			else {
				System.out.println("c is greter than a and b");
			}
		}
		else {
			System.out.println("b is greter than a");
		}
		
		//else if ladder
		System.out.println("\n");
		System.out.println("enter marks :");
		int m=sc.nextInt();
		
		if (m < 35) {
			System.out.println("fail");
		} 
		else if (m >= 35 && m <= 50) {
			System.out.println("D greade");
		} 
		else if (m >= 51 && m <= 70) {
			System.out.println("C grade");
		} 
		else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} 
		else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} 
		else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} 
		else {
			System.out.println("invalid input");
		}
		
		
		//Switch case
		System.out.println("\n");
		System.out.println("Enter 1. Addition");
		System.out.println("Enter 2. Subtraction");
		System.out.println("Enter 3. Multiplication");
		
		int num=sc.nextInt();
		switch (num){
			case 1: 
					System.out.println("Addition is = "+(a+b));
					break;
			case 2: 
				System.out.println("Subtraction is = "+(a-b));
				break;
			case 3: 
				System.out.println("Multiplication is = "+(a*b));
				break;
			default:
				System.out.println("invalid input");
			
		}
				
	}
}
