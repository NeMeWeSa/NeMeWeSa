package de.nemewesa.spaceships;

import de.nemewesa.character.Enemy;
import de.nemewesa.level.Moon;

public class Fighter extends Spaceship {
	
	public Fighter(){
		super("Rambo","Fighter",100,10,200);
	}
	
//	public Fighter(String shipName, String shipType, int shipHealth, int shipStrange, int shipFuel)
//	{
//		super( shipName,  shipType, int shipHealth, int shipStrange, int shipFuel);
//	}

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
	
	public void die()
	{
		System.out.println(this.shipName + " ist zerstört!!!");
	}
}
