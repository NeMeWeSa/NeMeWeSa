package de.nemewesa.level;

import de.nemewesa.helper.Helper;

public class Ressource {
	
	public String resourceName;
	/*
	 * value	 = 	0 bronze, 1 = silber, 2= gold ..... je hoeher die zahl desto 
	 * 				hoeher der wert
	 * weigth 	= 	wieviel "platz" nimmt die ressource weg, oder wieviel kg/t 
	 * 				wiegt eine einheit davon
	 * grow		=	in welchen abstand kommt wieder eine einheit	
	 */
	public int value;
	public int space;
	public int grow;	
	public int amount;	
	public int dropRate;
	
	public Ressource(String resourceName, int value, int amount, int space, int grow, int dropChance)
	{ 
		this.resourceName = resourceName;
		this.value = value;
		this.space = space;
		this.amount = amount;
		// grow wird bestimmt durch den modolu spaeter
		// grow%4 = 0 kupfer waechst alle 4 Runden nach
		// grow%6 = 0 silber waechst alle 4 Runden nach 
		// .....
		this.grow = grow;
		this.dropRate = dropChance;
	}  
	

}
