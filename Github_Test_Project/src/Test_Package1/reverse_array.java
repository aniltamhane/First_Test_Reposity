package Test_Package1;

public class reverse_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4,10,7};
		int[] arr_reverse = new int[nums.length];
		int i = nums.length, j=0;
		
		while(j<nums.length){
			arr_reverse[i-1] = nums[j];
			i--;
			j++;
		}
				
		for (int k=0; k< arr_reverse.length;k++){
			System.out.println(arr_reverse[k]);
		}
				
	}

}
