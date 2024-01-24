package visitor;

import java.util.ArrayList;

public class ProgramCode {
	
	ArrayList<ClassElement> classList = new ArrayList<>();
	
	public void accept(Visitor visitor) {
		for(ClassElement classElement: classList) {
			visitor.visit(classElement);
		}
	}
	
	public void addClass(ClassElement classElement) {
		classList.add(classElement);
	}

}
