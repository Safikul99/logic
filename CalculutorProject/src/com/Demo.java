package com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		while(true) {
			System.out.println("Enter choice");

			int choice= scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("hi");
				break;
			case 2:
				System.out.println("bye");
				break;
			case 3:
				System.out.println("Thank You!");

				System.exit(0);//terminate the Jvm (Program),//System is class,exit() static method
			default:
				System.out.println("Invalide ");
			}//end of switch	
			System.out.println("------------");
			

		} //while end


	}

}
