package Trng_Java;

public class child_Class extends Access_Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   child_Class obj=new child_Class();
   obj.logout();//protected method in parent class
   obj.login();
   obj.search();//default method can be accessed in child class if the child class is in the same package
	}

}
