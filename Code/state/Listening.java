package state;

public class Listening implements TCPState{
	
	private int symbol = 1;

	@Override
	public void response() {
		System.out.println("Do Listening TCP Response");
		
	}
	
	@Override
	public int getSymbol() {
		return symbol;
	}

}
