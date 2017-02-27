package Test_Package1;

import java.util.Scanner;

//Author : Anil

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = input1.nextInt();
		
		int r, sum = 0, temp=num;
		
		while (num > 0){
			r = num%10;
			sum = sum + ( r*r*r);
			num = num/10;
		}
		
		if (sum == temp){
			System.out.println("Number is armstrong number");
		}
		else{
			System.out.println("Not an armstrong number");
		}
	}

}
