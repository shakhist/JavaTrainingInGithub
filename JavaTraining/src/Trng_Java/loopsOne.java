package Trng_Java;

public class loopsOne {
	
	 loopsOne()//constructor
	{
		for (int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	 loopsOne(int a)//method overloading
	 {
		 int i=a;
		 System.out.println("-----------------------------");

		 while(i<=5)
		 {
			 System.out.println(i);
			 i++;
		 }
	 }
	 loopsOne(int b,int c)
	 {
		 System.out.println("-------------------------------");
		 int i=b;
		 do
		 {
			 System.out.println(i);
			 i++;
		 }
		 while (i<c);

	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopsOne obj=new loopsOne();
		loopsOne obj1=new loopsOne(2);
		loopsOne obj2=new loopsOne(2,10);



	}

}
