package Java8_Assignement;

import java.util.Scanner;

public class SafeandDivider{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		
		if(b==0) {
			System.out.println("Not allowed");
		}
		else {
			System.out.println("Value is" + " " +c);
		}
		
	}
}