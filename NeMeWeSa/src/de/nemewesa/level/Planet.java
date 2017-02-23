package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.character.Human;
import de.nemewesa.helper.Helper;
import de.nemewesa.modules.Defence;

public class Planet implements Generetable{
	
	public Moon moonName;
	public int citizen;
	public ArrayList<Ressource> ressource = new ArrayList<>();
	public SpaceStation stationName;
	public Defence defenceName;
	public boolean captured = false;
	public String name;
	// size des planeten zwischen 
	public int size;
	public Solarsystem parent;
	public String[] firstname = {"Ben", "Pe", "To", "Jau", "Ja", "Ter", "Masz", "Res", "Min", "Ro", "Sen", "Ta", "Bue", "Ur", "Ban", "Iak", "Dzi", "Ko", "Wi", "Cki"};
	/* 
	 * wenn das raumschiff zb. 10 plaetze frei hat
	 * laesst sich ueber den space festlegen wieviel man tragen kann
	 * Name, value, amount, space, grow(in steps), dropChance 
	 */
	Ressource bronze = new Ressource("Bronze", 1, Helper.random(1, 50), 2, 4, 85);
	Ressource silver = new Ressource("Silber", 2, Helper.random(1, 40),  2, 6, 50);
	Ressource gold = new Ressource("Gold", 3, Helper.random(1, 30), 2, 8, 30);
	Ressource jewel= new Ressource("Juwel", 5, Helper.random(1, 10), 1, 10, 10);
	
	// max 20 einwohner
	Human alien = new Human("Aliens", Helper.random(0, 20));
	
	public Planet(String name, Solarsystem parent) {
		this.name = generateName();
		this.parent = parent;
		this.size = Helper.random(100, 1000);
		this.citizen = alien.amount;
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
	
//	public int income() {
//		//sd
//		return int;
//	}

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

}
