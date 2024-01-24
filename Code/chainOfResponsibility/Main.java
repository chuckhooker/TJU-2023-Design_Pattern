package chainOfResponsibility;

public class Main {
	
	public static void main(String[] args) {
		Filter a = new CharacterEncodingConversionFilter("A");
		Filter b = new DataTypeConversionFilter("B");
		Filter c = new DataValidationFilter("C");
		Filter d = new DataValidationFilter("C");
		
		Data data = new Data("map");
		a.setNext(b).setNext(c).setNext(d);
		a.process(data);
	}

}
