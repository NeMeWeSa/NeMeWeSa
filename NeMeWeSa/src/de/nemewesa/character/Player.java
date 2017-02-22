package de.nemewesa.character;

import de.nemewesa.app.App;
import de.nemewesa.level.Planet;
import de.nemewesa.level.Solarsystem;

public class Player {
	
	private String name;
	private Planet currentPlanet = null;
	private Planet homePlanet = null;
	private Solarsystem homeSolarsystem = null;
	
	private int ap = App.PLAYER_AP;
	
	public Player(String name){
		
		this.name = name;
		
	}
	
	public String toString(){
		String info = "";
		info += "[NeMeWeSa] Du befindest dich auf den Planeten " + this.currentPlanet.name + ".\n";
		info += "[NeMeWeSa] Dein Heimatplanet ist der " + this.homePlanet.name + ".\n";
		info += "[NeMeWeSa] Dein Heimat Solarsystem ist der " + this.homeSolarsystem.name + ".\n";
		return info;
	}
	
	public void setCurrentPlanet(Planet currPlanet){
		this.currentPlanet = currPlanet;
	}
	
	public void setHomePlanet(Planet homePlanet){
		this.homePlanet = homePlanet;
	}
	
	public void setHomeSolarsystem(Solarsystem homeSolarsystem){
		this.homeSolarsystem = homeSolarsystem;
	}	
	
	public Planet getCurrentPlanet(){
		return this.currentPlanet;
	}	
	
	public String getName(){
		return this.name;
	}

	public int getAp() {
		return ap;
	}
	
	

}
