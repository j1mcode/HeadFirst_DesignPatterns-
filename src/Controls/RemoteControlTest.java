package Controls;

import Servers.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light=new Light("light");
		LightOnCommand LightOn = new LightOnCommand(light);
		
		remote.setCommand(LightOn);
		remote.buttonwasPressed();
	}
}
