package day16;

import java.util.ArrayList;

public class ArrayStringTest {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("a1");
		arr.add("a2");
		arr.add("a3");
		arr.add("a1");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
			System.out.println("===================");
		
			String item = arr.remove(0);
			System.out.println(item+"�� ���� �Ǿ����ϴ�.");
		}
		
		boolean result = arr.remove("a2");
		if(result)
			System.out.println("���� ����");
		else
			System.out.println("���� ����!!!");
		for(int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		System.out.println("================");
		
		String result2=  arr.set(1, "park!!!");
        System.out.println(result2+" ������!!!");
        
        for(int i=0; i<arr.size(); i++)
        	 System.out.println(arr.get(i));
        System.out.println("==================");
		
	}
}