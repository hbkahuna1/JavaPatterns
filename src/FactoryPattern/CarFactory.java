package FactoryPattern;

public class CarFactory {

	public CarFactory() {
		// TODO Auto-generated constructor stub
	}

	public Car getModel(String make) throws Exception
	{
		switch ( make)
		{
			case "Ford":
				return new Ford();
			case"Chevrolet":
				return new Chevrolet();
			case "Nissan":
				return new Nissan();
			default:
				throw new Exception ("Invalid Car Make");
		}
	}
}


