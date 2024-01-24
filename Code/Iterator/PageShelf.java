package Iterator;

public class PageShelf implements Aggregate{
	
	private Page[] pages;
	private int last = 0;
	
	public PageShelf (int maxsize) {
		this.pages = new Page[maxsize];
	}
	
	public Page getPageAt(int index) {
		return pages[index];
	}
	
	public void appendPage(Page page) {
		this.pages[last] = page;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new PageShelfIterator(this);
	}
	
}
