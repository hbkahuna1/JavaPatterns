package master;

public class MAIN {
	static Singleton single;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		single = Singleton.getInstance();
		single.getInstance().showMessage();
		single.getInstance().showCarFactoryMakes();
		String myString = "abc";
		System.out.println (myString);
		myString = "xyz";
		System.out.println ("Feature1 change"+myString);		
	}			

}
