package chainOfResponsibility;

public class DataTypeConversionFilter extends Filter{

	public DataTypeConversionFilter(String name) {
		super(name);
	}

	@Override
	public void doFilter(Data data) {
		System.out.println("Do Data Type Conversion to " + data.getName());	
	}

}
