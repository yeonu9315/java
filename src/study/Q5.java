package study;

import java.util.Scanner;

// 가위/바위/보 게임 만들기 - 두 사람이 숫자를 입력하여 누가 이겼는지를 출력하시오.
// 가위는 1로, 바위는 2로, 보는 3으로 입력하여 생각후 처리하기
public class Q5 {
	public static void main(String[] args) {
		int p1, p2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력합니다.");
		System.out.println("플레이어1 차례입니다. 수를 입력하세요.");
		p1 = scanner.nextInt();
		
		System.out.println("플레이어2 차례입니다. 수를 입력하세요.");
		p2 = scanner.nextInt();
		
		if(p1==1&&p2==1) {
			System.out.println("무승부");
		} else if(p1==1&&p2==2) {
			System.out.println("플레이어2 승리");			
		} else if(p1==1&&p2==3) {
			System.out.println("플레이어1 승리");			
		} else if(p1==2&&p2==1) {
			System.out.println("플레이어1 승리");			
		} else if(p1==2&&p2==2) {
			System.out.println("무승부");			
		} else if(p1==2&&p2==3) {
			System.out.println("플레이어2 승리");			
		} else if(p1==3&&p2==1) {
			System.out.println("플레이어2 승리");			
		} else if(p1==3&&p2==2) {
			System.out.println("플레이어1 승리");			
		} else {
			System.out.println("무승부");
		}
		scanner.close();
	}
}
