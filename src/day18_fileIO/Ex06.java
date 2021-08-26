package day18_fileIO;

import java.io.*;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args)throws Exception {
Scanner scan = new Scanner(System.in);
		Quiz02_bean t1 = new Quiz02_bean();

		System.out.println(">>>");
		String name = scan.next();
		t1.setName(name);
		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\member\\"+t1.getName()+".txt");
		FileInputStream fis = new FileInputStream(filepath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
	
		Quiz02_bean t = (Quiz02_bean)ois.readObject();
		
		
	
	
	
	
	}
}
