package io1;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 { 
	   public static void main(String[] args) {
		   FileWriter  fw=null;
	      try{
	    	fw=new FileWriter("c:\\msa/hello2.txt");
	    	   fw.write("hello");
	    	   fw.write("만나서 반갑습니다");
	    	   
	    	
	    	  System.out.println("파일 입력 완료!!");
	      }catch(IOException e)
	      {
	    	  System.out.println(e);
	      }finally {
	    	  if(fw!=null) try{fw.close();} catch(IOException e) {System.out.println(e);}
	      }
	}	
}