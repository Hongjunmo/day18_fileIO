package day18_fileIO;

import java.io.*;
import java.util.Scanner;

public class Quiz02  implements Serializable{
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		Quiz02_cla qu = new Quiz02_cla();

		while (true) {

			System.out.println("==== 학생 관리 ====");
			System.out.println("1.학생 검색");
			System.out.println("2.등록");
			System.out.println("3.종료");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				qu.in();
				break;
			case 2:
				qu.out();
				break;
			case 3:
				System.out.println("종료 합니다.");
				return;

			}

		}

	}
}
