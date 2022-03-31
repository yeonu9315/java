package study;

import java.util.Scanner;

/*
두수와 연산자를 입력받아 계산하는 프로그램을 만드시오.
이때, 입력되는 연산자는 +, -, *, /, % 중에서 하나만 입력받도록 처리하시오.
 */

public class Q11 {
	public static void main(String[] args) {
		double num1, num2;
		char op;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요.");
		num1 = scanner.nextDouble();
		System.out.println("두 번째 수를 입력하세요.");
		num2 = scanner.nextDouble();
		
		while(true) {
			System.out.println("연산자를 입력하세요.");
			op = scanner.next().charAt(0);
			
			if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
				break;
			} else {
				System.out.println("연산자는 +, -, *, /, % 중에서 하나만 입력할 수 있습니다.");
			}
		}
		switch (op) {
			case '+' :
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				break;
			case '-' :
				System.out.println(num1+" - "+num2+" = "+(num1-num2));
				break;
			case '*' :
				System.out.println(num1+" * "+num2+" = "+(num1*num2));
				break;
			case '/' :
				System.out.println(num1+" / "+num2+" = "+(num1/num2));
				break;
			case '%' :
				System.out.println(num1+" % "+num2+" = "+(num1%num2));
				break;
		}
		scanner.close();
	}
}
