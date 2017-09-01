package factory;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private String name;
	private static ChocolateBoiler uniqueInstance;
	private ChocolateBoiler(){
		System.out.println("ChocolateBoiler is ready.");
	}
	
	
	public static ChocolateBoiler getInstance(String string) {
		if(uniqueInstance==null) {
		//	synchronized(ChocolateBoiler.class) {
		//		if(uniqueInstance==null) {
		//			System.out.println("Creating unique instance of Chocolate Boiler");
	//				uniqueInstance = new ChocolateBoiler();
		//			uniqueInstance.name=string;
			//	}
		//	}
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
			uniqueInstance.name=string;
		}
		System.out.println("Returning instance of Chocolate Boiler "+uniqueInstance.name);
		return uniqueInstance;
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
