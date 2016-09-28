package com.gamepieces;

public abstract class CharacterClass {

	protected int locastion = 0;
	protected int health = 20;
	protected float xp = 0.0f;

	public CharacterClass(int locastion, int health, float xp) {
		this.locastion = locastion;
		this.health = health;
		this.xp = xp;
	}

	public CharacterClass() {
	}

	public int getLocastion() {
		return locastion;
	}

	public void setLocastion(int locastion) {
		this.locastion = locastion;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public abstract void move();

	public abstract void takeATurn();

	public abstract void attack();

	public abstract int whereAmI();

}
