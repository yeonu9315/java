package study;

/*
1~100까지의 합을 구하되, 각 10항까지의 결과를 중간중간 출력하시오.
1~10 : 55
1~20 : 210
1~30 : 465
1~40 : 820
1~50 : 1275
1~60 : 1830
1~70 : 2485
1~80 : 3240
1~90 : 4095
1~100: 5050
 */

public class Q8 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			sum += i; 
			if(i%10==0) {
				System.out.println("1~"+i+":"+sum);				
			}
		}
	}
}
