package visitor;

import java.util.ArrayList;

public class ScaleVisitor extends Visitor{
	
	private int classNum = 0;


	@Override
	public void visit(ClassElement classElement) {
		classNum++;
		int propertyNum = 0;
		int methodNum = 0;
		ArrayList<Property> properties = classElement.getProperties();
		ArrayList<Method> methods = classElement.getMethods();
		for(Property property : properties) {
			propertyNum++;
		}
		for(Method method: methods) {
			methodNum++;
		}
		System.out.println("Class " + classElement.getName() + "'s number of properties is " + propertyNum + " and number of methods is " + methodNum);
		
	}


	public int getClassNum() {
		return classNum;
	}
	
	public void clearClassNum() {
		classNum = 0;
	}


}
