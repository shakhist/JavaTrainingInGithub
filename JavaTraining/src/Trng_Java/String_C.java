package Trng_Java;

import java.util.Scanner;

public class String_C {
	int x=5;//global or instance variable
	int y=3;//global or instance variable
	int a=50;
	
	void add()
	{
		int a,b;//local variables
		a=10;
		b=20;
			System.out.println("addition result,a+b is ");
			System.out.println(a+b);

			System.out.println("instance variable a is "+this.a);//instance variable
	}
	String_C()//default constructor // construcotrs are manily used for initialization or declaration before the program starts
	{
		System.out.println("Constructor method");
	}
	String_C(int p,int q)
	{
		System.out.println("Parameterized contructor value is " + (p+q));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		str=s.nextLine();
		System.out.println(str);
		String_C obj=new String_C();//objects are used for accessing the variables and methosds in the class.Webdriver is an instance 
		//and inherits the properties of diff browsers like chrome driver,gecko driver etc
		obj.add();
		String_C obj1=new String_C(3,6);

	}

}
