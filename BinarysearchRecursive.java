public class Main {
    public static int BinSearch(int key,int arr[],int low,int high){
        int mid=(low+high)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return BinSearch(key,arr,low,mid-1);
        }
        if(arr[mid]<key){
            return BinSearch(key,arr,mid+1,high);
        }
        return -1;
    }

	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6,7};
	    int key=5;
	    System.out.print("Element found at index :"+BinSearch(key,arr,0,6));
	
   }
} 
____OUPUT---> Element found at index :4
