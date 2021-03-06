package day16;

import java.util.ArrayList;

public class MemberPro {

	private ArrayList<Person> arrPerson = new ArrayList<Person>();
	// 자료 추가
	// addMember 메서드를 추가하고 자료를 추가하는 메서드
	
	public void addMember(Person p1) {
		arrPerson.add(p1);
	}
	
	// addMember 메서드에서 추가받은 값으로 객체 생성 후 arrPerson에 객체를 저장.
	 public void  addMember(String name, int age) {
  	   arrPerson.add(new Person(name, age));
   }
   
   
   // printAll 메서드를 만들어서 출력하는 메서드 
      public void printAll() {
      	 for(Person p: arrPerson)
      	 {
      		 System.out.println(p.getName()+", "+p.getAge());
      	 }
      }
      
      //print메서드에서는  이름이 같은 자료를 출력하는 메서드 
	
	/*public void print(String name) {
		for (Person p : arrPerson) {
			if (name.equals(p.getName()))
				System.out.println(p.getName() + ", " + p.getAge());
		}
   }
	*/
      
      
      
	 
    //메서드 print  자료를 받아서  해당 자료만 ArrayList로 리턴 하도록 !!!  //45분까지 
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
    // removePerson이란 메서드를 작성하시오.  // 20분까지 ... 
     
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
     
  // modifyPerson 메서드를 구현하시오..   앞에 자료로   뒤에 객체 값으로 변경... 
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

