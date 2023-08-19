package com;

import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//upcasting -->abstraction
		Calculator c1=new CalculatorImp();


		while(true) {//infinite loop
			System.out.println("1:Addition\n2:Subtract\n3:Multipicattoi\n4:Divison");
			System.out.println("Ente Choice");
			int choice=scan.nextInt();

			System.out.println("Enter choice");
			int a=0;
			int b=0;
			if(choice>=1 && choice<=4)
			{
				System.out.println("Enter the first Number:");
				a=scan.nextInt();
				System.out.println("Enter the secon Number:");
				b=scan.nextInt();
			}

			switch(choice) {
			case 1:

				System.out.println("Sum of "+a+ "&" +b+ "is "+c1.add(a, b));

				break;
			case 2:
				System.out.println("sub of "+a+ "&" +b+ "is "+c1.sub(a, b));


				break;
			case 3:
				System.out.println("pro of "+a+ "&" +b+ "is "+c1.mul(a, b));

				break;

			case 4:
				System.out.println("div of "+a+ "&" +b+ "is "+c1.div(a, b));

				break;
			case 5:
				System.out.println("Thank You!");
				System.exit(0);//terminate the Jvm (Program),//System is class,exit() static method
			default:
				System.out.println("Invalide!! ");


			}
		}
	}






}

