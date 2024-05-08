public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,6,3,7,9,4,5};
		//sorted arr=9,7,6,5,4,3,2,1
		
		int temp;
		int k=3;
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
		}   //For k largest Element print
		for(int i=0;i<k;i++){ 
		    System.out.print(arr[i]+" ");
		}
		
	}

} 
↓↓↓↓↓↓↓↓↓↓↓ OUTPUT ↓↓↓↓↓↓↓↓↓↓↓↓↓↓
Kth element present index is: 6
9 7 6
