package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.helper.Helper;

public class App {
	
   public static void main(String[] args) throws Exception {
      
	   Level level = new Level(1);
	   level.generate();
	   level.printChildren();
	   
	   for(int i = 0; i < 3; i++){
		   
		   int myVar = Helper.random(1, 3);
		   
		   System.out.println(myVar);
	   }   
		   
		   // Peters Teil.
		   // Erstellte Objekte um zu schauen ob die methoden funktionieren
		   
		   SpaceStation alpha = new SpaceStation();
			alpha.stationName = "alpha";
			
			
			Moon luna = new Moon();
			luna.moonName = "Luna";
			luna.captured = false;
			
			ArrayList<Resource> stock1 = new ArrayList<>();
			Spaceship fighter = new Spaceship();
			fighter.shipHealth = 100;
			fighter.shipStrange = 10;
			
			Enemy greenAlien = new Enemy();
			greenAlien.enemyHealth = 20;
			greenAlien.enemyStrange = 15;
			
			Enemy redAlien = new Enemy();
			redAlien.enemyHealth = 40;
			redAlien.enemyStrange = 30;
			
			// Hier attackiere ich als probe den Fighter(es klappt)
			greenAlien.enemyAttack(fighter);
			redAlien.enemyAttack(fighter);
			fighter.shipAttack(redAlien);
			fighter.shipAttack(redAlien);
			fighter.shipAttack(redAlien);
			fighter.shipAttack(redAlien);
			
			//Enemy.attack();
			//Enemy.attack(greenAlien);
			
			if(redAlien.enemyHealth <= 0)
			{
				fighter.capturing(luna);
				
			}
			
			System.out.println("Fighter Health = "+ fighter.shipHealth);
			System.out.println("RedAlien Health = "+ redAlien.enemyHealth);
			System.out.println("Ist Luna erobert " + luna.captured);
		   
	   }

}
