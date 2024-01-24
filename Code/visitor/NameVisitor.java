package visitor;

import java.util.ArrayList;

public class NameVisitor extends Visitor{
	

	@Override
	public void visit(ClassElement classElement) {
		String className = classElement.getName();
		ArrayList<Property> properties = classElement.getProperties();
		ArrayList<Method> methods = classElement.getMethods();
		System.out.println("Class " + className + " has properties and methods as follows");
		System.out.println("Properties: ");
		for(Property property : properties) {
			System.out.println(property.getName());
		}
		System.out.println("Methods: ");
		for(Method method: methods) {
			System.out.println(method.getName());
		}
	}



}
