package Servers;

public class Stereo {
	int Volume;
	String name;
	public Stereo(String name) {
		this.name=name;
	}
	public void on() {
		System.out.println("Stereo is on!");
	}
	public void off() {
		System.out.println("Stereo is off!");
	}
	public void setCd() {
		System.out.println("Cd is set!");
	}
	public void setDvd() {
		System.out.println("Dvd is set!");
	}
	public void setRadio() {
		System.out.println("Radio is set!");
	}
	public void setVolume(int i) {
		this.Volume=i;
		System.out.println("Volume is set on"+this.Volume);
	}
}
