package visitor;

import java.util.ArrayList;

public class ClassElement implements CodeElement{
	
	private String name;
	private ArrayList<Property> properties = new ArrayList<>();
	private ArrayList<Method> methods = new ArrayList<>();
	
	public ClassElement(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Property> getProperties(){
		return properties;
	}
	
	public ArrayList<Method> getMethods(){
		return methods;
	}
	
	public void addProperty(Property property) {
		properties.add(property);
	}
	
	public void addMethod(Method method) {
		methods.add(method);
	}
	

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}


}
