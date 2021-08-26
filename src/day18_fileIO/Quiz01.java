package day18_fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
	
		Scanner scan = new Scanner(System.in);
	File filePath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\abcd1234\\test.txt");
	// 자바가 기준 밖으로 (output) true하면 파일 안끊김 저장 
	FileOutputStream fos = new FileOutputStream(filePath);
	
	System.out.print("이름 입력 :");
	String name = scan.next();
	System.out.print("나이 입력 :");
	String age = scan.next();
	System.out.print("주소 입력 :");
	String addr =scan.next();
	
	name+="\n";
	age+="\n";
	fos.write(name.getBytes());
	
	fos.write(age.getBytes());
	
	fos.write(addr.getBytes());
	
	}
}
