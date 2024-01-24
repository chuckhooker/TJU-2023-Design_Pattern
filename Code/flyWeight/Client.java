package flyWeight;

import java.util.ArrayList;

public class Client {
	
	private ArrayList<String> permissionlist;
	
	public Client(ArrayList<String> arrayList) {
		permissionlist = arrayList;
	}
	
	public ArrayList<String> getPermissionList(){
		return permissionlist;
	}
	
}
