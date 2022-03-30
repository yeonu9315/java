package study;

import java.util.Scanner;

// 두개의 정수를 입력받아 큰수와 적은수를 출력하시오. 

public class Q1 {
	public static void main(String[] args) {
		int num1, num2;
		System.out.println("두 개의 수를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		if (num1 > num2) {
			System.out.println("첫 번째 수 " + num1 + "은/는 두 번째 수 " + num2 + "보다 큽니다.");
		} else if (num1 == num2) {
			System.out.println("첫 번째 수 " + num1 + "은/는 두 번째 수 " + num2 + "와 같습니다.");
		} else {
			System.out.println("첫 번째 수 " + num1 + "은/는 두 번째 수 " + num2 + "보다 작습니다.");
		}
		scanner.close();
	}
}
