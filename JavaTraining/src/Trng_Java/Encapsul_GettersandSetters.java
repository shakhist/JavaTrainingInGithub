package Trng_Java;

public class Encapsul_GettersandSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsu_Access_Mod2 obj=new Encapsu_Access_Mod2();//from Access_Mod2 class
		obj.display();
		String g=obj.getPwd();
		System.out.println("getting private variable "+ g);
	}

}
