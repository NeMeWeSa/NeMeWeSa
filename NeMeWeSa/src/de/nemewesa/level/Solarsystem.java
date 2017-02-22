package de.nemewesa.level;

public class Solarsystem implements Generetable{
	
	public String name;
	public Sector parent;
	//private ArrayList<Solarsystem> solarsystems = new ArrayList<>();	
	
	public Solarsystem(String name, Sector parent){
		this.name = name;
		this.parent = parent;
	}

	@Override
	public void generate(int element) {
		System.out.println("");
	}

	@Override
	public void printChildren() {
		
	}

}
