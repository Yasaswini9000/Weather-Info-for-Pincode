package com.example.Weather_Info._for_Pincode.dto;

public class Wind {

	private double speed;
	private int deg;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getDeg() {
		return deg;
	}

	public void setDeg(int deg) {
		this.deg = deg;
	}

	public Wind() {
	}

	public Wind(double speed, int deg) {
		this.speed = speed;
		this.deg = deg;
	}
}
