package Trng_Java;

public class Poly_overriding2 extends Poly_overriding1{
	
	public void RBI()
	{
		System.out.println("child bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Poly_overriding2 obj=new Poly_overriding2();
		obj.RBI();//if the method is in child class,it will call that.else in parent class
		
	}

}
