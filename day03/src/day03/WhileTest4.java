package day03;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {

		// //���ڸ� �Է¹޾Ƽ� 1���� �� ������ ����� �� �հ踦 ���Ͻÿ� (for, while)
		// Scanner sc = new Scanner(System.in);
		// System.out.println("���ڸ� �Է��ϼ���");
		// int num = Integer.parseInt(sc.nextLine());
		//
		// int i=1;
		// int sum = 0;
		// while(i<=num) {
		//
		// sum += i;
		// System.out.println(i);
		// i++;
		// }
		// System.out.println("\n����: "+sum);

		/*
		 * + - + - + -
		 * 
		 * �����Է� 6
		 * 
		 * ���� 3 + - +
		 * 
		 * while ������
		 */
		//
		// Scanner sc1 = new Scanner(System.in);
		// System.out.println("���ڸ� �Է��ϼ���");
		// int num = Integer.parseInt(sc1.nextLine());
		//
		// int i = 1;
		// String result="";
		// while (i<=num) {
		//
		// if(i%2==1) {
		// result += "+";
		// }else {
		// result += "-";
		// }
		// i++;
		// }

		
		
		//5!=5*4*3*2*1=120
		
		// ������ �� �ִ� ���� �ϳ�
		// ���� ����� �� �ִ� ���� �ϳ�
		// �׸��� ��׵��� ������ �� �ִ� ���� �ϳ�
		 Scanner sc=new Scanner(System.in);
		 System.out.println("���ڸ� �Է��ϼ���");
		 int num = Integer.parseInt(sc.nextLine());
		
		 int i = num;
		 String data = "";
		 int result = 1; //���ؾ� �ϴϱ� �ʱⰪ�� 1; // 5 4 3 2 1   
		 while (i>=1) {
		 if(i==num) { //�Է°��� ���۰��� ���� ��
		 data += i; //""+5 => "5" ���ڿ��� ���ڿ��� �ܼ� ����
		 }else {
		 data += "*"+i;
		 }
		 result *=i;
		 i--;
		 }
		 System.out.println(num+"!="+data+"="+result);
	
	}
}