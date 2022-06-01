package com.Challenge14;

public class Lamp {
	private String style;
	private boolean battery;
	private int glonRating;
	public Lamp(String style, boolean battery, int glonRating) {
		this.style = style;
		this.battery = battery;
		this.glonRating = glonRating;
	}
	public void turnOn () {
		System.out.println("Lamp -> Turning on");
	}
	public String getStyle() {
		return style;
	}
	public boolean isBattery() {
		return battery;
	}
	public int getGlonRating() {
		return glonRating;
	}
	
	
	
	
	
	

}
