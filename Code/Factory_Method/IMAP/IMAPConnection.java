package Factory_Method.IMAP;

import Factory_Method.framework.NetworkConnection;

public class IMAPConnection extends NetworkConnection{
	
	public void display() {
		System.out.println("IMAPConnection has been created");
	}


}
