package day03;

import java.util.Scanner;
// 3������

/*
 * �ܺο��� ���ڸ� �Է¹޾�, 1���� �ش� �Է� ���ڱ����� ���� ��� �����Ͽ�
 * 
 * ex) input su
 *        5
 * 1-2+3-4+5=3 ����� �ؽ�Ʈ�� ����϶�.
*/
public class HwTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num");
		int num = Integer.parseInt(sc.nextLine());
		String result="1"; //����� ���� ��
		int result2=1; // ����� ���� ��
		
		//¦���� �� -
		//Ȧ���� �� +
		
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