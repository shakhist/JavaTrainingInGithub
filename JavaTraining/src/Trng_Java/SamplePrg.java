package Trng_Java;

public class SamplePrg {
	
	int a=10,b=10;
	public void sum(int a,int b)
	{
		int x=a+b;
		System.out.println("sum is" +x);
	}

	public static void main(String[] args) {//JVM needs this block to run the java program
		// TODO Auto-generated method stub
		
		SamplePrg obj=new SamplePrg();
		System.out.println("sum of variables "+ (obj.a+obj.b));
		obj.sum(5,3);
		System.out.println("Hello again");
		int i=0;
		for(i=2;i<10;i++)
		{
			System.out.println(i);
		}
		Access_Mod obj1=new Access_Mod();
		obj1.login();
		//System.out.println(obj1.i);//this wont work if the variable is private in the other class
		//obj.password();//this will throw error

	}

}
