package composite;

import java.util.ArrayList;

public class Member extends Entry{
	
	private String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public void share(Entry entry, String message){
		if (entry instanceof Member) {
			System.out.println(name + " share " + message + " with " + entry.getName());
		}
		else {
			Group group = (Group)entry;
			ArrayList<Entry> list = group.getList();
			for(Entry innerEntry: list) {
				this.share(innerEntry, message);
			}
		}
	}
	

	@Override
	public String getName() {
		return name;
	}

}
