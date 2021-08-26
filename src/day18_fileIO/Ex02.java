package day18_fileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex02 {
	public static void main(String[] args) throws Exception {

		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\aaa.txt");
	
		FileInputStream fis = new FileInputStream(filepath);
		
	while(true) {
		int res = fis.read();
		if(res < 0 ) {
			break;
		}
		System.out.print((char)res);
	}
	
	
	}
}
