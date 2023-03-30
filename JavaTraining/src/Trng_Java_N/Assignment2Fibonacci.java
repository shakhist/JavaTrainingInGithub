package Trng_Java_N;

import java.util.Scanner;

public class Assignment2Fibonacci {
	
	void fibonacci()
	{
		int z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		for (int i=1;i<=10;i++)
		{ 
			z=x+y;
			x=y;
			y=z;	
	
			System.out.println(y);//1,2

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2Fibonacci obj=new Assignment2Fibonacci();
		obj.fibonacci();

	}

}
