package Shop;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		
		// TODO Auto-generated method stub
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}
		else return null;
	}

}
