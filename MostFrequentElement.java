public class Solution {

	public static void main(String[] args) {
	
		int arr[]= {1,2,2,1,1,3,4,5,1,2,1,1};
		int max=0;
		int element=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}                                                                               //next iteration 2 is present 3 times count is 3 and max is 6 condition false 
			if(count>max) {                                                                      //OUTPUT : element:1 max:6
				max=count;
				element=arr[i];
			}
		}
		System.out.print("element"+":" +element +" max"+":" +max);

	}
}
