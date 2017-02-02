package Test_Package1;

public class Test_class_github {
	
	
	public void palindrome_number(){
		int r,sum=0,temp;    
		  int n=101; //It is the number variable to be checked for Palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  } 
		  if(temp==sum) {   
		   System.out.println("Palindrome number");
		  }
		  else    
		  {
			  System.out.println("Not palindrome");    
		  }
		 
		
	} 
	
	public void number_of_chars(){
		String test = "anilaopooi";
		int count = 0;
	//	char c;
		
		for (char i='a';i<='z';i++){
			count = 0;
			for(int j=0;j<test.length();j++){
			//	c = test.charAt(j);
				if(i == test.charAt(j)){
					count++;
							
				}
			}
			if (count != 0){
				System.out.println(i + " is repeated " + count +" times");
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
		
		Test_class_github num_char = new Test_class_github();
		num_char.number_of_chars();
		num_char.palindrome_number();
	}
}
