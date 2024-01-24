package Prototype;

import java.io.Serializable;

public class Photo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int num;
	
	public Photo(int num) {
		this.num = num;
	}
	
	public void setnum(int num){
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyPhoto's num is " + num;
	}

}
