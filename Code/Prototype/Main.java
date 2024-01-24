package Prototype;

public class Main {

	public static void main(String[] args) {
		
		Photo p1 = new Photo(1);
		ResumeTemplate r1 = new Resume("A", 1, "1@gmail.com", p1);
		ResumeTemplate r2 = r1.createShadowClone();
		ResumeTemplate r3 = r1.createDeepClone();
		
		r1.display();
		System.out.println("");
		r2.display();
		System.out.println("");
		r3.display();
		
		p1.setnum(2);
		System.out.println("p1.setnum(2)");
		System.out.println("");
		
		r1.display();
		System.out.println("");
		r2.display();
		System.out.println("");
		r3.display();
	}
}
