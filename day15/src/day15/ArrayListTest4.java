package day15;

import java.util.ArrayList;

/*
 *     byte    short   int   long  float   double
 *               char
 *               
 *     boolean 
 *     => 래퍼클래스  wrapper class 
 *     Byte   Short   
 * 
 * 
 * 
 */

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList  arr=new ArrayList();
        
		/*
		 * arr.add(new Integer(10));
		 * 
		 * int su=((Integer)arr.get(0)).intValue();
		 */
        
          arr.add(10);  //primitive => object  (Auto boxing) 
         int su=(Integer)arr.get(0);  // 객체 => primitive type    Auto Unboxing 
        
         
         ArrayList<Integer> arr2=new ArrayList<Integer>();
         
         arr2.add(10);
         arr2.add(20);
         arr2.add(30); //boxing
         
         
        int data1=arr2.get(0);  //unboxing        
        int data2=arr2.get(1);
        
        System.out.println(data1+data2);
        
        
        System.out.println(10+new Integer(20));
        
	}

}
