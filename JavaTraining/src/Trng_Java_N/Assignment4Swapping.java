package Trng_Java_N;

public class Assignment4Swapping {
	
	void swap (int a,int b)
	{
		int x;
		x=a;
		a=b;
		b=x;
		System.out.println(a +" " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4Swapping obj=new Assignment4Swapping();
		obj.swap(3, 9);

	}

}
