package visitor;

public class Main {
	
	public static void main(String[] args) {
		
		ClassElement a = new ClassElement("a");
		Property pa = new Property("pa");
		Method ma = new Method("ma", 10);
		a.addMethod(ma);
		a.addProperty(pa);
		
		ClassElement b = new ClassElement("b");
		Property pb = new Property("pb");
		Method mb = new Method("mb", 100);
		Property pc = new Property("pc");
		Method mc = new Method("mc", 1);
		Property pd = new Property("pd");
		b.addMethod(mb);
		b.addMethod(mc);
		
		b.addProperty(pb);
		b.addProperty(pc);
		b.addProperty(pd);
		
		ProgramCode pcode = new ProgramCode();
		pcode.addClass(a);
		pcode.addClass(b);
		
		ScaleVisitor sv = new ScaleVisitor();
		NameVisitor nv = new NameVisitor();
		CountLinesVisitor cv = new CountLinesVisitor();
		
		pcode.accept(sv);
		System.out.println("There are total " + sv.getClassNum() + " class.");
		sv.clearClassNum();
		pcode.accept(nv);
		pcode.accept(cv);

		
		
	}

}
