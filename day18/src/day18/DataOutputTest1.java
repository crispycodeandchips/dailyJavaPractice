package day18;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("./d1.txt")); ) {
        	      dos.writeDouble(10.2);
        	      dos.writeInt(10); 
        	      dos.writeUTF("�ȳ��ϼ���"); 
        	      dos.writeFloat(10.2f);
        	      System.out.println("������  ���� �Ϸ�!!!!");
        	  
        	   
           }catch(IOException e) {
        	   System.out.println(e);
           }
	}

}