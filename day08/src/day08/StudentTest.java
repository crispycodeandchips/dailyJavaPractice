package day08;

import java.util.Scanner;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input inwon");
		int inwon = Integer.parseInt(sc.nextLine());
		 Student[] insStudent=null;
		if (inwon > 10)
			System.out.println("�ο��� �߸� �Է��߽��ϴ�.");
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
		}  //�Է�ȭ�� 
		
		//ó��... 
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
                     insStudent[i].setResult("��");
			   else if(insStudent[i].getAvg()>=80)
				     insStudent[i].setResult("��");
			   else if(insStudent[i].getAvg()>=70)
				     insStudent[i].setResult("��");
			   else if(insStudent[i].getAvg()>=60)
				    insStudent[i].setResult("��");
			   else
				     insStudent[i].setResult("��");
		}
		
		// ����
		
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
		 
		 System.out.println("�̸� \t  ���� \t ����\t  ���� \t   ���  ���뵵\n");
		 System.out.println("=========================================");
         for(Student s: insStudent) {
             System.out.printf("%s\t %d \t %d \t %d \t %.2f       %s\n"
            		 , s.getName(), s.getKor(), s.getEng(), s.getTot(),
            		   s.getAvg(), s.getResult());	 
        
        	 
         }
		    
		  sc.close();
		 
	}

}