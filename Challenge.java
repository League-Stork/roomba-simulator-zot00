package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
driveDirect(500,500);
sleep(2000);
driveDirect(250,500);
sleep(1525);
driveDirect(500,500);
sleep(6000);
driveDirect(250,500);
sleep(1005);
driveDirect(55555,55555);
	}

	public void loop() {
	
	}
}
