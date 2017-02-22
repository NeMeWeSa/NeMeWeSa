package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.helper.Helper;
import de.nemewesa.modules.Defence;

public class Planet implements Generetable{
	
	public Moon moonName;
	public String citizen;
	public ArrayList<Ressource> ressource;
	public SpaceStation stationName;
	public Defence defenceName;
	public boolean minePosible;
	public String name;
	public Solarsystem parent;
	public String[] firstname = {"Ben", "Pe", "To", "Jau", "Ja", "Ter", "Masz", "Res", "Min", "Ro", "Sen", "Ta", "Bue", "Ur", "Ban", "Iak", "Dzi", "Ko", "Wi", "Cki"};
	Ressource gold = new Ressource("Gold", 1, 1, 1);
	
	public Planet(String name, Solarsystem parent) {
		this.name = generateName();
		this.parent = parent;
	}

	public static void defending()
	{
		//defencePower
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
	
	

}
