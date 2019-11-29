package SampleGame;

public class Main {
	public static void main(String[] args) {
		Castle c = new Castle("Moi");
		System.out.println(c.tabTroupes);	// OK
		
		System.out.println(c.countTroupes("Piquier",c.tabTroupes));	// OK
	}
}
