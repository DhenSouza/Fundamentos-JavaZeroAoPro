package fundamentosJava.ArraysCollections;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Dhen", "denilson.souza@gmail.com");
		Usuario u2 = new Usuario("Dhen", "denilson.souza@gmail.com");
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u1.equals(new Date()));
	}

}
