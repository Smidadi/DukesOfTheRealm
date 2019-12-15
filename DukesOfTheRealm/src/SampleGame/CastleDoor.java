package SampleGame;

public class CastleDoor {
	
	Coordonnee center, cornerLT, cornerLB, cornerRT, cornerRB;
	
	CastleDoor(Coordonnee center2, String typeCastle) {	
		int sizeDW = 15;
		int sizeDH = 2;
		int Side = (int) (Math.random() * 4);
		int size;
		if(typeCastle == "Duc") {
			size = 25;
		}else {
			size = 15;
		}
		
		switch(Side) {
			case 0: //North
				this.center = new Coordonnee(center2.x , center2.y + size);
				break;
			case 1:	//East
				this.center = new Coordonnee(center2.x + size , center2.y);
				break;
			case 2:	//South
				this.center = new Coordonnee(center2.x , center2.y - size);
				break;
			case 3:	//West
				this.center = new Coordonnee(center2.x - size, center2.y);
				break;
			default:
				break;
		}
		if(Side == 0 || Side == 2) {
			this.cornerLT = new Coordonnee(this.center.x - sizeDW, this.center.y - sizeDH);
			this.cornerLB = new Coordonnee(this.center.x - sizeDW, this.center.y + sizeDH);
			this.cornerRT = new Coordonnee(this.center.x + sizeDW, this.center.y - sizeDH);
			this.cornerRB = new Coordonnee(this.center.x + sizeDW, this.center.y + sizeDH);
		}else {
			this.cornerLT = new Coordonnee(this.center.x - sizeDH, this.center.y - sizeDW);
			this.cornerLB = new Coordonnee(this.center.x - sizeDH, this.center.y + sizeDW);
			this.cornerRT = new Coordonnee(this.center.x + sizeDH, this.center.y - sizeDW);
			this.cornerRB = new Coordonnee(this.center.x + sizeDH, this.center.y + sizeDW);
		}
	}
	
	
	
	
	
	/* ----- GETTER ----- */
	/* ----- SETTER ----- */
	

	
}
