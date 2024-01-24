package composite;

import java.util.ArrayList;

public class Group extends Entry{
	
	private String name;
	private ArrayList<Entry> list;
	
	public Group(String name, ArrayList<Entry> list) {
		this.name = name;
		this.list = list;
	}
	
	@Override
	public void add(Entry entry) {
		if (entry instanceof Member) {
			list.add(entry);
		}
		else {
			Group group = (Group)entry;
			ArrayList<Entry> list = group.getList();
			for(Entry innerEntry: list) {
				this.add(innerEntry);
			}
		}
	}

	@Override
	public String getName() {
		return name;
	}
	
	public ArrayList<Entry> getList() {
		return list;
	}

}
