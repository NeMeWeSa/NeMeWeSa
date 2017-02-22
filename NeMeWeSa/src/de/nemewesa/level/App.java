package de.nemewesa.level;



import java.util.ArrayList;

import de.nemewesa.helper.Helper;

public class App {
	
   public static void main(String[] args) throws Exception {
      
	   Level level = new Level(1);
	   level.generate();
	   level.printChildren();
	   
	   for(int i = 0; i < 100; i++){
		   
		   int myVar = Helper.random(1, 10);
		   
		   System.out.println(myVar);
		   
		   
		   // Peters Teil.
		   // Erstellte Objekte um zu schauen ob die methoden funktionieren
		   
		   SpaceStation alpha = new SpaceStation();
			alpha.stationName = "alpha";
			
			
			Moon luna = new Moon();
			luna.moonName = "Luna";
			luna.captured = false;
			
			ArrayList<Resource> stock1 = new ArrayList<>();
			Fighter rambo = new Fighter();
			
			Enemy greenAlien = new Enemy();
			greenAlien.enemyHealth = 20;
			greenAlien.enemyStrange = 15;
			
			Enemy redAlien = new Enemy();
			redAlien.enemyHealth = 40;
			redAlien.enemyStrange = 30;
			
			// Hier attackiere ich als probe den Fighter(es klappt)
		//	greenAlien.enemyAttack(rambo);
			redAlien.enemyAttack(rambo);
			rambo.shipAttack(redAlien);
			rambo.shipAttack(redAlien);
			rambo.shipAttack(redAlien);
			rambo.shipAttack(redAlien);
			
			//Enemy.attack();
			//Enemy.attack(greenAlien);
			
			if(redAlien.enemyHealth <= 0)
			{
				rambo.capturing(luna); 
				
			}
			
			System.out.println("Fighter Health = "+ rambo.shipHealth);
			System.out.println("RedAlien Health = "+ redAlien.enemyHealth);
			System.out.println("Ist Luna erobert " + luna.captured);
			
	   }

   }
   
}
