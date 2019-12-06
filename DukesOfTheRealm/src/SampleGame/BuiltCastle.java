package SampleGame;

//50px : chateau d'origine ; 25px : chateau neutre

public class BuiltCastle {
	
	public BuiltCastle(String typeCastle) {
		Coordonnee center = new Coordonnee();
		int size;
		if(typeCastle == "Duc") {
			size = 24;
		}else {
			size = 12;
		}
		Coordonnee cornerLT = new Coordonnee(center.x - size, center.y + size);
		Coordonnee cornerLB = new Coordonnee(center.x - size, center.y - size);
		Coordonnee cornerRT = new Coordonnee(center.x + size, center.y + size);
		Coordonnee cornerRB = new Coordonnee(center.x + size, center.y - size);
	}
	
	public void CastleDoor(String typeCastle) { //N:0;E:1;S:2;W:3
		int Side = (int) (Math.random() * 4);
		switch(Side) {
			case 0:
				
			case 1:
			case 2:
			case 3:
			default:
				
		}
	}
}
