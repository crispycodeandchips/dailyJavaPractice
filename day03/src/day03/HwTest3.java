package day03;

import java.util.Scanner;
// 3번문제

/*
 * 외부에서 숫자를 입력받아, 1부터 해당 입력 숫자까지의 수를 모두 나열하여
 * 
 * ex) input su
 *        5
 * 1-2+3-4+5=3 방식의 텍스트로 출력하라.
*/
public class HwTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num");
		int num = Integer.parseInt(sc.nextLine());
		String result="1"; //결과를 담을 것
		int result2=1; // 계산을 담을 것
		
		//짝수일 때 -
		//홀수일 때 +
		
		for(int i=2; i<=num; i++)
		{
			if(i%2==0) 
			{
				result += "-"+i;	
				result2 -= i;
			}else
			{
				result +="+"+i;
				result2 += i;
			}
		}
		System.out.println(result+"="+
		result2);

	}
}
