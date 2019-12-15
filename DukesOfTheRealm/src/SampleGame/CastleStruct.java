package SampleGame;

import java.util.ArrayList;


public class CastleStruct  {	
	
	Coordonnee center, cornerLT, cornerLB, cornerRT, cornerRB;
	
	CastleStruct(String typeCastle, ArrayList<Castle> tabOfCastle) {
		
		Coordonnee c = new Coordonnee();
		while(inRange(c, typeCastle, tabOfCastle) == false) {
			c = new Coordonnee();
		}
		this.center = c;
		int size;
		if(typeCastle == "Duc") {
			size = 25;
		}else {
			size = 15;
		}
		this.cornerLT = new Coordonnee(center.x - size, center.y - size);
		this.cornerLB = new Coordonnee(center.x - size, center.y + size);
		this.cornerRT = new Coordonnee(center.x + size, center.y - size);
		this.cornerRB = new Coordonnee(center.x + size, center.y + size);
		
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
}
