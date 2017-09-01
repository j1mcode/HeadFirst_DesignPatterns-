package Shop;

import java.util.ArrayList;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Pepperoni;
import Ingredient.Sauce;
import Ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	ArrayList toppings= new ArrayList();
	
	void prepare() {
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding sauce...");
		System.out.println("Adding Toppings:");
		for(int i=0;i<toppings.size();i++) {
			System.out.println("    "+toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 mins at 350");
	}
	
	void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		this.name= string;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
