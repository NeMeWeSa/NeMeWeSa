package de.nemewesa.app;



import java.util.ArrayList;
import java.util.Scanner;

import de.nemewesa.character.Enemy;
import de.nemewesa.helper.Helper;
import de.nemewesa.level.Level;
import de.nemewesa.level.Moon;
import de.nemewesa.level.Resource;
import de.nemewesa.level.SpaceStation;
import de.nemewesa.spaceships.Fighter;


public class App {
	
	public static final int PLAYER_AP = 20;

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
	
	public void createPlayer(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[Dungeon] Bitte geben Sie einen Spielernamen ein > ");
		String playerName = scanner.nextLine();
//		player = new Player(playerName);
//		player.setCurrentSpace(s_0_0);
//		
//		System.out.println("Willkommen im Dungeon " + player.getName());
//		System.out.println("[Spielzuege] w => nach Norden gehen");
//		System.out.println("[Spielzuege] d => nach Osten gehen");
//		System.out.println("[Spielzuege] s => nach Sueden gehen");
//		System.out.println("[Spielzuege] a => nach Westen gehen");
//		System.out.println("[Spielzuege] y => Gegenstand aufsammeln");
//		System.out.println("[Spielzuege] x => Gegenstand fallenlassen");
//		System.out.println("[Spielzuege] c => Inventar anzeigen");
//		System.out.println("[Spielzuege] q => Dungeon verlassen");
//		player.getCurrentSpace().showEnvironment();
		
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
