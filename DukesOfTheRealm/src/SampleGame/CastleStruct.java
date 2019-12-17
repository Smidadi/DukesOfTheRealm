package SampleGame;

import java.util.ArrayList;


public class CastleStruct  {	
	
	private Coordonnee center, cornerLT, cornerLB, cornerRT, cornerRB;
	
	CastleStruct(String typeCastle, ArrayList<Castle> tabOfCastle) {
		
		Coordonnee c = new Coordonnee();
		while(inRange(c, typeCastle, tabOfCastle) == false ) {
			c = new Coordonnee();
		}
		this.center = c;
		int size;
		if(typeCastle == "Duc" || typeCastle == "Player") {
			size = Settings.DUCSIZE;
		}else {
			size = Settings.BARONSIZE;
		}
		this.cornerLT = new Coordonnee(center.getX() - size, center.getY() - size);
		this.cornerLB = new Coordonnee(center.getX() - size, center.getY() + size);
		this.cornerRT = new Coordonnee(center.getX() + size, center.getY() - size);
		this.cornerRB = new Coordonnee(center.getX() + size, center.getY() + size);
	}
		

	
	private Boolean inRange(Coordonnee center, String typeCastle, ArrayList<Castle> tabOfCastle) {
		double DbetweenDD = (Settings.DUCSIZE * 2 + Settings.DOORSIZE);
		double DbetweenDB = (Settings.BARONSIZE + Settings.DUCSIZE + Settings.DOORSIZE);
		double DbetweenBB = (Settings.BARONSIZE * 2 + Settings.DOORSIZE);
		
		for(int i=0;i<tabOfCastle.size();i++) {
			if(typeCastle == "Duc" ){ //castle to build - DUC
				 if(tabOfCastle.get(i).getType() == "Duc" || tabOfCastle.get(i).getType() == "Player") {	//castle already on the plain - DUC
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(), center) < DbetweenDD ) {
						return false;
					}
				}else {	//castle already on the plain - BARON
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(), center) < DbetweenDB) {
						return false;
					}
				}				
			}else {	//castle to build - BARON
				if(tabOfCastle.get(i).getType() == "Duc" || tabOfCastle.get(i).getType() == "Player") {	//castle already on the plain - DUC
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(), center) < DbetweenDB) {
						return false;
					}else {	//castle already on the plain - BARON
						System.out.println(Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(),center));
						if(Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(), center) < DbetweenBB) {
							System.out.println("Name : " + tabOfCastle.get(i).getName() + " -> " + Coordonnee.distance(tabOfCastle.get(i).getCastle().getCenter(),center) + " VS " + (Settings.BARONSIZE * 2 + Settings.DOORSIZE) + "\n" );
							return false;
						}
					}
				}
			}
		}
		return true;
	}


	/* ----- GETTER ----- */
	/* ----- SETTER ----- */

	public Coordonnee getCenter() {
		return center;
	}



	public void setCenter(Coordonnee center) {
		this.center = center;
	}



	public Coordonnee getCornerLT() {
		return cornerLT;
	}



	public void setCornerLT(Coordonnee cornerLT) {
		this.cornerLT = cornerLT;
	}



	public Coordonnee getCornerLB() {
		return cornerLB;
	}



	public void setCornerLB(Coordonnee cornerLB) {
		this.cornerLB = cornerLB;
	}



	public Coordonnee getCornerRT() {
		return cornerRT;
	}



	public void setCornerRT(Coordonnee cornerRT) {
		this.cornerRT = cornerRT;
	}



	public Coordonnee getCornerRB() {
		return cornerRB;
	}



	public void setCornerRB(Coordonnee cornerRB) {
		this.cornerRB = cornerRB;
	}	
	
	
}
