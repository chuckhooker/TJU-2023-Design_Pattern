package composite;

public abstract class Entry {
	
	public void add(Entry entry) throws MemberAddException {
		throw new MemberAddException();
	}
	
	public void share(Entry entry, String message) throws GroupShareException {
		throw new GroupShareException();
	}
	
	public abstract String getName();

}
