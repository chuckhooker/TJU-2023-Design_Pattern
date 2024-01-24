package decorator;

public class HeadBorder extends Border{
	
	private String head;

	protected HeadBorder(Display display, String head) {
		super(display);
		this.head = head;
	}

	@Override
	public int getRows() {
		return display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if (row == 0) {
			return head;
		}
		else {
			return display.getRowText(row - 1);
		}
	}

}
