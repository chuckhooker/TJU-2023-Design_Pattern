package decorator;

import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A:123");
		list.add("B:456");
		Display d1 = new TableDisplay(list);
		d1.show();
		
		Display d2 = new TailBorder(d1, "tail");
		d2.show();
		
		Display d3 = new HeadBorder(new HeadBorder(new TailBorder(d1, "Tail"), "Head2"), "Head1");
		d3.show();
	}

}
