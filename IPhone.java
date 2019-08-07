package com.maiya.phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
    public String ring() {
		String ringer = "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
    	return ringer;
    }

	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.format("iPhone %s from %s %n", this.getVersionNumber(), this.getCarrier());
	}
}
