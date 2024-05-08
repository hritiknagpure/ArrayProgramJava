package Practise;

public class FindLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,3,7,9,4,5};
		         //[9,7,6,5,4,3,2,1]
             //[1,2,3,4,5,6,7,8]
		int temp;
		int k=6;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			if(i==k-1) {
				System.out.println("Kth element present index is: "+arr[i]);
				break;
			}
		}
		
	}

}
