package io1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 { 
	   public static void main(String[] args) {
		   FileWriter  fw=null;
	      try{
	    	fw=new FileWriter("c:\\msa/hello2.txt");
	    	   fw.write("hello");
	    	   fw.write("������ �ݰ����ϴ�");
	    	   
	    	
	    	  System.out.println("���� �Է� �Ϸ�!!");
	      }catch(IOException e)
	      {
	    	  System.out.println(e);
	      }finally {
	    	  if(fw!=null) try{fw.close();} catch(IOException e) {System.out.println(e);}
	      }
	}	
}