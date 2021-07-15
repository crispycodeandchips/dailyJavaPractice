package io1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 *    byte  short int long float double
 *           char
 *    boolean 
 * 
 * 
 * 
 */

public class InputTest1 {

	public static void main(String[] args) {

//		InputStream is=System.in;
//		InputStreamReader isr=new InputStreamReader(is);
		
		InputStream is = System.in; // ��ǲ��Ʈ������ �Է¹޾� ��
		InputStreamReader isr = new InputStreamReader(is); // ��ü�� �Է¹����� ��Ƽ�
		System.out.println("�޼����� �Է��ϼ���");
		
		while (true) { // runtime exception�� �ƴ� �ֵ��� try catch �̿�
			
			try {
				char ch = (char) isr.read();
				if (ch == '.')
					break;
				System.out.println(ch);

			} catch (IOException e) {
				
				System.out.println(e);
				
			}
		}
		
	}
}