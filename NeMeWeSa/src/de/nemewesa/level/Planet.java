package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.app.Observer;
import de.nemewesa.app.Round;
import de.nemewesa.helper.Helper;
import de.nemewesa.modules.Defence;

public class Planet implements Generetable, Observer{
	
	public static Object resourceName;
	public Moon moonName;
	// max 20 einwohner
	public int citizen;
	public ArrayList<Resource> resource = new ArrayList<>();

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
	// 10 50,  5 40 , 3 30,   1 10
	Resource bronze = new Resource("Bronze", 1, 50, 2, 2, 8, 85);
	Resource silver = new Resource("Silber", 2,  40, 2,  2, 10, 50);
	Resource gold = new Resource("Gold", 3, 30, 2, 2, 12, 30);
	Resource jewel= new Resource("Juwel", 5, 10, 3, 1, 14, 10);
	
	
	public Planet(String name, Solarsystem parent) {
		this.name = generateName();
		this.parent = parent;
		this.size = Helper.random(100, 1000);
		this.citizen = Helper.random(5, 15);
		// Die Menge die die leute sammeln koennen
		this.storage = (this.citizen*2)+5;
		this.round  = Round.getRoundInstance();
		this.round.registerObserver(this);
		/*
		 * Per Zufall entscheiden anhand der Werte von Resourcen
		 * ob ein Planet auch die Resourcen hat
		 */
		if(Helper.random(0, 100)<bronze.dropRate) {
			this.resource.add(bronze);
		}
		if(Helper.random(0, 100)<silver.dropRate) {
			this.resource.add(silver);
		}
		if(Helper.random(0, 100)<gold.dropRate) { 
			this.resource.add(gold);
		}
		if(Helper.random(0, 100)<jewel.dropRate) {
			this.resource.add(jewel);
		}
	}
	

	public void generateResource(Resource res) {
		if(this.resource.contains(res)) {
			if(res.getGrow() % round.getRound() == 0) {
				res.amount +=1;
			}		
		}		
	}		

	// player.getCurrentPlanet().mine(player.getCurrentPlanet().resource.get(0));
	// zum farmen (0) wäre nun bronze WENN bronze vorhanden
	public void mine(Resource res) {
		if(captured = true) {
			if(this.resource.contains(res)) {
				res.amount -= 1;
			}
		}
	}
	

	public void income() {
		if(captured = true) {
		 if(this.resource.contains(bronze)) {
			 System.out.println("bronze");
		 }
		 if(this.resource.contains(silver)) {
			 System.out.println("silver");
		 }
		 if(this.resource.contains(gold)) {
			 System.out.println("gold");
		 }
		 if(this.resource.contains(jewel)) {
			 System.out.println("juwel");
		 }
		}
	}

	@Override
	public String getName() {
		return this.name;
	}
	public int getSize() {
		return this.size;
	}

	public ArrayList<Resource> getResource() {
		return this.resource;
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
	
	
	public static void defending()
	{
		//defencePower
	}

	@Override
	public void update(int round) {
		System.out.println(this.name + " lautet die Runde " + round + " ein.");
	}

}
