package GUMBALL_StatePattern;

public class WinnerState implements State {
	GumballMachine gumballMachine;
	public  WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine=gumballMachine;
	}
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Wrong information");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Wrong information");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Wrong information");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You're a winner! you get two gumballs for your quarter!");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()==0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount()>0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.soldOutState);
			}
		}
	}

}
