package Factory_Method.framework;

import Factory_Method.HTTP.HTTPConnectionFactory;
import Factory_Method.IMAP.IMAPConnectionFactory;
import Factory_Method.POP3.POP3ConnectionFactory;

public class Main {
	
	public static void main(String[] args) {
		NetworkConnectionFactory[] factories = {
	            new POP3ConnectionFactory(),
	            new IMAPConnectionFactory(),
	            new HTTPConnectionFactory()
	        };

	        for (NetworkConnectionFactory factory : factories) {
	        	NetworkConnection networkConnection = factory.create();
	            networkConnection.display();
	        }
	}

}
