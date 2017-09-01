package Controls;

import Servers.Stereo;

public class StereoOff implements Command{
	Stereo stereo;
	
	public StereoOff(Stereo stereo) {
		this.stereo=stereo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}

}
