package de.nemewesa.spaceships;

import de.nemewesa.buildings.Storage;
import de.nemewesa.character.Enemy;
import de.nemewesa.level.Planet;
import de.nemewesa.level.Resource;
import de.nemewesa.level.SpaceStation;

public class Transporter extends Spaceship{
	
	//private static Object resourceName;
	public Storage storage;

	public Transporter(String shipName, String shipType, int shipHealth, int shipStrange, int shipFuel, Storage storage, Planet currentPlanet) {
		super(shipName, shipType, shipHealth, shipStrange, shipFuel, currentPlanet);
		this.storage = storage;
	}
	
	
	public void die()
	{
		System.out.println(this.shipName + " ist zerstört!!!");
	}
	
	// nehme ich gleich raus
	public int shipAttack(Enemy target)
	{
		return target.enemyHealth = target.enemyHealth - this.shipStrange;
	}
	// Lösche ich gleich	
	public void fly(Planet planet)
	{
		this.currentPlanet = planet;
	}
	
	
	//Hier wird der Rohsrtoff vom gewählten PLANETEN AUFGENOMMEN
	
	
	// http://stackoverflow.com/questions/19602601/create-an-arraylist-with-multiple-object-types
	//Also erstmal muss ich jede unterschiedliche Ressource als eigenes Objekt deklarieren
	// Dann muss ich zu jedem einzelnen Objekt dazupacken oder abziehen
	public void pickUp(Resource amount)
	{	
		// Es geht nicht weil ich ein Inhalt von einer ArrayList von ner anderen abziehen will und die zwei werte haben
		// 
		if(Planet.amount > 0) // Hier will ich erst gucken ob der Planet rohstoffe zum abholen hat
		{
			for(int gold: Planet.resource) // Hier will ich auf die arrayliste vom Lager des Planeten 
			{
				resource.remove(amount.amount); // Hier will ich die Elemte(Rohstoffe) löschen.
			}
		}
		else 
			{	
				System.out.println("Hier gibt es keine Rohstoffe die man abholen kann! ");	
			}
		}
//		
//		 
//	 
//	}
	
	// Die Frage ist ob man wirklich diese Methode braucht?
	public void transport()
	{
		
	}
	
	// Hier wird der Rohstoff in der jeweiligen Raumstation abgelegt
//	public int dropDown(SpaceStation goal)
//	{
//		return goal.warehouse = goal.warehouse + capacity;
//	}

}
