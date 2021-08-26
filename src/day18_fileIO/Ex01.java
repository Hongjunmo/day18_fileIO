package day18_fileIO;

import java.io.*;

public class Ex01 {
	public static void main(String[] args) throws Exception {

		// 파일 경로
		File filePath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\aaa.txt");
		// 자바가 기준 밖으로 (output) true하면 파일 안끊김 저장 
		FileOutputStream fos = new FileOutputStream(filePath,true);
		fos.write(97);
		fos.write('A');
		String name ="==================";
		fos.write(name.getBytes());
		
		
	}
}
