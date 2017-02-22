package de.nemewesa.character;

import de.nemewesa.app.App;
import de.nemewesa.level.Generetable;
import de.nemewesa.level.Planet;
import de.nemewesa.level.Solarsystem;

import java.util.ArrayList;

public class Player {
	
	private String name;
	private Planet currentPlanet = null;
	private Planet homePlanet = null;
	private Solarsystem homeSolarsystem = null;
	private ArrayList<Generetable> ownership = new ArrayList<>();
	
	private final transient int ap = App.PLAYER_AP;
	
	public Player(String name){
		this.name = name;
	}
	
	public String toString(){
		String info = "";
		info += "[NeMeWeSa] Du befindest dich auf dem Planeten " + this.currentPlanet.name + ".\n";
		info += "[NeMeWeSa] " + this.homePlanet.name + " ist dein Heimatplanet.\n";
		info += "[NeMeWeSa] Dein Heimat-Solarsystem ist der " + this.homeSolarsystem.name + ".\n";
		info += "[NeMeWeSa] Dein Besitz > \n";
		for(Generetable ownership : ownership){
			info += ownership.getClass().getSimpleName() + " : " + ownership.getName() +"\n";
		}
		return info;
	}

	public Generetable getOwnership(int index) {
		return this.ownership.get(index);
	}

	public void addOwnership(Generetable ownership) {
		this.ownership.add(ownership);
	}

	public void setCurrentPlanet(Planet currPlanet){
		this.currentPlanet = currPlanet;
	}

	public Planet getHomePlanet(){
		return this.homePlanet;
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
