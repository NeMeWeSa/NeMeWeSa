package de.nemewesa.level;

import java.util.ArrayList;

import de.nemewesa.helper.Helper;

public class Solarsystem implements Generetable{
	
	public String name;
	public Sector parent;
//	private ArrayList<Planet> planets = new ArrayList<>();
	public int plus3 = Helper.random(1, 3);
	
	public Solarsystem(String name, Sector parent){
		this.name = name;
		this.parent = parent;
	}
	
	@Override
	public void generate(int element) {
		
	}

	@Override
	public void printChildren() {
		
	}
 
}
