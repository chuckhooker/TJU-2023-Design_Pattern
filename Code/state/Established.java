package state;

public class Established implements TCPState{
	
	private int symbol = 0;

	@Override
	public void response() {
		System.out.println("Do Established TCP Response");
		
	}
	
	@Override
	public int getSymbol() {
		return symbol;
	}

}
