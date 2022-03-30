package study;

import java.util.Scanner;

// 두수를 입력받아 큰 수에서 작은 수로 값을 나누어서 출력되는 결과를 소수이하 2자리까지 출력시키시오.

public class Q4 {
	public static void main(String[] args) {
		int num1;
		double num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 개의 수를 입력하세요.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if(num1>num2) {
			System.out.printf("큰 수를 작은 수로 나눈 값은 %.2f입니다.", num1/num2); 
		} else if(num1==num2){
			System.out.println("두 개의 수가 같아 나눈 값은 0입니다.");
		} else {
			System.out.printf("큰 수를 작은 수로 나눈 값은 %.2f입니다.", num2/num1);
		}
		scanner.close();
	}
}
