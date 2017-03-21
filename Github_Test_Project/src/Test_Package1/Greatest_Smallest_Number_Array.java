package Test_Package1;

public class Greatest_Smallest_Number_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test_arr = {3,34,11,2,46};
		int max=test_arr[0], min=test_arr[0];
		for (int i=1;i<test_arr.length;i++){
			if(test_arr[i]>max){
				max=test_arr[i];
			}
		}
		System.out.println("Greated number in array is: "+max);
		
		for (int j=1;j<test_arr.length;j++){
			if(test_arr[j]<min){
				min=test_arr[j];
			}
		}
		System.out.println("Smallest number in array is: "+min);
		
	}

}
