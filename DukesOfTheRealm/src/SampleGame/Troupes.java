package SampleGame;

import java.util.ArrayList;

public class Troupes {
	
	private String name;
	private int cout;
	private int temps;
	private int vitesse;
	private int vie;
	private int degat;
	
	public Troupes(String t) {
		switch(t) {
		case "Piquier" : 
			Piquier();
			break;
		case "Chevalier" :
			Chevalier();
			break;
		case "Onagre" : 
			Onagre();
			break;
		}
	}
	
	public static ArrayList<Troupes> createTroupes(int p, int c, int o) {
		ArrayList<Troupes> tab = new ArrayList<Troupes>();
		
		for(int i = 0; i < p; i++) {
			tab.add(new Troupes("Piquier"));
		}
		
		for(int i = 0; i < c; i++) {
			tab.add(new Troupes("Chevalier"));
		}
		
		for(int i = 0; i < o; i++) {
			tab.add(new Troupes("Onagre"));
		}
		
		return tab;
	}
	
	void damage(ArrayList<Troupes> t, int d) {	// TO CHANGE : recuperer les degats de la cible attaquante
		int rand = (int) Math.random() * t.size();
		Troupes troupe = t.get(rand);
		
		int new_d = d - troupe.vie;
		troupe.vie = troupe.vie - d;
		
		if(troupe.vie <= 0) {
			t.remove(rand);
		}
		
		if(t.isEmpty()) {	// Gerer le cas de toutes les troupes mortes
			t.clear();
		}
		else if(new_d > 0) {
			damage(t, new_d);
		}
		
	}
	
	Troupes Piquier() {
		this.name = "Piquier";
		this.cout = 100;
		this.temps = 5;
		this.vitesse = 2;
		this.vie = 1;
		this.degat = 1;
		return null;
	}
	
	Troupes Chevalier() {
		this.name = "Chevalier";
		this.cout = 500;
		this.temps = 20;
		this.vitesse = 6;
		this.vie = 3;
		this.degat = 5;
		return null;
	}
	
	Troupes Onagre() {
		this.name = "Onagre";
		this.cout = 1000;
		this.temps = 50;
		this.vitesse = 1;
		this.vie = 5;
		this.degat = 10;
		return null;
	}

	// getters & setters 
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Troupes : " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}
	
}
