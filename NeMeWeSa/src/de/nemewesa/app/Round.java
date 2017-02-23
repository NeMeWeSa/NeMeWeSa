package de.nemewesa.app;

import java.util.ArrayList;

public class Round implements Subject{
	
	private static final Round roundInstance = new Round();
	private ArrayList<Observer> observers;
	
	int round = 0;
	
	// Singelton Pattern
	private Round(){
		observers = new ArrayList<Observer>();		
	}

	// Die Instanz kann nur ueber getInstance geholt werden 
	public static Round getRound(){
		return roundInstance;
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.round);
		}
	}
	
	public void roundChanged() {
		notifyObservers();
	}
	
	public void setNewRound() {
		this.round += 1;
		roundChanged();
	}

}
