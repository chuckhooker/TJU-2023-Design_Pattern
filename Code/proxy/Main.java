package proxy;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		Selectable selectable = new SelecterProxy(map);
		selectable.select(1);
		selectable.select(2);
		selectable.select(3);
		
	}

}
