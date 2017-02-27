package de.nemewesa.level;

import de.nemewesa.character.Enemy;
import de.nemewesa.character.Player;

public class Moon {
	
	public String moonName;	
	public Enemy enemy;
	public Planet parent;
	public boolean captured = false;
	
	public Moon(String moonName, Enemy enemy, Planet parent) {
		this.moonName = moonName;
		this.enemy = enemy;
		this.parent = parent;
	}
	public void victory() {
		if(this.enemy.enemyHealth<0) {
			
			captured = true;
		}
	}

}
