/**
 * 
 */
package master;

import FactoryPattern.Car;
import FactoryPattern.CarFactory;

public class Singleton {

	   //create an object of SingleObject
	   private static Singleton instance = new Singleton();
	   private Singleton();
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Singleton(){;}
	   private CarFactory carmodel;
	   //Get the only object available
	   public static Singleton getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Singleton created success");	      
	   }
	   public void showCarFactoryMakes()
	   {
		   try
		   {
		   CarFactory carmodel = new CarFactory ();
		   Car mycar1 = carmodel.getModel("Ford");
		   mycar1.getmodel();
		   Car mycar2 = carmodel.getModel("Chevrolet");
		   mycar2.getmodel();
		   Car mycar3 = carmodel.getModel("Nissan");
		   mycar3.getmodel();
		   }
		   catch(Exception e)
		   {
			   System.out.println(e.getMessage());	 
		   }
		   finally
		   {
			   System.out.println("Exit Factory pattern");	 
		   }
	   }
	   public Car getModel(String model) throws Exception
	   {
		   return carmodel.getModel(model);
	   }
	}
}