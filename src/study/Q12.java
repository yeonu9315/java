package study;

import java.util.Scanner;

/*
그린주식회사의 2월달 급여를 계산하시오.
1.2월달 평균 출근일수는 20일이다.(20일 근무시 300000원을 기본으로 지급받는다)
2.'성명'과 '부서명'과 '실제 근무일수'를 입력받아서 
	만약 평균출근일수보다 초과했다면 1일당 100000원을 추가로 지급하고, 
	평균일수보다 부족하면 50000원을 삭감한다.
3.부서명 첫글자가 
	'i 또는 I'는 '인사과', 
	'c 또는 C'는 총무과, 
	'j 또는 J'는 자재과, 
	'y 또는 Y'는 영업과, 
	나머지는 '홍보과'로 처리한다.
4.또한, 2022년의 2월달은 28일 밖에 없기에 실제근무일수가 28일을 초과해서 입력했다면 
	메세지를 출력하고 다시 입력받도록 처리하시오.
5.한건의 자료 처리후 '작업을 계속하시겠습니까?(Y/N)'를 물어보고 
	'Y'를 입력하면 다시 작업할 수 있도록, 
	'N'를 입력하면 작업을 마치도록 처리하시오.
 */

public class Q12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name; // 성명
		String part; // 부서
		char pi; // 부서이니셜
		char answer; // 추가 작업 여부 답변
		int work; // 근무일수
		int overwork; // 초과 근무일수
		double pay;

		while(true) {
			System.out.println("성명을 입력하세요.");
			name = scanner.next();
			
			System.out.println("부서명을 입력하세요.");
			pi = scanner.next().charAt(0);
			switch (pi) {
				case 'i' :
				case 'I' :
					part = "인사과";
					break;
				case 'c' :
				case 'C' :
					part = "총무과";
					break;
				case 'j' :
				case 'J' :
					part = "자재과";
					break;
				case 'y' :
				case 'Y' :
					part = "영업과";
					break;
				default :
					part = "홍보과";
					break;	
			}
			while(true) {
				System.out.println("근무일수를 입력하세요.");
				work = scanner.nextInt();
				
				if(work<=28) {
					if(work>20) {
						overwork = work-20;
						pay = 300000 + overwork*100000;
					} else if(work<20) {
						overwork = 20-work;
						pay = 300000 - overwork*50000;
					} else {
						pay = 300000;
					}
					break;
				} else {
					System.out.println("2월 근무일수는 28일을 넘을 수 없습니다.");
				}
			} 
			System.out.printf("%s에 근무하시는 %s님은 %d일 근무하셔서 급여는 %.1f원 입니다.", part, name, work, pay);
			System.out.println("작업을 계속하시겠습니까?(Y/N)");
			answer = scanner.next().charAt(0);
			
			if(answer=='Y'||answer=='y') {
				continue;
			} else if(answer=='N'||answer=='n') {
				System.out.println("수고하셨습니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			break;
		}
		scanner.close();
	}
}
