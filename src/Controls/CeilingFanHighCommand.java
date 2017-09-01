package Controls;

import Servers.CeilingFan;

public class CeilingFanHighCommand implements Command {
	CeilingFan fan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan fan) {
		this.fan=fan;
	}
	@Override
	public void execute() {
		prevSpeed=fan.getSpeed();
		fan.high();
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(prevSpeed==CeilingFan.HIGH) {
			fan.high();
		} else 		if(prevSpeed==CeilingFan.MEDIUM) {
			fan.medium();
		} else 		if(prevSpeed==CeilingFan.LOW) {
			fan.low();
		} else		if(prevSpeed==CeilingFan.OFF) {
			fan.off();
		} 
	}

}
