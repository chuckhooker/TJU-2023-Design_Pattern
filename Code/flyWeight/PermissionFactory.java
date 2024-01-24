package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class PermissionFactory {
	
	private Map<String, Permission> pool = new HashMap<>();
	private static PermissionFactory singleton = new PermissionFactory();
	
	private PermissionFactory() {}
	
	public static PermissionFactory getInstance() {
		return singleton;
	}
	
	public synchronized Permission getPermission(String name) {
		Permission permission = (Permission)pool.get(name);
		if(permission == null) {
			permission = new Permission(name);
			pool.put(name, permission);
		}
		return permission;
	}
	

}
