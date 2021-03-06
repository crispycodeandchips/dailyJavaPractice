package com.keylime.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.keylime.dto.MemberDTO;
import com.keylime.exception.DuplicateException;
import com.keylime.exception.NoDataException;

public class MemberService {
  private List<MemberDTO> arr;
  
  public MemberService() {
	  arr=Collections.synchronizedList(new ArrayList<MemberDTO>());    
  }
  
  public boolean  checkNo(String hakno)  //for ... 
  {
	   boolean result=false;
//	    for(int i=0; i<arr.size(); i++)
//	    {
//	    	if(hakno.equals(arr.get(i).getHakno()))
//	    	{
//	    		result= true;
//	    		break;
//	    	}
//	    }
	   
	   for(MemberDTO data: arr) {
		    if(hakno.equals(data.getHakno()))
		    {
		    	result=true;
		    	break;
		    }
	   }
	   
	    return result;
	    
  }

public boolean memberinsert(MemberDTO memberDTO) throws DuplicateException{
	// TODO Auto-generated method stub
	/*    memberDTO객체를 받아서  arr추가하는 메서드 
	 *    추가성공  true, 추가 실패 false
	 * 
	 */
	  if(checkNo(memberDTO.getHakno())) {
		   throw new DuplicateException();
	  }
//	  boolean result=arr.add(memberDTO);
//	return result;

   return arr.add(memberDTO);
}

public List<MemberDTO>  getList(){
	  return arr;
}
   
public  MemberDTO searchData(String hakno) throws NoDataException
{
	     for(MemberDTO dto: arr) {
	    	  if(dto.getHakno().equals(hakno)) 
	    	  {
	    		   return  dto;
	    	  }
	     }
         throw new NoDataException();	
	 
}
/*
 *   arr에서 각 요소에서 hakno을 찾아서 그 자료를 삭제하는 메서드 
 * 
 * 
 */
public boolean deleteMember(String hakno) {
	// TODO Auto-generated method stub
	boolean result=false;  
	for(MemberDTO dto: arr)
	   {
		   if(dto.getHakno().equals(hakno)) {
			   arr.remove(dto);
			   result=true;
			   break;
		   }
			   
	   }
	
	return result;
}

public MemberDTO modifyData(String hakno, int age)  throws NoDataException
{
	// TODO Auto-generated method stub
//	  MemberDTO result=new MemberDTO("","",0);
//	  for(MemberDTO dto:arr)
//	  {
//		  if(dto.getHakno().equals(hakno))
//		  {
//			    dto.setAge(age);
//			    result=dto;
//			    break;
//		  }
//	  }
//	
//	
//	return result;

	  for(MemberDTO dto:arr)
		  {
			  if(dto.getHakno().equals(hakno))
			  {
				    dto.setAge(age);
				    return dto;
			  }
		  }
	     throw new NoDataException();  
    }

}
