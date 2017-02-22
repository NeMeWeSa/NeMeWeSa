package de.nemewesa.app;



import java.util.ArrayList;

import de.nemewesa.character.Enemy;
import de.nemewesa.helper.Helper;
import de.nemewesa.level.Level;
import de.nemewesa.level.Moon;
import de.nemewesa.level.Resource;
import de.nemewesa.level.SpaceStation;
import de.nemewesa.spaceships.Fighter;

public class App {

	public static void main(String[] args) throws Exception {

		App app = new App();
		app.createNewLevel(1);

		app.runTests();
	}

	public void createNewLevel(int lev){
		Level level = new Level(lev);
		level.generate();
		level.printChildren();
	}

	public void runTests(){  

//			   for(int i = 0; i < 10; i++){
//				   
//				   int myVar = Helper.random(0, 2);
//				   
//				   System.out.println(myVar);
//				   
//			   }

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

		} //Test

		System.out.println("Fighter Health = "+ rambo.shipHealth);
		System.out.println("RedAlien Health = "+ redAlien.enemyHealth);
		System.out.println("Ist Luna erobert " + luna.captured);

	}

}
