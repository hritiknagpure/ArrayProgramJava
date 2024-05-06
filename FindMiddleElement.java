public class Solution
{
	public static void main(String[] args) {
	   String[] arr={"Apple","mango","banana"};
	   int len=arr.length;
	   if(len%2==1){
	       System.out.print("Middle element is"+arr[len/2]);
	   }
	   else{
	      int mid=len/2;
	       System.out.print("middle element is :"+arr[mid-1]+" "+arr[mid]);
	   }
	   
	}
}
