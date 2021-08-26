package day18_fileIO;

import java.io.*;
import java.util.Scanner;

public class Ex05  {
	public static void main(String[] args)throws Exception {
		//직렬화 : 객체를 바이트로 변환 파일로 보낼수 있음
		// - implements Serializable 해줘야함 자동으로 바이트 변환 해줌
		//역 직렬화 : 파일을 객체로 변환
		
		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		// buffer는 자신만의 보조 공간을 만듬 fos 를 자신공간에 먼저 저장
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력:");
		String name = scan.next();
		
		Test_05 t = new Test_05();
		t.setName(name);
		
		oos.writeObject(t);
		oos.close();
		
		
		

	}
}
