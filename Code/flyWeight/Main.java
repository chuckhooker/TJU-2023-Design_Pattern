package flyWeight;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		PermissionFactory pFactory;
		pFactory = PermissionFactory.getInstance();
		
		ArrayList<String> c1 = new ArrayList<>();
		ArrayList<String> c2 = new ArrayList<>();
		
		c1.add("read");
		c2.add("read");
		c2.add("write");
		
		Client cl1 = new Client(c1);
		Client cl2 = new Client(c2);
		
		ArrayList<String> p1 = cl1.getPermissionList();
		ArrayList<String> p2 = cl2.getPermissionList();
		
		for(String p: p1) {
			Permission permission = pFactory.getPermission(p);
			permission.Display();
		}
		for(String p: p2) {
			Permission permission = pFactory.getPermission(p);
			permission.Display();
		}
	}

}
