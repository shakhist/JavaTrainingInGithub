package Trng_Java;

public class array1_exceptionHandling1 {
	//interrupted exception - thread.sleep(1000);
	//unchecked exceptions - arithmetic exceptions,out of bounds,division by zero etc
	void array()
	{
		int eid[]= {10,20,30,40,50,60};
		System.out.println(eid[1]);
		int size=eid.length;
		System.out.println(size);
		try//try block can have multiple errors.it stops the execution in the area and catch the exception,based on the exception,corresponding
		//catch block will be executed
		{
		for(int i=0;i<5;i++)
		{
			System.out.println(eid[i]);
			System.out.println(eid[9]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		try
		{
		int x=eid[1]/0;
		}
		/*catch(ArithmeticException e)
		{
			e.printStackTrace();
		}*/
		finally //used with try catch block.once there are no exceptions finally will execute.if catch is not present,use finally
		//but catch is needed to catch the exception
		{
			System.out.println("finally done");
		}
		try {
			Thread.sleep(1000);//interrupted exception.u need try catch block if the sleep gets interrupted in 1 sec.
			//else it will throw interrupted excpetion to the main method.main will inform JVM and JVM will stop executing
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try
		{
			String name=null;
			System.out.println(name);
			
		}
		
		
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("after exceptions");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array1_exceptionHandling1 ar=new array1_exceptionHandling1();
		ar.array();
	}

}
