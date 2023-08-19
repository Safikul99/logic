package com;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value");
		int choice=scan.nextInt();
	
		switch(choice)
		{
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Bey");
			break;
		case 3:
			System.out.println("Thank you");
			break;
		default:
				System.out.println("invalide number");
				
		}
		
		




	}

}
