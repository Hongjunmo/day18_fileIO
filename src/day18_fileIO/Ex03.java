package day18_fileIO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {

		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		// buffer는 자신만의 보조 공간을 만듬 fos 를 자신공간에 먼저 저장
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		for (char i = '1'; i < '9'; i++) {
//			Thread.sleep(1000);
//			fos.write(i);
			bos.write(i);
		}
		// flush: 저장된 내용 비우기 반복문 끝나면 보내줌
		// close: 다시 write 못함 똑같이 보내지긴 함 접속을 끊음
		bos.close();
//		bos.write('a');
//		bos.flush();
		
	}
}
