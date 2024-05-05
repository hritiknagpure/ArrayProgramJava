public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,3,4,6,2,7,8,9,0};
	    int temp;
	    for (int i=0;i<arr.length ;i++ ){
	        for (int j=i+1;j<arr.length ;j++ ){
	            if (arr[i]>arr[j]){
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            } 
	        } 
	    }
    System.out.println("Second smallest num is : "+arr[1]);
	    for(int element:arr){
	        System.out.print(element+",");
	    }
	}
}

_____output_______
Second smallest num is : 1
0,1,2,3,4,6,7,8,9,
