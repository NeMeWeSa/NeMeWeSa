package de.nemewesa.app;

import java.util.Scanner;

public class Console {
	
	
	public Login login(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[Login] Gebe bitte Deinen Loginnamen ein > ");
		String loginname = scanner.nextLine();
		System.out.println("[Login] Gebe bitte Dein Passwort ein > ");
		String pass = scanner.nextLine();	
	
		Login login = new Login(loginname, pass);
		return login;
		
	}
	
	
	
}
