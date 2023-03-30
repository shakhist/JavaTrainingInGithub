package Trng_Java;

public class Polymorphism_eg {//multiple methods with same name but with diff signatures
	
//2 types of polymorphism
	//static or compile time -- can be acheived using overloading
	         //overloading is - in a single class if we see mthods with same name and multiple signatures
	//dynamic or run time -- can be achieved using overriding
	         //overriding  is with 2 classes having same name and same signature eg:driver.get("chrome browser"),driver.get("edge ")
	
	public void login (String a,String b)
	{
		System.out.println("user....");
	}
	public void login (String a,int b)
	{
		System.out.println("ADMIN....");
	}
	public void login (int a,String b)//changing position of data type
	{
		System.out.println("DEV....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_eg obj=new Polymorphism_eg();
		obj.login(1, "shakhi");

	}

}
