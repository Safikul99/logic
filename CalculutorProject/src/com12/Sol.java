package com12;

import java.util.Scanner;
public class Sol {

	public static void main(String[] args) 
	{
		CalculatorIm c=new Calculator();
		Scanner scan=new Scanner(System.in);
		while(true) {
		
		int choice=scan.nextInt();
		
		int x=0;
		int y=0;
		
		if(choice>=1 && choice<=4)
		{
		System.out.println("Enter the first number");
		x=scan.nextInt();
		System.out.println("Enter the first number");
		y=scan.nextInt();
		}
		 switch(choice)
		 {
		 case 1:
			 System.out.println("sum of"+ x+" &"+ y+" is"+c.sum(x, y));
			 break;
		 case 2:
			 System.out.println("sub of"+ x+" &"+ y+" is"+c.sub(x, y));
			 break;
		 case 3:
			 System.out.println("sum of"+ x+" &"+ y+" is"+c.pro(x, y));
			 break;
		 case 4:
			 System.out.println("sum of"+ x+" &"+ y+" is"+c.div(x, y));
			 break;
		 case 5:
			 System.out.println("Thank you!!");
			 System.exit(0);
		default :
			System.out.println("Invalide");
		 }
		}
	
		

	}

}
