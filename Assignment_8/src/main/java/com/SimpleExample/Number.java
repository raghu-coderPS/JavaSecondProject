package com.SimpleExample;

public class Number {
	public boolean prime(int x) throws Exception {
		if(x < 0 ) throw new Exception("negative value");

		 boolean flag=true;
			for(int i=2;i<=x/2;i++) {
			 if(x%i==0) {
			 flag=false;
			 break;
			 }
			}
			  return flag;
		 
		 }
	public boolean amstrong(int x) {
		int c=0,a,temp;  
	    temp=x;  
	    while(x>0)  
	    {  
	    a=x%10;  
	    x=x/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	          return true;
	    else  
	        return false;  
	   }  
		
	public boolean polindrome(int x) {
		 int r,sum=0,temp;
		  temp=x;    
		  while(x>0){    
		   r=x%10; 
		   sum=(sum*10)+r;    
		   x=x/10;    
		  }    
		  if(temp==sum)    
		   return true;  
		  else    
		   return false;
	}

}
