package de.nemewesa.app;

import de.nemewesa.buildings.Storage;
import de.nemewesa.character.Player;
import de.nemewesa.level.Level;
import de.nemewesa.level.Planet;
import de.nemewesa.level.Resource;
import de.nemewesa.spaceships.Transporter;


public class App {
	
	public static final int PLAYER_AP = 20;
	private Player player;
	private Level level;
	private Round round = Round.getRoundInstance();

	public static void main(String[] args) throws Exception {

		App app = new App();
		app.createNewLevel(1);
		app.createPlayer();
		app.runTests();
	}

	public void createNewLevel(int lev){
		level = new Level(lev);
		level.generate();
		//level.printChildren();
	}
	
	public void createPlayer(){ 
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("[NeMeWeSa] Bitte geben Sie einen Spielernamen ein > ");
		//String playerName = scanner.nextLine();
		player = new Player("tom");
		player.setCurrentPlanet(level.getSector(0).getSolarsystem(0).getPlanet(0));
		player.setHomePlanet(player.getCurrentPlanet());
		player.setHomeSolarsystem(level.getSector(0).getSolarsystem(0));
		// Dem Spieler wird der Heimatplanet zu seinem Besitztum hinzugefuegt
		player.addOwnership(player.getHomePlanet());
	
		System.out.println("[NeMeWeSa] Willkommen im NeMeWeSa " + player.getName());
		System.out.println(player);
			

	
	}
	
	public void createTransporter(Planet planet){
		Transporter transporter01 = new Transporter("t1", "Transporter", 100, 100, 100, new Storage());
		transporter01.currentPlanet = level.getSector(0).getSolarsystem(0).getPlanet(0);
	}

	public void runTests(){
		
		

		
		/*
		 * Planet Ressourcen Test
		 * Hier kann, wenn der Planet eingenommen wurde (Methode mine "captured == true"), nach Ressourcen gefarmt werden.
		 * mit mine() wird abgefarmt 
		 * mit generateResource() wieder Ressourcen erstellt (wenn denn der die Runde mit den Nachwuchsfaktor "ressource.grow"
		 * uebereinstimmt)
		 */
//		this.round.setNewRound();		
//			
//		for (int i = 0; i < 11; i++) {
////			player.getCurrentPlanet().income();
//			
//			
//			System.out.println(i + " Einwohner: " + player.getCurrentPlanet().citizen);
//			System.out.println(i + " amount " + player.getCurrentPlanet().bronze.amount);
//			System.out.println(i + " farm " + player.getCurrentPlanet().bronze.farm);
//			System.out.println(i + " bronze storage f = " + player.getCurrentPlanet().bronze.storagef);		
//			player.getCurrentPlanet().mineBronze();
//			player.getCurrentPlanet().income();
//			System.out.println(i + " income " + player.getCurrentPlanet().bronze.farm);
//			System.out.println(i + " bronze storage f = " + player.getCurrentPlanet().bronze.storagef);
//			System.out.println("----------------------------------------------------------------");
//		}



//		System.out.println(" Nach Wieviel Runden soll regeneriert werden "+ player.getCurrentPlanet().resource.get(0).getGrow());
//		System.out.println("Welche Runde ist aktuell: " +round.getRound());		
//		player.getCurrentPlanet().mine(player.getCurrentPlanet().resource.get(0));
//		player.getCurrentPlanet().generateResource(player.getCurrentPlanet().resource.get(0));
		
		//this.player.saveAsString("level\\" + Level.level + "\\saves\\playerString.dat");
		//this.player.save("level\\" + Level.level + "\\saves\\playerObj.dat");
		
		

//	   for(int i = 0; i < 10; i++){
//		   
//		   int myVar = Helper.random(0, 2);
//		   
//		   System.out.println(myVar);
//		   
//	   }

		// Peters Teil.
		// Erstellte Objekte um zu schauen ob die methoden funktionieren

		/*
		SpaceStation alpha = new SpaceStation();
		alpha.stationName = "alpha";


		Moon luna = new Moon();
		luna.moonName = "Luna";
		luna.captured = false;

		ArrayList<Ressource> stock1 = new ArrayList<>();
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
*/
		
	}

}
