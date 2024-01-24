package state;

public class Main {
	
	public static void main(String[] args) {
		TCPState tcpState = new Established();
		Connection connection = new Connection(tcpState);
		connection.request();
		connection.changeState();
		connection.request();
		connection.changeState();
		connection.request();
	}

}
