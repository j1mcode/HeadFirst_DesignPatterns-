package Controls;

import Servers.CeilingFan;
import Servers.Light;
import Servers.Stereo;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight= new Light("Kitchen");
		Stereo stereo =new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		StereoOnWithCDCommand stereOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOff stereOff = new StereoOff(stereo);
		
		CeilingFanHighCommand highCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(ceilingFan);
		
		Command[] partyOn= {livingRoomLightOn,stereOnWithCD,kitchenLightOn,highCommand};
		Command[] partyOff= {livingRoomLightOff,kitchenLightOff,stereOff,lowCommand};
		
		MacroCommand partyOnMarco=new MacroCommand(partyOn);
		MacroCommand partyOffMarco=new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereOnWithCD, stereOff);
		remoteControl.setCommand(3, highCommand, lowCommand);
		remoteControl.setCommand(4, partyOnMarco, partyOffMarco);
		
		System.out.println(remoteControl);
		
	/*	remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPushed();*/
		remoteControl.onButtonWasPushed(4);
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPushed();
	}
}
