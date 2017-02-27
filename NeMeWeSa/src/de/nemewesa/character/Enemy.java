package de.nemewesa.character;

import de.nemewesa.helper.Helper;
import de.nemewesa.spaceships.Spaceship;

public class Enemy {
	
	public String[] enemyNames = {"Isiyah", "Hemtein", "Begkas", "Adajar", "Kaluru", "Begde", "Mahiani", "Zamzur", 
								 "Kulgul", "Qishin", "Najgul", "Najxu", "Mardram", "Altein", "Gioalie", "Eystar", 
								 "Qisuru", "Adagul", "Kulkas", "Nazetu"};
	public String name;
	public  int enemyHealth;
	public  int enemyAttack;
	public  Object greenAlien;
	
	public Enemy(String name, int enemyHealth, int enemyAttack) {
		this.name = enemyNames[Helper.random(0, enemyNames.length)];
		this.enemyHealth = Helper.random(25, 75);
		this.enemyAttack = Helper.random(3, 6);
	}
	public int enemyAttack(Spaceship target) {
		return target.shipHealth = target.shipHealth - this.enemyAttack;
	}

	
	

}
