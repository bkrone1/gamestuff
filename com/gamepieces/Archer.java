package com.gamepieces;

public class Archer extends Human implements HumanInterface{

	protected boolean hasBow = false;
	protected int numberOfArrows = 0;

	public Archer(int locastion, int health, float xp, String name, String gender, boolean hasBow, int numberOfArrows) {
		super(locastion, health, xp, name, gender);
		this.hasBow = hasBow;
		this.numberOfArrows = numberOfArrows;
	}

	public Archer() {
	}

	public boolean isHasBow() {
		return hasBow;
	}

	public void setHasBow(boolean hasBow) {
		this.hasBow = hasBow;
	}

	public int getNumberOfArrows() {
		return numberOfArrows;
	}

	public void setNumberOfArrows(int numberOfArrows) {
		this.numberOfArrows = numberOfArrows;
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
	public void eats() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleeps() {
		// TODO Auto-generated method stub
		
	}

}
