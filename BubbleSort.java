public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,3,4,6,2,7,8,9,0};
	    int temp;
	    for (int i=0;i<arr.length ;i++ ){
	        for (int j=i+1;j<arr.length ;j++ ){
	            if (arr[i]<arr[j]){
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            } 
	        } 
	    }
	    for(int element:arr){
	        System.out.print(element+",");
	    }
	}
}
