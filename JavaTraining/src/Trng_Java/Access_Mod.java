package Trng_Java;

public class Access_Mod {
	private int i=10;
	
	public void  login()
	{ int i;
		System.out.println("inside login method");
		System.out.println(this.i);
	}
	void search()
	{
		System.out.println("inside default methid");//will not be accessible outside this class
	}
	private void password()
	{
		System.out.println("inside password method");
	}
	protected void logout()
	{
		System.out.println("inside logout method");// this will be visible to only its child
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Mod obj=new Access_Mod();
        obj.login();
        
	}

}
