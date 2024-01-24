package proxy;

import java.util.HashMap;
import java.util.Map;

public class SelecterProxy implements Selectable{
	
	private Selecter real;
	private Map<Integer, String> map = new HashMap<Integer, String>();
	
	public SelecterProxy(Map<Integer, String> map) {
		this.map = map;
	}
	
	public void addData(int index, String string) {
		map.put(index, string);
	}

	@Override
	public synchronized String select(int index) {
		if (map.get(index) != null) {
			System.out.println(index + ", " + map.get(index));
			return map.get(index);
		}
		else {
			real = new Selecter();
			String string = real.select(index);
			addData(index, string);
			System.out.println(index + ", " + map.get(index));
			return string;
		}
	}

}
