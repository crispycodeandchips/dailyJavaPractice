package day03;

import java.util.Scanner;

/*
 * su1, su2를 입력받아 작은 수부터 큰 수로 둘 사이의 짝수값과 그 합을 출력하시오.
*/
public class HwTest4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input num1");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("input num2");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int temp;
		int tot=0;
		
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		
//		System.out.println(num1);
//		System.out.println(num2);
				
		for (int i=num1; i<=num2; i++)
		{
			if(i%2==0)
				
				tot +=i;
				System.out.println(i+"\t");
		}
		
		System.out.println("\n 합계는 :"+tot);
		
	}

}
