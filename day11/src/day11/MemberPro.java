package day11;

public class MemberPro {
	
	  private MemberDTO[] arr=new MemberDTO[10];
      private int index=0;
      //MemberDTO �迭�� �߰��ϴ� ���
	   public void  memberAdd(String n, int k, int e )  {
		   
		    MemberDTO dto=new MemberDTO(n, k, e);
		    dto.setTot(k+e);
		    dto.setAvg((float)dto.getTot()/2);
		    arr[index]=dto;
		     index=index+1;  // index++;
	   }
	   
	   public void   descSort() {
		   for(int i=0; i<index-1; i++)
		   {
			   for(int j=i+1; j<index; j++)
			   {
				   if(arr[i].getTot() < arr[j].getTot())
				   {
					   MemberDTO imsi;
					   imsi=arr[i];
					   arr[i]=arr[j];
					   arr[j]=imsi;
				   }
			   } //for j
			   
		   } //for i
	   } //descSort
	   
	   public  void  prt() {

		   System.out.println(" �̸� \t ����\t ����\t ����\t ���");
		   for(int i=0; i<index; i++) {
			   MemberDTO dto=arr[i];
			   System.out.printf("%s\t %d \t %d \t %d\t %.2f\n"
					   , dto.getName(), dto.getKor(), dto.getEng(), dto.getTot(), dto.getAvg());

		   }

	   }
}