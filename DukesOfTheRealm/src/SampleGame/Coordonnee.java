package SampleGame;


/*import java.awt.Dimension;

Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
int height = (int)dimension.getHeight();
int width  = (int)dimension.getWidth();*/

public class Coordonnee {
	int x, y;
	
	public Coordonnee() {
		this.x = (int) (Math.random()*1501);
		this.y = (int) (Math.random()*1001);
		
	}
	
	public Coordonnee(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
}
