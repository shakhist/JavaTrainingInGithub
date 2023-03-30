package Trng_Java;	

public class Encapsu_Access_Mod2 {
	String unm;
	private String pwd;
	public void display()
	{ 
		unm="Yohan";
		pwd="abc";
		System.out.println(unm+pwd);
	}
	
	

	
	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
