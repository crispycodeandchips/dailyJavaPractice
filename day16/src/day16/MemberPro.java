package day16;

import java.util.ArrayList;

public class MemberPro {

	private ArrayList<Person> arrPerson = new ArrayList<Person>();
	// �ڷ� �߰�
	// addMember �޼��带 �߰��ϰ� �ڷḦ �߰��ϴ� �޼���
	
	public void addMember(Person p1) {
		arrPerson.add(p1);
	}
	
	// addMember �޼��忡�� �߰����� ������ ��ü ���� �� arrPerson�� ��ü�� ����.
	 public void  addMember(String name, int age) {
  	   arrPerson.add(new Person(name, age));
   }
   
   
   // printAll �޼��带 ���� ����ϴ� �޼��� 
      public void printAll() {
      	 for(Person p: arrPerson)
      	 {
      		 System.out.println(p.getName()+", "+p.getAge());
      	 }
      }
      
      //print�޼��忡����  �̸��� ���� �ڷḦ ����ϴ� �޼��� 
	
	/*public void print(String name) {
		for (Person p : arrPerson) {
			if (name.equals(p.getName()))
				System.out.println(p.getName() + ", " + p.getAge());
		}
   }
	*/
      
      
      
	 
    //�޼��� print  �ڷḦ �޾Ƽ�  �ش� �ڷḸ ArrayList�� ���� �ϵ��� !!!  //45�б��� 
     public ArrayList<Person>  print(String name) {
  	     ArrayList<Person> result=new ArrayList<Person>();
  	   
  	      for(Person p: arrPerson) {
  	    	    if(p.getName().equals(name))
  	    	    {
  	    	    	result.add(p);
  	    	    }
  	      }
  	     return result;
     }
    // removePerson�̶� �޼��带 �ۼ��Ͻÿ�.  // 20�б��� ... 
     
	/*
	 * public boolean removePerson(Person ins) { for(int i=0; i<arrperson.size();
	 * i++) { Person p= arrperson.get(i); if(p.getName().equals(ins.getName())&&
	 * p.getAge()== ins.getAge()) { arrperson.remove(i); // result= true; return
	 * true; } } return false; }
	 */       
 
    public boolean removePerson(Person ins) {
  	  
  	  for(Person p: arrPerson) {
  		  if(p.getName().equals(ins.getName()) && p.getAge()==ins.getAge())
  		  {
  			    arrPerson.remove(p);
  			    return true;
  		  }
  		  
  	  }
  	  
  	  return false;
  	  
    } //removePerson
     
  // modifyPerson �޼��带 �����Ͻÿ�..   �տ� �ڷ��   �ڿ� ��ü ������ ����... 
    public  boolean modifyPerson(Person o, Person n) {
  	    for(int i=0; i<arrPerson.size(); i++) {
  	    	 Person p= arrPerson.get(i);
  	    	 if(p.getName().equals(o.getName()) && p.getAge()==o.getAge()) {
  	    		arrPerson.set(i, n);
  	    	     return true;
  	    	 } //if
  	    } //for
  	    return false;
    }
}
