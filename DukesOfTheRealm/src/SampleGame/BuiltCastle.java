package SampleGame;

import java.util.ArrayList;


public class BuiltCastle extends ShapeOfCastle {	

	public  BuiltCastle(String typeCastle, ArrayList<ShapeOfCastle> tabOfCastle) {
		Coordonnee c = new Coordonnee();
		while(inRange(c, typeCastle, tabOfCastle) == false) {
			c = new Coordonnee();
		}
		setCenter(c);
		setType(typeCastle);
		int size;
		int nb = tabOfCastle.size();
		if(typeCastle == "Duc") {
			setName("Duc n°" + Integer.toString(nb));
			size = 25;
		}else {
			setName("Baron n°" + Integer.toString(nb));
			size = 15;
		}
		setCornerLT(new Coordonnee(getCenter().x - size, getCenter().y - size));
		setCornerLB(new Coordonnee(getCenter().x - size, getCenter().y + size));
		setCornerRT(new Coordonnee(getCenter().x + size, getCenter().y - size));
		setCornerRB(new Coordonnee(getCenter().x + size, getCenter().y + size));
		setCastleDoor(new CastleDoor(getCenter(),typeCastle));
	}
		

	
	private Boolean inRange(Coordonnee center, String typeCastle, ArrayList<ShapeOfCastle> tabOfCastle) {
		for(int i=0;i<tabOfCastle.size();i++) {
			if(tabOfCastle.get(i).getType() == "Duc") {
				if(typeCastle == "Duc") {
					if(Coordonnee.distance(tabOfCastle.get(i).getCenter(),center) < 85) {
						return false;
					}
				}else {
					if(Coordonnee.distance(tabOfCastle.get(i).getCenter(),center) < 75) {
						return false;
					}
				}				
			}else {
				if(typeCastle == "Duc") {
					if(Coordonnee.distance(tabOfCastle.get(i).getCenter(),center) < 75) {
						return false;
					}else {
						if(Coordonnee.distance(tabOfCastle.get(i).getCenter(),center) < 65) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
