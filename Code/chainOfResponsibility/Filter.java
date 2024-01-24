package chainOfResponsibility;

public abstract class Filter {
	
	private String name;
	private Filter next;
	
	public Filter(String name) {
		this.name = name;
	}
	
	public Filter setNext(Filter filter) {
		next = filter;
		return next;
	}
	
	public final void process(Data data) {
		doFilter(data);
		if(next != null) {
			next.process(data);
		}
		else {
			System.out.println("The process is finished.");
		}
		
	}
	
	public abstract void doFilter(Data data);

}
