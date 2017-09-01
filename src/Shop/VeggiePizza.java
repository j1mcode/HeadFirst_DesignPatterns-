package Shop;

import Ingredient.PizzaIngredientFactory;
import Ingredient.Veggies;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = (Veggies[]) ingredientFactory.createVeggies();
	}
}
