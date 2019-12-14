gpackage SampleGame;

import java.util.ArrayList;

public class Castle {	// w : 1500 ; h : 1000 pour la map
	private String duc;
	private int tresor;
	private int niveau;
	private int revenu;
	
	private int piquier;	// ou type piquier / chevalier / onagre : voir après création de la class Troupes (anglais : Troupe)
	private int chevalier;
	private int onagre;
	
	private int production;		// type production : voir après création de la classe Troupes + mettre dans class Castle
	private int deplacement; 	// type : coordonnee
	
	ArrayList<Troupes> tabTroupes;
	//private Object castleDoor;
	 
	
	public Castle(String duc) {	// Chateau 50 * 50
		this.duc = duc;
		this.tresor = 0;
		this.niveau = 1;
		this.tabTroupes = Troupes.createTroupes(4,2,2);
		//this.castleDoor.getCenter();
	}
	
	public Castle() {	// Baron : possede un niveau alea entre 0 et 5 | chateau 25 * 25
		this.duc = "Baron";
		this.tresor = 0;
		this.niveau = (int) Math.random() * 5;
		this.tabTroupes = Troupes.createTroupes(3,3,3); // a definir
	}
	

	public void castleHasBeenDestroyed(Castle c) {
		c.duc = this.duc;		
	}
	
	public int countTroupes(String t, ArrayList<Troupes> tab) {
		int cpt = 0;
		switch(t) {
		case "Piquier" :
			for(int i = 0; i < tab.size(); i++) {
				if(tab.get(i).getName() == t) {
					cpt++;
				}
			}
			return cpt;
		case "Chevalier" :
			for(int i = 0; i < tab.size(); i++) {
				if(tab.get(i).getName() == t) {
					cpt++;
				}
			}
			return cpt;
		case "Onagre" :
			for(int i = 0; i < tab.size(); i++) {
				if(tab.get(i).getName() == t) {
					cpt++;
				}
			}
			return cpt;
		}
		return cpt;
	}
	
	void updateRevenu() {
		this.revenu = this.niveau * 10;
	}
	
	

	// getters & setters	

	public String getDuc() {
		return duc;
	}


	public void setDuc(String duc) {
		this.duc = duc;
	}


	public int getTresor() {
		return tresor;
	}


	public void setTresor(int tresor) {
		this.tresor = tresor;
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	public int getRevenu() {
		return revenu;
	}


	public void setRevenu(int revenu) {
		this.revenu = revenu;
	}


	public int getPiquier() {
		return piquier;
	}


	public void setPiquier(int piquier) {
		this.piquier = piquier;
	}


	public int getChevalier() {
		return chevalier;
	}


	public void setChevalier(int chevalier) {
		this.chevalier = chevalier;
	}


	public int getOnagre() {
		return onagre;
	}


	public void setOnagre(int onagre) {
		this.onagre = onagre;
	}


	public int getProduction() {
		return production;
	}


	public void setProduction(int production) {
		this.production = production;
	}


	public int getDeplacement() {
		return deplacement;
	}


	public void setDeplacement(int deplacement) {
		this.deplacement = deplacement;
	}


	public ArrayList<Troupes> getTabTroupes() {
		return tabTroupes;
	}


	public void setTabTroupes(ArrayList<Troupes> tabTroupes) {
		this.tabTroupes = tabTroupes;
	}
	
}
