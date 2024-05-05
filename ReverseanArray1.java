public class Main
{
	public static void main(String[] args) {
	    int a[]={5,4,3,2,1};
	    int temp;
	    int i=0;
	    int j=a.length-1;
	    while(i<j){
	        temp=a[i];
	        a[i]=a[j];
	        a[j]=temp;
	        i++;
	        j--;
	    }
	    for(int ele:a){
	        System.out.print(ele);
	    }
	}
}
