package SampleGame;

public class CastleDoor {
	private Coordonnee center;
	private Coordonnee cornerLT;
	private Coordonnee cornerLB;
	private Coordonnee cornerRT;
	private Coordonnee cornerRB;
	
	public CastleDoor(Coordonnee center2, String typeCastle) {	
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
				this.center.x = center2.x;
				this.center.y = center2.y + size;
				break;
			case 1:	//East
				this.center.x = center2.x + size;
				this.center.y = center2.y ;
				break;
			case 2:	//South
				this.center.x = center2.x;
				this.center.y = center2.y - size;
				break;
			case 3:	//West
				this.center.x = center2.x - size;
				this.center.y = center2.y;
				break;
			default:
				break;
		}
		if(Side == 0 || Side == 2) {
			this.cornerLT.x = this.center.x - sizeDW;
			this.cornerLT.y = this.center.y - sizeDH;
			this.cornerLB.x = this.center.x - sizeDW;
			this.cornerLB.y = this.center.y + sizeDH;
			this.cornerRT.x = this.center.x + sizeDW;
			this.cornerRT.y = this.center.y - sizeDH;
			this.cornerRB.x = this.center.x + sizeDW;
			this.cornerRB.y = this.center.y + sizeDH;
		}else {
			this.cornerLT.x = this.center.x - sizeDH;
			this.cornerLT.y = this.center.y - sizeDW;
			this.cornerLB.x = this.center.x - sizeDH;
			this.cornerLB.y = this.center.y + sizeDW;
			this.cornerRT.x = this.center.x + sizeDH;
			this.cornerRT.y = this.center.y - sizeDW;
			this.cornerRB.x = this.center.x + sizeDH;
			this.cornerRB.y = this.center.y + sizeDW;
		}
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
