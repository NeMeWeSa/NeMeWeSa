package de.nemewesa.level;

public class Enemy {
	
//	public String enemyName;
	public  int enemyHealth;
	public  int enemyStrange;
	public  Object greenAlien;
	
	public int enemyAttack(Spaceship target)
	{
		return target.shipHealth = target.shipHealth - this.enemyStrange;
	}

	//public int enemyPower;
	

}
