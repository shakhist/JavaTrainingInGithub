package Trng_Java_N;

public class Assignment1Methods {
	
	public int square(int a,int b)
	{
		int area=a*b;
		return area;
	}
	public static double triangle(int a,int b)
	{
		double area=0.5*a*b;
		return area;
	}
	public  double circle(int a)
	{
		double area=3.12*a*a;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment1Methods obj=new Assignment1Methods();
		int AreaSq=obj.square(4, 4);
		System.out.println("area of the square is "+AreaSq);
		
		double AreaTriangle=Assignment1Methods.triangle(3, 4);
		System.out.println("Area of the triangle is " +AreaTriangle);
		
		double AreaCircle=obj.circle(5);
		System.out.println("Area of circle is "+AreaCircle);

	}

}
