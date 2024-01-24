package decorator;

import java.util.ArrayList;

public class TableDisplay extends Display{
	
	private ArrayList<String> table;
	
	public TableDisplay(ArrayList<String> table) {
		this.table = table;
	}
	

	@Override
	public int getRows() {
		return table.size();
	}

	@Override
	public String getRowText(int row) {
		return table.get(row);
	}

}
