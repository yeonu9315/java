package study;

import java.util.Scanner;

// 1개의 정수를 입력받아서, 입력받은 수가 '양의 정수'인지, '음의 정수'인지, '0'인지를 출력하시오.

public class Q2 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		num = scanner.nextInt();
		
		if(num>0) {
			System.out.println("양의 정수입니다.");
		} else if(num==0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음의 정수입니다.");
		}
		scanner.close();
	}
}
