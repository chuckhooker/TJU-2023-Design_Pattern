package chainOfResponsibility;

public class DataValidationFilter extends Filter{

	public DataValidationFilter(String name) {
		super(name);
	}

	@Override
	public void doFilter(Data data) {
		System.out.println("Do Data Validation Filter to " + data.getName());
		
	}

}
