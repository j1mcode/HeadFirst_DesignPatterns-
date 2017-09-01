package factory;

public class Chocolatecontrol {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance("chocoluck");
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance("yummy");
	}}