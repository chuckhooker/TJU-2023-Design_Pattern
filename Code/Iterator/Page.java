package Iterator;

import java.util.List;

public class Page {
	
	private int number;
	private String[] data;
	
	public Page(int number, String[] data) {
		this.number = number;
		this.data = data;
	}
	
	public String getNumber() {
		return "This is Page " + number + ".";
	}
	
	public void getData() {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
