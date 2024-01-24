package bridge;

public class Image {
	
	private Filter filter;
	
	public Image(Filter filter) {
		this.filter = filter;
	}
	
	public void addFilter() {
		filter.imageProcess();
	}

}
