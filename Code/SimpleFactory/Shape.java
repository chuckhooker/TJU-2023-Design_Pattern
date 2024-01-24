package SimpleFactory;

public abstract class Shape {
	
	public abstract void draw();
	
	public void erase() {
		System.out.println("Erasing the shape");
	}
	

}
