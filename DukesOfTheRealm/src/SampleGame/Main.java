package SampleGame;

import java.util.ArrayList;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.layout.Pane; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle; 
import javafx.stage.Stage; 

public class Main extends Application {
	// A enlever + extends Application 
	private Scene scene;
	
	@Override 
	public void start(Stage primaryStage) throws Exception { 
		ArrayList<Castle> tabOfCastle = new ArrayList<Castle>();
		Castle c = new Castle("Player", tabOfCastle);
		tabOfCastle.add(c);
		Castle b = new Castle("Baron", tabOfCastle);
		tabOfCastle.add(b);

		Pane root = new Pane(); 
		
		//Rectangle(x,y,w,h);
		
		Rectangle rc = new Rectangle(c.getCastle().getCornerLT().getX(), c.getCastle().getCornerLT().getY(), Coordonnee.distance(c.getCastle().getCornerLT(), c.getCastle().getCornerRT()), Coordonnee.distance(c.getCastle().getCornerLT(), c.getCastle().getCornerLB()));	
		Rectangle dc = new Rectangle(c.getCastleDoor().getCornerLT().getX(),c.getCastleDoor().getCornerLT().getY(), Coordonnee.distance(c.getCastleDoor().getCornerLT(), c.getCastleDoor().getCornerRT()), Coordonnee.distance(c.getCastleDoor().getCornerLT(), c.getCastleDoor().getCornerLB()));	
		dc.setFill(Color.WHITE);
		rc.setFill(Color.BROWN); 
		root.getChildren().add(rc); 
		root.getChildren().add(dc); 
		
		Rectangle rb = new Rectangle(b.getCastle().getCornerLT().getX(), b.getCastle().getCornerLT().getY(), Coordonnee.distance(b.getCastle().getCornerLT(), b.getCastle().getCornerRT()), Coordonnee.distance(b.getCastle().getCornerLT(), b.getCastle().getCornerLB()));	
		Rectangle db = new Rectangle(b.getCastleDoor().getCornerLT().getX(),b.getCastleDoor().getCornerLT().getY(), Coordonnee.distance(b.getCastleDoor().getCornerLT(), b.getCastleDoor().getCornerRT()), Coordonnee.distance(b.getCastleDoor().getCornerLT(), b.getCastleDoor().getCornerLB()));	
		db.setFill(Color.WHITE);
		rb.setFill(Color.GRAY); 
		root.getChildren().add(rb); 
		root.getChildren().add(db); 
		
		scene = new Scene(root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT, Color.LIGHTGREEN); 
		primaryStage.setTitle("DukesOfTheRealm"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	} 
	
	// jusque la
	
	public static void main(String[] args) {
		
		
		// A enlever
		Application.launch(args); 
	}
	
	
}


