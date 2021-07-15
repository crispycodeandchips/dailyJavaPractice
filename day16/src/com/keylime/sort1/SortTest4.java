package com.keylime.sort1;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<PersonDTO> arr=new ArrayList<PersonDTO>();
        arr.add(new PersonDTO("a2", 10));
        arr.add(new PersonDTO("a1", 5));
        arr.add(new PersonDTO("a3", 20));
        arr.add(new PersonDTO("a5", 12));
        arr.add(new PersonDTO("a4", 25));
        
        for(PersonDTO dto:arr)
        	System.out.println(dto);
        System.out.println("================");

          Collections.sort(arr, new MyCompare());
          
          
         for(PersonDTO dto:arr)
               System.out.println(dto);
        	 
	}
}
