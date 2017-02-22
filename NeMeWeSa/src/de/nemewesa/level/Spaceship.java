package de.nemewesa.level;

import java.util.ArrayList;

public class Spaceship {
	
	public String shipName;
	public String shipType;
	public int shipHealth;
	public int shipStrange;
	public int shipFuel;
	
	public static ArrayList<Resource> stock; 
	
	public static void fly()
	{
		
	}
	
	public int shipAttack(Enemy target)
	{
		return target.enemyHealth = target.enemyHealth - this.shipStrange;
	}
	
	// Zugehörigkeit zum Mond. 
	// Hier wird der Mond erobert
	public boolean capturing(Moon affiliation)
	{
		System.out.println("Glückwunsch! "+ affiliation.moonName + " wurde erobert!!!");
		return affiliation.captured = true;
				
	}
	
	
	

}
