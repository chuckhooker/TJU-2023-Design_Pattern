package Prototype;

import java.io.*;

public class Resume implements ResumeTemplate, Serializable{
	
	private static final long serialVersionUID = -8975396126330142115L;
	private String name;
	private int age;
	private String email;
	private Photo portrait;
	
	public Resume(String name, int age, String email, Photo portrait) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.portrait = portrait;
	}

	@Override
	public void display() {
		System.out.println("My name is " + name + ".");
		System.out.println("My age is " + age + ".");
		System.out.println("My email is " + email + ".");
		System.out.println("My portrait is " + portrait + ".");
		
	}

	@Override
	public ResumeTemplate createDeepClone() {
		
		try {
		// 将对象写入字节流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(this);
        
        // 从字节流中读取对象并返回深克隆的副本
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        return (ResumeTemplate) objectInputStream.readObject();
        } catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public ResumeTemplate createShadowClone() {
		ResumeTemplate resumeTemplate = null;
		try {
			resumeTemplate = (ResumeTemplate)clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resumeTemplate;
	}

}
