package SampleGame;

import java.util.ArrayList;

public class ShapeOfCastle {
	
	private String name;
	private String type;
	private Coordonnee center;
	private Coordonnee cornerLT;
	private Coordonnee cornerLB;
	private Coordonnee cornerRT;
	private Coordonnee cornerRB;
	private CastleDoor CastleDoor;
	
	
	public void createStructure(String type, ArrayList<ShapeOfCastle> tabOfStructure) {
		if(type == "Duc") {
			ShapeOfCastle DucCastle = new BuiltCastle(type,tabOfStructure);
			tabOfStructure.add(DucCastle);
		}
		if(type == "Baron") {
			ShapeOfCastle BaronCastle = new BuiltCastle(type,tabOfStructure);
			tabOfStructure.add(BaronCastle);
		}
	}
	
	
	/* ----- GETTER ----- */
	/* ----- SETTER ----- */
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public CastleDoor getCastleDoor() {
		return CastleDoor;
	}
	public void setCastleDoor(CastleDoor castleDoor) {
		CastleDoor = castleDoor;
	}
}