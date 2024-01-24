package proxy;

import java.util.HashMap;
import java.util.Map;

public class Selecter implements Selectable{
	
	private Map<Integer, String> map = new HashMap<Integer, String>();
	

	@Override
	public String select(int index) {
		System.out.println("Connection to DataBase and found it");
		return "StringData";
	}

}
