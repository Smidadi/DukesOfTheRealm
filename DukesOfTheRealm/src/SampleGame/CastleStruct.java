package SampleGame;

import java.util.ArrayList;


public class CastleStruct  {	
	
	private Coordonnee center, cornerLT, cornerLB, cornerRT, cornerRB;
	
	CastleStruct(String typeCastle, ArrayList<Castle> tabOfCastle) {
		
		Coordonnee c = new Coordonnee();
		while(inRange(c, typeCastle, tabOfCastle) == false) {
			c = new Coordonnee();
		}
		this.center = c;
		int size;
		if(typeCastle == "Duc" || typeCastle == "Player") {
			size = 60;
		}else {
			size = 40;
		}
		this.cornerLT = new Coordonnee(center.getX() - size, center.getY() - size);
		this.cornerLB = new Coordonnee(center.getX() - size, center.getY() + size);
		this.cornerRT = new Coordonnee(center.getX() + size, center.getY() - size);
		this.cornerRB = new Coordonnee(center.getX() + size, center.getY() + size);
		
	}
		

	
	private Boolean inRange(Coordonnee center, String typeCastle, ArrayList<Castle> tabOfCastle) {
		for(int i=0;i<tabOfCastle.size();i++) {
			if(tabOfCastle.get(i).getType() == "Duc") {
				if(typeCastle == "Duc") {
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().center,center) < 85) {
						return false;
					}
				}else {
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().center,center) < 75) {
						return false;
					}
				}				
			}else {
				if(typeCastle == "Duc") {
					if(Coordonnee.distance(tabOfCastle.get(i).getCastle().center,center) < 75) {
						return false;
					}else {
						if(Coordonnee.distance(tabOfCastle.get(i).getCastle().center,center) < 65) {
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
