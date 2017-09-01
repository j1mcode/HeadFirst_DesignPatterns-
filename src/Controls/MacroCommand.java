package Controls;

public class MacroCommand implements Command {
	Command[] Commands;
	
	public MacroCommand(Command[] commands) {
		this.Commands=commands;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<Commands.length;i++) {
			Commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(int i=0;i<Commands.length;i++) {
			Commands[i].undo();
		}
	}

}
