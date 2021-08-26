package day18_fileIO;

import java.io.*;
import java.util.Scanner;

public class Quiz02_cla {

	public void out() throws Exception {
		Scanner scan = new Scanner(System.in);
		Quiz02_bean be = new Quiz02_bean();

		String name;
		int kor, eng, math, stdnum;
		System.out.print("학번 입력:");
		stdnum = scan.nextInt();
		System.out.print("이름 입력:");
		name = scan.next();
		System.out.print("국어성적 입력:");
		kor = scan.nextInt();
		System.out.print("영어성적 입력:");
		eng = scan.nextInt();
		System.out.print("수학성적 입력:");
		math = scan.nextInt();

		be.setStdnum(stdnum);
		be.setName(name);
		be.setKor(kor);
		be.setEng(eng);
		be.setMath(math);
		File filepath = new File(
				"C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\member\\" + be.getName() + ".txt");
		FileOutputStream fos = new FileOutputStream(filepath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);

		oos.writeObject(be);

		oos.close();

		System.out.println("가입 되셨습니다!!!");
	}

	public void in() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 학생 이름 입력: ");
		String num = scan.next();

		File filepath = new File("C:\\Users\\82108\\Desktop\\jun\\국비 스프링 클라우드 활용 sw\\test\\member\\" + num + ".txt");
		FileInputStream fis = new FileInputStream(filepath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		Quiz02_bean input = (Quiz02_bean) ois.readObject();

		System.out.println("학번 : " + input.getStdnum());
		System.out.println("이름 : " + input.getName());
		System.out.println("국어 : " + input.getKor());
		System.out.println("영어 : " + input.getEng());
		System.out.println("수학 : " + input.getMath());
		System.out.println("평균 : " + input.getAvg());

		ois.close();
	}
}
