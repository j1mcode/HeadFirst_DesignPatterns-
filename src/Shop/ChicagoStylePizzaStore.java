package Shop;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
				if(type.equals("cheese")) {
					return new ChicagoStyleCheesePizza();
				}
				else return null;// TODO Auto-generated method stub
		
	}

}
