package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.modules.Defence;

public class Planet implements Generetable{
	
	public Moon moonName;
	public String citizen;
	public ArrayList<Resource> resourceStock;
	public SpaceStation stationName;
	public Defence defenceName;
	public boolean minePosible;
	public String name;
	public Solarsystem parent;
	
	public Planet(String name, Solarsystem parent) {
		this.name = name;
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
	

}
