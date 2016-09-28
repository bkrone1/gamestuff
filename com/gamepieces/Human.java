package com.gamepieces;

public class Human extends CharacterClass {

	protected String name = null;
	protected String gender = null;

	public Human(int locastion, int health, float xp, String name, String gender) {
		super(locastion, health, xp);
		this.name = name;
		this.gender = gender;
	}

	public Human() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

}
