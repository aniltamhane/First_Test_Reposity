package Test_Package1;

public class fibonacci_number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=10, num1=0, num2=1,num3=0;
		System.out.println("Fibonacci numbers are : ");
		System.out.println(num1);
		for (int i=0;i<count;i++){
			num3= num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		
		
	}

}
