package com.gamepieces;

import com.descriptions.RobotInterface;

public class R2D2 extends Robot implements RobotInterface {
	
	protected int wheels = 3;
	protected boolean hasLazer = false;
	
	

	
	public R2D2(int locastion, int health, float xp, String id, String type, int wheels, boolean hasLazer) {
		super(locastion, health, xp, id, type);
		this.wheels = wheels;
		this.hasLazer = hasLazer;
	}
	
	

	public R2D2() {
	}

	


	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public boolean isHasLazer() {
		return hasLazer;
	}



	public void setHasLazer(boolean hasLazer) {
		this.hasLazer = hasLazer;
	}



	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeATurn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int whereAmI() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void powerDown() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int refuel() {
		// TODO Auto-generated method stub
		return 0;
	}
}
