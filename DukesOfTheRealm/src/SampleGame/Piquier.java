package SampleGame;

public class Piquier extends Troupes {
	
	private String name;
	private int cout;
	private int temps;
	private int vitesse;
	private int vie;
	private int degat;
	

	Piquier() {
		this.name = "Piquier";
		this.cout = 100;
		this.temps = 5;
		this.vitesse = 2;
		this.vie = 1;
		this.degat = 1;
	}

	
	// toString

	@Override
	public String toString() {
		return super.toString() + name;
	}

	// Getters & setters


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
