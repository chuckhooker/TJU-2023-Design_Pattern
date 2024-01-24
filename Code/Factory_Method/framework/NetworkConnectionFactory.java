package Factory_Method.framework;

public abstract class NetworkConnectionFactory {
	
	public final NetworkConnection create() {
		createSocketConnection();
		createInputStream();
		createOutputStream();
		connectToServer();
		NetworkConnection networkConnection = createConnection();
		
		return networkConnection;
		
		
	}
	
	public abstract void createSocketConnection();
	
	public abstract void createInputStream();
	
	public abstract void createOutputStream();
	
	public abstract void connectToServer();
	
	public abstract NetworkConnection createConnection();
	

}
