package decorator;

public class TailBorder extends Border{
	
	private String tail;

	protected TailBorder(Display display, String tail) {
		super(display);
		this.tail = tail;
	}

	@Override
	public int getRows() {
		return display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == display.getRows()) {
			return tail;
		}
		else {
			return display.getRowText(row);
		}
	}

}
