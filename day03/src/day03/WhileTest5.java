package day03;

import java.util.Scanner;

public class WhileTest5 {
	public static void main(String[] args) {

//		10 �Է�, 10 ���� Ȧ�� ���� ��� ���ؼ� 10�� �ѱ� ���� stop.
//		1 3 5 7 9 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = Integer.parseInt(sc.nextLine());

//		int i = 1, tot = 0;
//		while (true) { // while�� ������ ���� ���� ��� �ݺ��̹Ƿ� ��� �ݺ��ϸ� ���ѷ���
//
//			if (i % 2 == 1) {
//				tot += i;
//				if (tot > num)
//					break;
//				System.out.println(i + " ");
//			}
//			i++;
//		}
		
		int tot=0;
		for (int i=1;  ; i++) 
		{
			if(i%2==1) {
				tot += i;
				if(tot>num) break;
				System.out.println(i+"  ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}