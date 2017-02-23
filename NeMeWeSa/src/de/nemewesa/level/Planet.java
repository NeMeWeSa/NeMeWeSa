package de.nemewesa.level;

import java.util.ArrayList;


import de.nemewesa.app.Observer;
import de.nemewesa.app.Round;
import de.nemewesa.app.Savable;
import de.nemewesa.helper.Helper;
import de.nemewesa.modules.Defence;

public class Planet implements Generetable, Observer{
	
	public Moon moonName;
	// max 20 einwohner
	public int citizen;
	public ArrayList<Ressource> ressource = new ArrayList<>();
	public SpaceStation stationName;
	public Defence defenceName;
	public boolean captured = false;
	public String name;
	public Round round;
	public int storage;
	// size des planeten zwischen 
	public int size;
	public Solarsystem parent;
	public String[] firstname = {"Ben", "Pe", "To", "Jau", "Ja", "Ter", "Masz", "Res", "Min", "Ro", "Sen", "Ta", "Bue", "Ur", "Ban", "Iak", "Dzi", "Ko", "Wi", "Cki"};
	/* 
	 * wenn das raumschiff zb. 10 plaetze frei hat
	 * laesst sich ueber den space festlegen wieviel man tragen kann
	 * Name, value, amount, int mine, space, grow(in steps), dropChance 
	 */
	Ressource bronze = new Ressource("Bronze", 1, Helper.random(1, 50), 2, 2, 8, 85);
	Ressource silver = new Ressource("Silber", 2, Helper.random(1, 40), 2,  2, 10, 50);
	Ressource gold = new Ressource("Gold", 3, Helper.random(1, 30), 2, 2, 12, 30);
	Ressource jewel= new Ressource("Juwel", 5, Helper.random(1, 10), 3, 1, 14, 10);
	
	
	public Planet(String name, Solarsystem parent) {
		this.name = generateName();
		this.parent = parent;
		this.size = Helper.random(100, 1000);
		this.citizen = Helper.random(1, 20);
		// Die Menge die die leute sammeln koennen
		this.storage = (this.citizen*2)+5;
		this.round  = Round.getRound();
		this.round.registerObserver(this);
		/*
		 * Per Zufall entscheiden anhand der Werte von Ressourcen
		 * ob ein Planet auch die Ressourcen hat
		 */
		if(Helper.random(0, 100)<bronze.dropRate) {
			this.ressource.add(bronze);
		}
		if(Helper.random(0, 100)<silver.dropRate) {
			this.ressource.add(silver);
		}
		if(Helper.random(0, 100)<gold.dropRate) {
			this.ressource.add(gold);
		}
		if(Helper.random(0, 100)<jewel.dropRate) {
			this.ressource.add(jewel);
		}
	}
	
	public int grow(int number) {
		if(number%Round.getRound() == 0) {
			return 1;
		}
		return 0;
	}	
	

	public void income() {
		 if(this.ressource.contains(bronze)) {
			 System.out.println("bronze");
		 }
		 if(this.ressource.contains(silver)) {
			 System.out.println("silver");
		 }
		 if(this.ressource.contains(gold)) {
			 System.out.println("gold");
		 }
		 if(this.ressource.contains(jewel)) {
			 System.out.println("juwel");
		 }
	}

	@Override
	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}

	public ArrayList<Ressource> getRessource() {
		return this.ressource;
	}

	@Override
	public void generate(int element) {
		
	}

	@Override
	public void printChildren() {
		
	}
	
	public String generateName() {
		String name1 = firstname[Helper.random(0, firstname.length)];
		String name2 = firstname[Helper.random(0, firstname.length)];
				if(name1.equals(name2)) {
			name1 = firstname[Helper.random(0, firstname.length)];
		}
		String name4 = name1 + name2.toLowerCase();
		if(name4.length()<7) {
			return name4;
		}
		return name4+firstname[Helper.random(0, firstname.length)].toLowerCase();
	}
	
	public void generateRessource() {
		
	}
	
	public static void defending()
	{
		//defencePower
	}

	@Override
	public void update(int round) {
		System.out.println(this.name + " lautet die Runde " + round + " ein.");
	}

}
