package Controls;

public class SimpleRemoteControl {
	Command slot;
	public void setCommand(Command command) {
		slot=command;
	}
	
	public void buttonwasPressed() {
		slot.execute();
	}
}
