package de.nemewesa.spaceships;

import de.nemewesa.character.Enemy;
import de.nemewesa.level.Planet;
import de.nemewesa.level.SpaceStation;
import de.nemewesa.level.Storage;

public class Transporter extends Spaceship{
	
	
	
	public Storage capacity;

	public Transporter(String shipName, String shipType, int shipHealth, int shipStrange, int shipFuel, Storage capacity) {
		super(shipName,shipType, shipHealth, shipStrange, shipFuel);
		this.capacity = capacity;
	}
	
	
	
//	public Transporter(int capacity){
//		super("Donkey","Transporter",60,10,500);
//		this.capacity = capacity;
//	}
	
	public void die()
	{
		System.out.println(this.shipName + " ist zerstört!!!");
	}
	
	// nehme ich gleich raus
	public int shipAttack(Enemy target)
	{
		return target.enemyHealth = target.enemyHealth - this.shipStrange;
	}
	
	//Hier wird der Rohsrtoff vom gewählten PLANETEN AUFGENOMMEN
	public int pickUp(Planet start)
	{	
		// Es geht nicht weil ich ein Inhalt von einer ArrayList von ner anderen abziehen will und die zwei werte haben
		if(Resource.lot < 1000 )
		{
			for(int weight: Planet.ressource)
			{
				if(Planet.resourceName.equals(Transporter.resourceName))
				{
					
				}
			}
			return  start.resourceStock = start.resourceStock - capacity;
		}
		
		 
	 
	}
	
	// Die Frage ist ob man wirklich diese Methode braucht?
	public void transport()
	{
		
	}
	
	// Hier wird der Rohstoff in der jeweiligen Raumstation abgelegt
	public int dropDown(SpaceStation goal)
	{
		return goal.warehouse = goal.warehouse + capacity;
	}

}
