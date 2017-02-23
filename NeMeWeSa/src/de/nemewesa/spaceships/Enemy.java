package de.nemewesa.spaceships;

public class Enemy {
	
//	public String enemyName;
	public  int enemyHealth;
	public  int enemyStrange;
	public  Object greenAlien;
	
	public int enemyAttack(Fighter target)
	{
		return target.shipHealth = target.shipHealth - this.enemyStrange;
	}

	//public int enemyPower;
	

}
