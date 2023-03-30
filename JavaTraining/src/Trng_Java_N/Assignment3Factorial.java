package Trng_Java_N;

import java.util.Scanner;

public class Assignment3Factorial {
	
	void fact (int k)
	
	{
		int fv=k;
		for(int i=fv-1;i>0;i--)
		{
			fv=fv*i;			
			
		}
		 System.out.println("factorial value of " +k+" is " +fv);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3Factorial obj=new Assignment3Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int j=sc.nextInt();
		obj.fact(j);

	}

}
