package Trng_Java_N;

import Trng_Java.Access_Mod;

public class Access_mod1 extends Access_Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_mod1 obj=new Access_mod1();
		obj.login();
		obj.logout();//public and protected can be accessed in child class.but not private and default methods in parent class
		
	}

}
