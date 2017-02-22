package de.nemewesa.level;

import de.nemewesa.helper.Helper;

public class App {
	
   public static void main(String[] args) throws Exception {
      
	   Level level = new Level(1);
	   level.generate();
	   level.printChildren();
	   
	   for(int i = 0; i < 100; i++){
		   
		   int myVar = Helper.random(1, 10);
		   
		   System.out.println(myVar);
		   
	   }

   }
   
}
