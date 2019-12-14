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
		Castle c = new Castle("Moi");
		Castle c_d = new Castle("Meurs");
		System.out.println(c.tabTroupes);
		
		System.out.println(c.countTroupes("Piquier",c.tabTroupes));	// OK
		
		c.castleHasBeenDestroyed(c_d);
		System.out.println(c_d.getDuc());
		
		
		// A enlever
		Application.launch(args); 
	}
	
	
}


