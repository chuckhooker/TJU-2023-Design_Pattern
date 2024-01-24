package composite;

import java.awt.geom.GeneralPath;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		Member tom = new Member("Tom");
		Member jerry = new Member("Jerry");
		Member nancy = new Member("Nancy");
		Member jack = new Member("Jack");
		
		ArrayList<Entry> list1 = new ArrayList<>();
		list1.add(jerry);
		list1.add(nancy);
		
		ArrayList<Entry> list2 = new ArrayList<>();
		list2.add(jack);
		list2.add(tom);
		
		Group g1 = new Group("G1", list1);
		Group g2 = new Group("G2", list2);
		g1.add(g2);
		
		tom.share(g1, "hello");
		tom.share(nancy, "hello nancy");
		
	}
}
