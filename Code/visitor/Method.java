package visitor;

public class Method{
	
	private String name;
	private int lineNum;
	
	public Method(String name, int lineNum) {
		this.name = name;
		this.lineNum = lineNum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLineNum() {
		return lineNum;
	}
	
}
