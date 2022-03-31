package study;

import java.util.Scanner;

/*
점수를 입력받아 학점을 구하시오.
1. 입력받은 점수가 100점 이상이면 다시 입력받을수 있도록 처리하라
2. switch~case문장을 이용하여 프로그램을 작성하라
3. 점수에 따른 학점은 다음과 같다.
		95~100은 A+ 
		90~94은 A
		85~89은 B+
		80~84은 B
		75~79은 C+
		70~74은 C
		65~69은 D+
		60~64은 D
		60점 미만은 F
 */
public class Q7 {
	public static void main(String[] args) {
		int score;
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하세요.");
			score = scanner.nextInt();
			
			if(score<=100) {
				break;
			} else {
				System.out.println("점수는 100점을 초과할 수 없습니다.");
			}
		}
		switch(score/5) {
			case 20 :
			case 19 :
				grade = "A+";
				break;
			case 18 :
				grade = "A";
				break;
			case 17 :
				grade = "B+";
				break;
			case 16 :
				grade = "B";
				break;
			case 15 :
				grade = "C+";
				break;
			case 14 :
				grade = "C";
				break;
			case 13 :
				grade = "D+";
				break;
			case 12 :
				grade = "D";
				break;
			default:
				grade = "f";
		}
		System.out.println(score +"점은"+grade+"학점입니다.");
		
		scanner.close();
	}
}
