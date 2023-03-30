package Trng_Java;

public class Methods_types {
	
	public void add (int a,int b)//methods can be used for reusability purpose in child class in the same package or different package after import
	{
		int x=a;
		int y=b;
		System.out.println("addition result is "+(x+y));
	}
	public int multiply1 (int a,int b)
	{
		int x=a;
		int y=b;
		return(x*y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_types obj=new Methods_types();
		obj.add(5, 3);
		int v=obj.multiply1(4,6);
		System.out.println("multiplication result is "+ v);

	}

}
