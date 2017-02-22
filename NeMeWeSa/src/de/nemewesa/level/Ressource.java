package de.nemewesa.level;

import de.nemewesa.helper.Helper;

public class Ressource {
	
	public String resourceName;
	/*
	 * value	 = 	0 bronze, 1 = silber, 2= gold .. je höher die zahl desto 
	 * 				höher der wert
	 * weigth 	= 	wieviel "platz" nimmt die ressource weg, oder wieviel kg/t 
	 * 				wiegt eine einheit davon
	 * grow		=	in welchen abstand kommt wieder eine einheit	
	 */
	public int value;2
	public int weigth;
	public int grow;
	public int dropChance;
	
	public Ressource(String resourceName, int value, int weigth, int grow)
	{ 
		this.resourceName = resourceName;
		this.value = value;
		this.weigth = weigth;
		this.grow = grow;
	}  
	

}
