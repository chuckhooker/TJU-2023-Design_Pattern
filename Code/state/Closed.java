package state;

public class Closed implements TCPState{
	
	private int symbol = 2;

	@Override
	public void response() {
		System.out.println("Do Closed TCP Response");
		
	}
	
	@Override
	public int getSymbol() {
		return symbol;
	}

}
