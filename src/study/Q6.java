package study;

import java.util.Scanner;

/*
Green회사의 급여를 계산하려고 한다. 
급여는 실제 수령받는 '실수령액'을 구하는데, 
이때 입력받는 값은 '성명'과 '본봉'과 '야근시간'을 입력받는다. 
이 회사의 야근수당은 1시간당 15000원이다. 
또한 공제금액을 계산해야 하는데, 
공제액은 받는 금액(본봉+야근수당)에서 10%를 세금으로 제외한다고 한다. 
이 회사의 받게 되는 '실수령액'을 출력하시오. 
('성명, 본봉, 야근수당, 공제액, 실수령액' 모두를 출력하시오.)
*/
public class Q6 {
	public static void main(String[] args) {
		String name;
		int salary;
		int overtime;
		double tax;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성명을 입력하세요.");
		name = scanner.next();
		System.out.println("본봉을 입력하세요.");
		salary = scanner.nextInt();
		System.out.println("야근시간을 입력하세요.");
		overtime = scanner.nextInt();
		
		tax = (salary+overtime*15000)*0.1;
		
		System.out.println("=======================================================================");
		System.out.println("성명:"+name+" 본봉:"+salary+" 야근수당:"+overtime*15000+" 공제액:"+tax+" 실수령액:"+(salary+overtime*15000-tax));
		
		scanner.close();
	}	
}
