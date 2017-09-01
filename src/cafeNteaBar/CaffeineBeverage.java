package cafeNteaBar;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondinments();
		}
		
		
	}
	
	abstract void brew();
	
	abstract void addCondinments();
	
	final void boilWater() {
		System.out.println("Boiling water");
	}
	
	final void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
}


