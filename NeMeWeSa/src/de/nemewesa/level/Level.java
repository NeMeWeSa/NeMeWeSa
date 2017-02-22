package de.nemewesa.level;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Level{

	public static int level;

	private ArrayList<Sector> sectors = new ArrayList<>();
	//private ArrayList<>


	public Level(int level){
		Level.level = level;
	}


	public void generate(){

		String sectorname = null;
		String filename = "level\\" + Level.level + "\\sectors\\sectors.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			//FileReader fr = new FileReader(filename);
			//BufferedReader br = new BufferedReader(fr);

			while ((sectorname = br.readLine()) != null) {
				this.sectors.add(new Sector(sectorname, this));
			}
			
			for (int i = 0; i < sectors.size(); i++) {
				sectors.get(i).generate(i);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public void printChildren(){
		
		for (Sector sector : sectors) {
			System.out.println(sector.name + " : " + sector.parent.getClass().getSimpleName());
			sector.printChildren();
		}
		
	}

}
