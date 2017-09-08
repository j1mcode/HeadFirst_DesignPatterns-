package GUMBALL_StatePattern;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state=soldOutState;
	int count =0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState= new SoldOutState(this);
		noQuarterState= new NoQuarterState(this);
		hasQuarterState= new HasQuarterState(this);
		soldState= new SoldState(this);
		winnerState=new WinnerState(this);
		this.count=numberGumballs;
		if(numberGumballs>0) {
			state=noQuarterState;
		}
	}
	public void insertQuarter() {
		state.insertQuarter();
	}
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	void setState(State state) {
		this.state=state;
	}
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count!=0) {
			count--;
		}
	}
	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState ;
	}
	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}
	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	public State getWinnerState() {
		// TODO Auto-generated method stub
		return winnerState;
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2014");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	public void refill(int count) {
		this.count=count;
		state=noQuarterState;
	}
	}
