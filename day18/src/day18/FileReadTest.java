package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try(BufferedReader br=new BufferedReader(new FileReader("./hello.txt"));) {
    	      String str=null;
    	      while((str= br.readLine()) !=null)
    	      {
    	    	  System.out.println(str);
    	      }
    	   
       }catch(IOException e) {
    	   System.out.println(e);
       }
		
	}
}
