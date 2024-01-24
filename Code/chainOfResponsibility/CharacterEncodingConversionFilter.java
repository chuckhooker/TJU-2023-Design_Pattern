package chainOfResponsibility;

public class CharacterEncodingConversionFilter extends Filter{

	public CharacterEncodingConversionFilter(String name) {
		super(name);
	}

	@Override
	public void doFilter(Data data) {
		System.out.println("Do Character Encoding Conversion to " + data.getName());
		
	}

}
