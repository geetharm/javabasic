package basicpackage;

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int a) {
		
		
		return ((a<=1)? a: fib(a-1)+fib(a-2)); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fibonacci series:");
		int number = sc.nextInt();

		for(int i = 0; i <= number-1; ++i) {
			System.out.print(fib(i) + "       ");
		}
		
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		
//		System.out.print(a + " "+ b);
//		for(int i = 2; i < number; ++i) {
//			c = a + b;
//			a = b;
//			b = c;
//			System.out.print(" ");
//			System.out.print(c);
//					
//		}
		
	}

}
