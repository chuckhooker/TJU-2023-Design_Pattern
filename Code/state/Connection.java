package state;

public class Connection {
	
	private TCPState tcpState;
	
	public Connection(TCPState tcpState) {
		this.tcpState = tcpState;
	}
	
	public void changeState() {
		if(tcpState.getSymbol() == 0) {
			tcpState = new Listening();
		}
		else if(tcpState.getSymbol() == 1) {
			tcpState = new Closed();
		}
		else if(tcpState.getSymbol() == 2) {
			tcpState = new Established();
		}
	}
	
	public void request() {
		tcpState.response();
	}

}
