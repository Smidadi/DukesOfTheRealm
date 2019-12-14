package SampleGame;

import java.util.ArrayList;

public class Troupes {
	
	protected String name;
	protected int cout;
	protected int temps;
	protected int vitesse;
	protected int vie;
	protected int degat;
	
	// Taille troupes : 10 px | Piquier : triangle | Onagre : carre | Chevalier : rond
	
	public static ArrayList<Troupes> createTroupes(int p, int c, int o) {
		ArrayList<Troupes> tab = new ArrayList<Troupes>();
		
		for(int i = 0; i < p; i++) {
			tab.add(new Piquier());
		}
		
		for(int i = 0; i < c; i++) {
			tab.add(new Chevalier());
		}
		
		for(int i = 0; i < o; i++) {
			tab.add(new Onagre());
		}
		
		return tab;
	}

	public int getDamage(ArrayList<Troupes> tab) {	// Fonction permettant de faire des degats a la cible
		int rand = (int) Math.random() * tab.size();
		Troupes troupe_to_attack = tab.get(rand);
		int d = 0;
		
		troupe_to_attack.vie = troupe_to_attack.vie - this.degat;
		if(troupe_to_attack.vie <= 0) {
			d = -troupe_to_attack.vie;
			tab.remove(troupe_to_attack);
		}
		
		if(tab.isEmpty()) {
			tab.clear();
			d = 0;
			// case winner
		}
		
		return d;
		// gerer le cas du rappel de fonction avec les degats restants, pour l'instant : retourner d et rappeler si besoin
	}	


	// getters & setters 
	
	@Override
	public String toString() {
		return "Troupes : ";
	}

	public String getName() {
		return name;
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
