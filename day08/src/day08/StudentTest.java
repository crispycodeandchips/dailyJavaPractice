package day08;

import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input inwon");
		int inwon = Integer.parseInt(sc.nextLine());
		 Student[] insStudent=null;
		if (inwon > 10)
			System.out.println("인원을 잘못 입력했습니다.");
		else {  
		      insStudent=new Student[inwon];
		    for(int i=0; i<inwon; i++)
		    {
		       insStudent[i]=new Student();
		       System.out.println("input name");
		       insStudent[i].setName(sc.nextLine());
		       
		       System.out.println("input kor");
		       int kor=Integer.parseInt(sc.nextLine());
		       insStudent[i].setKor(kor);
		       
		       System.out.println("input eng");
		       int eng=Integer.parseInt(sc.nextLine());
		       insStudent[i].setEng(eng);
		       
		       // tot
		       //avg
		       // if
		    }
		}  //입력화면 
		
		//처리... 
		for(int i=0; i<inwon; i++)
		{
			  int kor=insStudent[i].getKor();
			  int eng=insStudent[i].getEng();
			   insStudent[i].setTot(kor+eng);
			   insStudent[i].setAvg((float)(kor+eng)/2);
			
			/*   switch ((int)(insStudent[i].getAvg()/10)) {
			case value:
				
				break;

			default:
				break;
			}*/
			   
			   if(insStudent[i].getAvg()>=90)
                     insStudent[i].setResult("수");
			   else if(insStudent[i].getAvg()>=80)
				     insStudent[i].setResult("우");
			   else if(insStudent[i].getAvg()>=70)
				     insStudent[i].setResult("미");
			   else if(insStudent[i].getAvg()>=60)
				    insStudent[i].setResult("양");
			   else
				     insStudent[i].setResult("가");
		}
		
		// 정렬
		
		 for(int i=0; i<inwon-1; i++)
		 {
			  for(int j=i+1; j<inwon ;j++)
			  {
				  if(insStudent[i].getTot()<insStudent[j].getTot())
				  {
				  
			      Student imsi=insStudent[i];
			      insStudent[i]=insStudent[j];
			      insStudent[j]=imsi;
				  }
			  }
		 }
		 
		 System.out.println("이름 \t  국어 \t 영어\t  총점 \t   평균  성취도\n");
		 System.out.println("=========================================");
         for(Student s: insStudent) {
             System.out.printf("%s\t %d \t %d \t %d \t %.2f       %s\n"
            		 , s.getName(), s.getKor(), s.getEng(), s.getTot(),
            		   s.getAvg(), s.getResult());	 
        
        	 
         }
		    
		  sc.close();
		 
	}

}
