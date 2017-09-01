package Shop;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name="ChicagoStyleCheesePizza";
		//dough="Extra Thick Crust Dough";
		//sauce="Plum Tomato Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices ");
	}
}
