package visitor;

import java.util.ArrayList;

public class CountLinesVisitor extends Visitor{

	@Override
	public void visit(ClassElement classElement) {
		int classLine = 0;
		String className = classElement.getName();
		ArrayList<Property> properties = classElement.getProperties();
		ArrayList<Method> methods = classElement.getMethods();
		for(Property property : properties) {
			classLine++;
		}
		for(Method method: methods) {
			classLine += method.getLineNum();
		}
		
		System.out.println("Class " + className + " has " + classLine +" lines.");
		
	}
}
