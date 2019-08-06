package com.amar.letslearn.limitsservice.bean;

public class LimitConfiguration {
	private int minimum;
	private int maximum;
	public LimitConfiguration(int min, int max) {
		this.minimum = min;
		this.maximum = max;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	

}
