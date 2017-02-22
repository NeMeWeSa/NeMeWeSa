package de.nemewesa.level;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Solarsystem implements Generetable{
	
	public String name;
	public Sector parent;
	private ArrayList<Planet> planets = new ArrayList<>();
	//public int plus3 = Helper.random(1, 3);
	
	public Solarsystem(String name, Sector parent){
		this.name = name;
		this.parent = parent;
	}
	
	@Override
	public void generate(int element) {
		String planetname = null;
		String filename = "level\\" + Level.level + "\\planets\\" + element + "\\planets.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			//FileReader fr = new FileReader(filename);
			//BufferedReader br = new BufferedReader(fr);

			while ((planetname = br.readLine()) != null) {
				this.planets.add(new Planet(planetname, this));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void printChildren() {
		
	}
 
}
