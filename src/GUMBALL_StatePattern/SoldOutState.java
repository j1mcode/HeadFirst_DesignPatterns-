package GUMBALL_StatePattern;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	public  SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, Out of gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("No gumball to eject");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Somehow, it's useless");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

}
