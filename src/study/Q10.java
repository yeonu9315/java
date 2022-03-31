package study;

import java.util.Scanner;

// 수를 입력받아 입력된 수 중 최대값을 구하시오.
// 999를 입력하면 프로그램을 종료시킨다.

public class Q10 {
	public static void main(String[] args) {
		int num;
		int max=0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("수를 입력하세요.(999입력 시 종료)");
			num =scanner.nextInt();
			if(num==999) {
				break;
			} else if (num>max) {
				max=num;
			}
			i++;
		}
		System.out.println("입력된 "+i+"개의 수 중 최대값은 "+max+"입니다.");
	}
}
