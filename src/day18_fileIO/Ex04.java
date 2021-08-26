package day18_fileIO;

import java.io.*;

public class Ex04 {
	public static void main(String[] args)throws Exception {

		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\aaa.txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		// buffer는 자신만의 보조 공간을 만듬 fos 를 자신공간에 먼저 저장
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//data는 보조스트림 한글도 그냥 파일에 들어감. dos.write utf,int 등
		DataOutputStream dos = new DataOutputStream(bos);
		
		String str = "Test";
		StringBuffer sb = new StringBuffer();
		sb.append("abcd");
		System.out.println(str);
		System.out.println(sb);
		
		
		
		dos.writeUTF("김개똥");
		dos.writeInt(100);
		dos.close();

		
		FileInputStream fis = new FileInputStream(filepath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		//data는 보조스트림 한글도 그냥 꺼내줌  dos.readutf,int 등 . 받아줘야함
		DataInputStream dis = new DataInputStream(bis);
		String name =dis.readUTF();
		int num = dis.readInt();
		System.out.println("name : " + name + "\tnum :"+num);
		
		
	}
}
