package SampleGame;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Castle c = new Castle("Moi");
		Castle c_d = new Castle("Meurs");
		System.out.println(c.tabTroupes);
		
		System.out.println(c.countTroupes("Piquier",c.tabTroupes));	// OK
		
		c.castleHasBeenDestroyed(c_d);
		System.out.println(c_d.getDuc());
	}
}
