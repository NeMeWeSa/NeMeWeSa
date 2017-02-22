package de.nemewesa.level;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Solarsystem implements Generetable{
	
	public String name;
	public Sector parent;
	private ArrayList<Planet> planets = new ArrayList<>();
	
	public Solarsystem(String name, Sector parent){
		this.name = name;
		this.parent = parent;
	}
	
	public Planet getPlanet (int index) {
		return planets.get(index);
	}	
	
	@Override
	public void generate(int element){

		String planetname = null;
		String filename = "level\\" + Level.level + "\\planets\\" + element + "\\planets.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			while ((planetname = br.readLine()) != null) {
				this.planets.add(new Planet(planetname, this));
			}
			
//			for (int i = 0; i < planets.size(); i++) {
//				planets.get(i).generate(i);
//			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

	@Override
	public void printChildren() {
		
		for (Planet planet : planets) {
			System.out.println(planet.name + " : " + planet.parent.name);
			//planet.printChildren();
		}
		
	}
 
}
