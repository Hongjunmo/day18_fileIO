package day18_fileIO;

import java.io.Serializable;

public class Test_05 implements Serializable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("name : " + name);
		
	}
}
