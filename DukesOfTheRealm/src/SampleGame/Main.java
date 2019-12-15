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
		
		final Rectangle rectangle = new Rectangle(Math.random()*Settings.SCENE_WIDTH, Math.random()*Settings.SCENE_WIDTH , Math.random()*Settings.SCENE_HEIGHT, Math.random()*Settings.SCENE_HEIGHT); 
		rectangle.setFill(Color.BROWN); 
		final Pane root = new Pane(); 
		root.getChildren().setAll(rectangle); 
		
		scene = new Scene(root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT, Color.LIGHTGREEN); 
		primaryStage.setTitle("DukesOfTheRealm"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	} 
	
	// jusque la
	
	public static void main(String[] args) {
		ArrayList<Castle> tabOfCastle = new ArrayList<Castle>();
		Castle c = new Castle("Player", tabOfCastle);
		
		
		
		System.out.println(c.getTabTroupes());
		
		System.out.println(RunACastle.countTroupes("Piquier",c.getTabTroupes()));	// OK
		
	
		
		
		// A enlever
		Application.launch(args); 
	}
	
	
}


