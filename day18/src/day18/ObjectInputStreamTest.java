package day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./d2.txt"));) {
        	  Object o=ois.readObject();  //������ȭ 
        	 if(o instanceof Person ) {
        		  System.out.println((Person)o);
        	 }else {
        		 System.out.println(" Ŭ������ ��!!");
        	 }
        	  
          }catch(IOException|ClassNotFoundException e) {
        	  System.out.println(e);
          }
	}

}
