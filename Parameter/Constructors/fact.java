class fact
{  
 public static void main(String args[])
 {  
  int i,fac=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fac=fac*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fac);    
 }  
}