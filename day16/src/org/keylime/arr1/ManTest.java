package org.keylime.arr1;

/*
 *     �Է�   ���    ����   ����
 *   CRUD( create:�Է�, read: ���, Update : ����, Delete:����)
 * 
 * 
 */

public class ManTest {
	public static void main(String[] args) {
		
		ManPro p1 = new ManPro();
		
		p1.addMan(new Man("a1", 20));
		p1.addMan(new Man("a2", 20));
		p1.addMan(new Man("a3", 20));
		p1.addMan(new Man("a4", 20));
		
		p1.printAll(); // �� ���
		
		// a2, 30�� ������ �ִ� ��� �ڷḦ ����
		p1.removeMan(new Man("a2",30));
		
		p1.printAll();
		
	    System.out.println("===================");
        p1.removeMan("a2"); 
        
        p1.printAll();
       
		
	}

}