package study;

import java.util.Scanner;

// 수를 입력받아, 입력된 수가 '2의 배수'인지, '3의 배수'인지, '5의 배수'인지, 아니면 '일반수'인지를 출력하시오.

public class Q3 {
	public static void main(String[] args) {
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		num = scanner.nextInt();
		
		if(num%2==0) {
			System.out.println("입력한 수는 2의 배수입니다.");
		} else if(num%3==0) {
			System.out.println("입력한 수는 3의 배수입니다.");
		} else if(num%5==0) {
			System.out.println("입력한 수는 5의 배수입니다.");
		} else {
			System.out.println("입력한 수는 일반수입니다.");
		}
		scanner.close();
	}
}
