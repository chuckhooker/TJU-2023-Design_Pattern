package Iterator;

public class PageShelfIterator implements Iterator{
	
	private PageShelf pageShelf;
	private int index;
	
	public PageShelfIterator(PageShelf pageShelf) {
		this.pageShelf = pageShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < pageShelf.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public Object next() {
		Page page = pageShelf.getPageAt(index);
		index++;
		return page;
	}

}
