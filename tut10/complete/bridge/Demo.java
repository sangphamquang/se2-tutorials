package tuts.tut10.complete.bridge;

import tuts.tut10.complete.bridge.devices.Device;
import tuts.tut10.complete.bridge.devices.Radio;
import tuts.tut10.complete.bridge.devices.Tv;
import tuts.tut10.complete.bridge.remotes.AdvancedRemote;
import tuts.tut10.complete.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}

	//TO-DO: Implement the method testDevice()
	public static void testDevice(Device device) {
		System.out.println("Tests with basic remote.");
		//Create the new BasicRemote instance
                BasicRemote br = new AdvancedRemote(device);
		//Power on the device
		 br.power();
		//Display the status of device
		 device.printStatus();

		System.out.println("Tests with advanced remote.");
		//Create the new AdvancedRemote instance
                AdvancedRemote ar = new AdvancedRemote(device);
		//Power on the device
		ar.power();
		//Mute the device
		ar.mute();
		//Display the status of device
		device.printStatus();
	}
}
