package Test_Package1;



public class Test_class_github {
	
	
	public void palindrome_number(){
		int r,sum=0,temp;    
		  int n=102; //It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		   
		  if(temp==sum) {   
		   System.out.println("Palindrome number ");
		  }
		  else    
		  {
			  System.out.println("Not palindrome");    
		  }
		 }
		
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4,sum=0;
		
		for(int i=0;i<=a;i++){
			sum=sum+i;
			System.out.println(sum);
		}
		
	}
}
