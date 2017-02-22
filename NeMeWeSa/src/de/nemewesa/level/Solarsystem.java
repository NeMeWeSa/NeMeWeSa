package de.nemewesa.level;

import java.util.ArrayList;

public class Solarsystem implements Generetable{
	
	public String name;
	public Sector parent;
//	private ArrayList<Planet> planets = new ArrayList<>();	
	
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
