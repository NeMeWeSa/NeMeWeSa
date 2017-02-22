package de.nemewesa.level;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Sector implements Generetable{
	
	public String name;
	public Level parent;
	
	private ArrayList<Solarsystem> solarsystems = new ArrayList<>();
	
	public Sector(String name, Level parent){
		this.name = name;
		this.parent = parent;
	}

	@Override
	public void generate(int element){

		String solarsystemname = null;
		String filename = "level\\" + Level.level + "\\solarsystems\\" + element + "\\solarsystems.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			//FileReader fr = new FileReader(filename);
			//BufferedReader br = new BufferedReader(fr);

			while ((solarsystemname = br.readLine()) != null) {
				this.solarsystems.add(new Solarsystem(solarsystemname, this));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public void printChildren(){
		
		for (Solarsystem solarsystem : solarsystems) {
			System.out.println(solarsystem.name + " : " + solarsystem.parent.name);
		}
		
	}

}
