package study;

/*
1~100까지의 합을 구하되, 각 10항까지의 결과를 중간중간 출력하시오.
 1~10 : 55
11~20 : 155
21~30 : 255
31~40 : 355
41~50 : 455
51~60 : 555
61~70 : 655
71~80 : 755
81~90 : 855
91~100: 955
 */

public class Q9 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%10==0) {
				System.out.println((i-9)+"~"+i+":"+sum);
				sum=0;
			}
		}
	}
}
