package Prototype;

public interface ResumeTemplate extends Cloneable{
	
	public abstract void display();
	
	public abstract ResumeTemplate createDeepClone();
	
	public abstract ResumeTemplate createShadowClone();

}
