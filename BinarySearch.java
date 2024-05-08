public class Main {
    public static int BinSearch(int key,int arr[]){
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key){
                high=mid-1;
            } 
            else{
                low=mid+1;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6,7};
	    int key=2;
	    System.out.print(BinSearch(key,arr));
	
   }
}
